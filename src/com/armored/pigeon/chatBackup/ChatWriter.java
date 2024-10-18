
package com.armored.pigeon.chatBackup;
import com.armored.pigeon.interfaces.dto.*;
import com.armored.pigeon.server.*;
import java.io.*;
import java.util.*;


public class ChatWriter {
    private String path;
    private String fileName;
    
    public ChatWriter(String friendID, String user){
        this.fileName = friendID + ".cht";
        this.path = ".\\Chat History\\"+user+"\\";
        
        File f = new File(path);
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    public void backup(ArrayList<Message> messages){
        try{
            FileOutputStream fout = new FileOutputStream(path+fileName);
            APServerUtilities apUtil = new APServerUtilities();
            
            byte[] outArr = apUtil.convertToBytes(messages);
            fout.write(outArr);
            fout.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
