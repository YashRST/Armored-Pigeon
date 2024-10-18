package com.armored.pigeon.cache;
import com.armored.pigeon.DTO.*;
import com.armored.pigeon.interfaces.dto.*;
import java.util.*;
import java.io.*;


public class UserCache implements Serializable {
    private String loginId;
    private String desktopId;
    private String userName;
    private String mailID;

    public String getMailID() {
        return mailID;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    private ArrayList<userDTOInterface> friends;
    private ArrayList<userDTO> requests;

    public ArrayList<userDTO> getRequests() {
        if(requests == null) return new ArrayList<>();
        return requests;
    }

    public void setRequests(ArrayList<userDTO> requests) {
        this.requests = requests;
    }
    
    public UserCache(){
        this.loginId = "";
        this.friends = new ArrayList<>();
        this.requests = new ArrayList<>();
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public ArrayList<userDTOInterface> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<userDTOInterface> friends) {
        this.friends.addAll(friends);
    }
    
    public void addFriend(userDTOInterface uDTo){
        friends.add(uDTo); 
    }
    
    public void addRequest(userDTO uDto){
        requests.add(uDto);
    }
    
    public boolean removeFriend(userDTOInterface uDto){
        String lID = uDto.getLoginID();
        boolean flag = false;
        for(userDTOInterface u : friends){
            if(u.getLoginID().equals(lID)){
                flag = true;
                friends.remove(u);
                break;
            }
        }
        return flag;
    }
    
    public void removeRequest(userDTOInterface uDto){
        String id = uDto.getLoginID();
        for(userDTOInterface u : requests){
            if(u.getLoginID().equalsIgnoreCase(id)){
                requests.remove(u);
                break;
            }
        }
    }
}
