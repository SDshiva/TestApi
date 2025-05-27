/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.register.dto.res;

/**
 *
 * @author fazlerabbikhan
 */
public class RegistrationRes {
    String outCode, outMessage;

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode;
    }

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    @Override
    public String toString() {
        return "RegistrationRes{" + "outCode=" + outCode + ", outMessage=" + outMessage + '}';
    }
    
    
}
