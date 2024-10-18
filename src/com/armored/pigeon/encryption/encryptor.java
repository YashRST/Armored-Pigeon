
package com.armored.pigeon.encryption;
//import com.armored.pigeon.exceptions.*;
import java.security.*;
import javax.crypto.Cipher;

public class encryptor {
    public byte[] encrypt(byte[] dataBytes,PublicKey publicKey)
{
byte[] encryptedMessageBytes=null;
try
{
Cipher encryptCipher = Cipher.getInstance("RSA");
encryptCipher.init(Cipher.ENCRYPT_MODE, publicKey);
encryptedMessageBytes = encryptCipher.doFinal(dataBytes);
}catch(Exception e)
{
System.out.println("EXCPETION \n CLASS: encryptor\n FUNCITON: encrypt(publicKey)\n"+e);
}
return encryptedMessageBytes;
}
public byte[] encrypt(byte[] dataBytes,PrivateKey privateKey)
{
byte[] encryptedMessageBytes=null;
try
{
Cipher encryptCipher = Cipher.getInstance("RSA");
encryptCipher.init(Cipher.ENCRYPT_MODE,privateKey);
encryptedMessageBytes = encryptCipher.doFinal(dataBytes);
}catch(Exception e)
{
System.out.println("EXCPETION \n CLASS: encryptor\n FUNCITON: encrypt(privateKey)\n"+e);
}
return encryptedMessageBytes;
}

}
