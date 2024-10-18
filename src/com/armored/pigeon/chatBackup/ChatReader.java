
package com.armored.pigeon.chatBackup;
import com.armored.pigeon.DTO.*;
import com.armored.pigeon.interfaces.dto.*;
import com.armored.pigeon.server.*;
import java.io.*;
import java.util.*;

public class ChatReader {
    private String path;
    private String fileName;
    
    public ChatReader(String friendID, String userName){
        fileName = friendID + ".cht";
        path = ".\\Chat History\\"+userName+"\\";
        
        File f = new File(path);
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    public boolean messagesPresent(){
        File f = new File(path+fileName);
        if(f.exists()){
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Message> getMessages(){
        File inpFile = new File(path+fileName);
        if(!inpFile.exists()) return null;
        ArrayList<Message> messages = new ArrayList<>();
        byte[] inArr = new byte[(int)inpFile.length()];
        try{
            FileInputStream fin = new FileInputStream(path+fileName);
            fin.read(inArr);
            
            messages = (ArrayList<Message>)new APServerUtilities().convertFromBytes(inArr);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return messages;
    }
}
