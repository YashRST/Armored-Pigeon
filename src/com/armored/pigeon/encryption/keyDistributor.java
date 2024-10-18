
package com.armored.pigeon.encryption;
//import com.armored.pegion.exceptions.*;
import java.security.*;
import java.security.KeyPair.*;
import java.lang.Object.*;

public class keyDistributor {
    private static boolean flag;
static{
flag=false;
}
private keyDistributor(){}

public static keyDistributor generateKeyDistributor()
{
if(!flag)
{
flag=true;
return new keyDistributor();
}
return null;
}

public KeyPair keys()
{
KeyPairGenerator generator=null;
try
{
generator=KeyPairGenerator.getInstance("RSA");
generator.initialize(2048);
}catch(Exception e)
{
System.out.println("EXCEPTION \n CLASS: keyDistributor \nFUNCTION: keys\n "+e);
}
return generator.generateKeyPair();
} // Function Keys ends here

}
