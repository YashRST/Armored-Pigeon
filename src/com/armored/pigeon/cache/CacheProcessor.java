
package com.armored.pigeon.cache;
import com.armored.pigeon.DTO.*;
import com.armored.pigeon.interfaces.dto.*; 
import com.armored.pigeon.server.*;
import java.io.*;
import java.net.*;
import java.util.*;


public class CacheProcessor {
    private String loginId;
    String fileName;
    String path;
    
    public CacheProcessor(String name){
        this.loginId = name;
        this.fileName = name + ".apc";
        this.path = ".\\Cache\\User\\";
        
        File f = new File(path);
        if(!f.exists()){
            f.mkdirs();
        }
    }
    
    public boolean isCachePresent(){
        boolean flag = false;
        File cFile = new File(path+fileName);
        if(cFile.length() != 0){
            flag = true;
        }
        return flag;
    }
    
    public UserCache createCache(String loginId){
        UserCache uCache = new UserCache();
        System.out.println("Generating Cache");
        try{
            Socket socket = APServerConnector.getConnection();
            APServerUtilities apUtil = new APServerUtilities();
            APServerOPInitializer opInit = new APServerOPInitializer();
            APServerPacketSender apSend = new APServerPacketSender(socket);
            APServerPacketReceiver apReceive = new APServerPacketReceiver(socket);
            FileOutputStream fout = new FileOutputStream(path+fileName);
            
            opInit.setOperationCode("DSK005");
            opInit.setMsgString(loginId);
            
            byte[] outArr = apUtil.convertToBytes(opInit);
            int len = outArr.length;
            
            apSend.sendPacketSize(len);
            
            apSend.send(outArr);
            
            int inLen = apReceive.receivePacketSize();
            byte[] inArr = apReceive.receive(inLen);
            ArrayList<userDTOInterface> friendList = (ArrayList<userDTOInterface>)apUtil.convertFromBytes(inArr);
            
            inLen = apReceive.receivePacketSize();
            ArrayList<userDTO>  requests = new ArrayList<userDTO>();
            if(inLen != -1){
                byte[] arr = apReceive.receive(inLen);
                requests = (ArrayList<userDTO>)apUtil.convertFromBytes(arr);
            }
            uCache.setLoginId(loginId);
            uCache.setFriends(friendList);
            uCache.setRequests(requests);
            
            inLen = apReceive.receivePacketSize();
            byte[] info = apReceive.receive(inLen);
            
            userDTO inf = (userDTO)apUtil.convertFromBytes(info);
            uCache.setMailID(inf.getMailID());
            uCache.setUserName(inf.getName());
            uCache.setDesktopId(Integer.toString(inf.getDesktopId()));
            
            byte[] fList = apUtil.convertToBytes(uCache);
            
            fout.write(fList);
            fout.close();
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return uCache;
    }
    
    public UserCache getCache(){
        File inpFile = new File(path+fileName);
        UserCache uCache = null;
        byte[] inArr = new byte[(int)inpFile.length()];
        if(inArr.length == 0){
            System.out.println("Contacting Server and Creating Cache");
            return createCache(loginId);
        }
        try {
            FileInputStream fin = new FileInputStream(path+fileName);
            fin.read(inArr);
            
            APServerUtilities apUtil = new APServerUtilities();
            uCache = (UserCache)apUtil.convertFromBytes(inArr);
            
            fin.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return uCache;
    }
    
    public void updateCache(UserCache uCache){
        try{
            FileOutputStream fout = new FileOutputStream(path+fileName);
            APServerUtilities apUtil = new APServerUtilities();
            byte[] arr = apUtil.convertToBytes(uCache);
            
            fout.write(arr);
            fout.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
