
package com.armored.pigeon.DTO;
import java.io.*;

public class APServerOPInitializer implements Serializable{
    String operationCode;
    String msgString;
    private static final long serialVersionUID = 12345L;
    
    public APServerOPInitializer() {
        operationCode ="";
        msgString = "";
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getMsgString() {
        return msgString;
    }

    public void setMsgString(String msgString) {
        this.msgString = msgString;
    }
    
    
}
