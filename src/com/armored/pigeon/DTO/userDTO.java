
package com.armored.pigeon.DTO;
import com.armored.pigeon.interfaces.dto.*;
import java.util.*;

public class userDTO implements userDTOInterface
{
String publicKey; // CHANGED FROM INT TO STRING
//int userID;
String loginID;
int password;  // CHANGED FROM STRING TO INT
int desktopId;
String IPAddress;
String name;
String mailID;
//int key;
//boolean firstLogin;
List<Integer> frnds;
private static final long serialVersionUID = 6529787098267757690L;
public userDTO()
{
this.publicKey="";
//this.userID=-1;
this.loginID="";
this.password=-1;         // CHANGED
this.IPAddress="";
this.name="";
this.mailID="";
this.desktopId = -1;
//this.key=0;
//this.firstLogin=true;
//this.frnds=new LinkedList<>();
}

public void setDesktopId(int desktopId){
  this.desktopId = desktopId;
}
public int getDesktopId(){
  return this.desktopId;
}

public void setPublicKey(String publicKey)
{
this.publicKey=publicKey;
}
public String getPublicKey()
{
return this.publicKey;
}

public void setMailID(String mailID)
{
this.mailID=mailID;
}
public String getMailID()
{
return this.mailID;
}

/*
public void setKey(int key)
{
this.key=key;
}
public int getKey()
{
return this.key;
}

public void setFirstLogin(boolean firstLogin)
{
this.firstLogin=firstLogin;
}
public boolean getFirstLogin()
{
return this.firstLogin;
}

public void setUserID(int userID)
{
this.userID=userID;
}
public int getUserID()
{
return this.userID;
}
*/

public void setLoginID(String loginID)
{
this.loginID=loginID;
}
public String getLoginID()
{
return this.loginID;
}

public void setPassword(int password)
{
this.password=password;
}
public int getPassword()
{
return this.password;
}


public void setIPAddress(String IP)
{
this.IPAddress=IP;
}
public String getIPAddress()
{
return this.IPAddress;
}


public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}


public void setFrnList(List<Integer> frnds)
{
this.frnds.addAll(frnds);
}
public List<Integer> getFrnList()
{
return this.frnds;
}


public int hashCode()   // CHANGED, NOW RETURNS DESKTOP_ID
{
return this.desktopId;
}
public int compareTo(userDTOInterface user)
{
if(this.password==user.getPassword()) return 1;
return 0;
}
}

