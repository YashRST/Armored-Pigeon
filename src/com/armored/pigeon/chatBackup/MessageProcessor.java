
package com.armored.pigeon.chatBackup;

import com.armored.pigeon.frames.ChatFrame;
import java.io.*;
import java.util.*;


public class MessageProcessor {
 
    HashMap<String, ArrayList<Message>> messageCache;
    
    public byte[] convertToArray(byte[][] msgByte,int size){
        byte[] msg = new byte[size];
        int i=0;
        for(int j=0;j<msgByte.length;j++){
            for(int k = 0; k < msgByte[j].length; k++){
                msg[i] = msgByte[j][k];
                i++;
            }
        }
        return msg;
    }
    
    public byte[] convertToArray(byte[][] msgArr){
        int len = (msgArr.length-1)*msgArr[0].length + msgArr[msgArr.length-1].length;
        //System.out.println("Convert to array length = "+len);
        byte[] msg = new byte[len];
        int b=0;
        for(int i = 0; i<msgArr.length; i++){
            for(int j=0; j<msgArr[i].length; j++){
                msg[b] = msgArr[i][j];
                b++;
            }
        }
        return msg;
    }
    
    public byte[][] convertToArray(byte[] array){
        int length = array.length;
        int size = length/4086;
        byte[][] msg = new byte[size+1][];
        int k = 0,i=0;
        byte[] data;
        for(i = 0; i < size; i++){
            data = new byte[4086];
            for(int j = 0; j < 4086; j++){
                data[j] = array[k];
                k++;
            }
            msg[i] = data;
        }
        int rem = length - (size * 4086);
        data = new byte[rem];
        for(int j=0;j<rem;j++){
            data[j] = array[k];
            k++;
        }
        msg[i] = data;
        return msg;
    }
    
    public void processMessage(Message message){
        messageCache = ChatFrame.messageCache;
        String type = message.getType();
        System.out.println("In processMessage");
        if(type.equals("MSG")){
            if(messageCache.containsKey(message.getSender())){
                ArrayList<Message> mes = messageCache.get(message.getSender());
                mes.add(message);
                messageCache.put(message.getSender(), mes);
            }else{
                ChatReader reader = new ChatReader(message.getSender(),message.getReceiver());
                if(reader.messagesPresent()){
                    System.out.println("Messages present addaing again");
                    ArrayList<Message> mes = reader.getMessages();
                    mes.add(message);
                    messageCache.put(message.getSender(), mes);
                }else{
                    System.out.println("Messages not present");
                    ArrayList<Message> msg1 = new ArrayList<>();
                    msg1.add(message);
                    messageCache.put(message.getSender(), msg1);
                }
            }
            
        }else{
            String path = System.getProperty("user.dir")+"\\Downloads\\";
            File file = new File(path);
            if(!file.exists()){
                file.mkdirs();
            }
            try{
                FileOutputStream fout = new FileOutputStream(path + message.getFileName());
                fout.write(message.getFile());
                fout.close();  
                message.setFile(new byte[0]);
            }catch(Exception e){
                e.printStackTrace();
            }
            if(messageCache.containsKey(message.getSender())){
                ArrayList<Message> mes = messageCache.get(message.getSender());
                mes.add(message);
                messageCache.put(message.getSender(), mes);
            }else{
                ChatReader reader = new ChatReader(message.getSender(),message.getReceiver());
                if(reader.messagesPresent()){
                    ArrayList<Message> mes = reader.getMessages();
                    mes.add(message);
                    messageCache.put(message.getSender(), mes);
                }else{
                    ArrayList<Message> msg1 = new ArrayList<>();
                    msg1.add(message);
                    messageCache.put(message.getSender(), msg1);
                }
            }
        }
        
        ChatWriter writer = new ChatWriter(message.getSender(),message.getReceiver());
        writer.backup(messageCache.get(message.getSender()));
    }
    
    public void saveMessage(byte[][] msg, String fileName){
        try{
            String path = "C:\\Users\\HP\\Downloads\\ArmoredPigeon Files\\"+fileName;
            FileOutputStream fout = new FileOutputStream(path);
            for(int i = 0; i< msg.length;i++){
                fout.write(msg[i]);
            }
            fout.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
