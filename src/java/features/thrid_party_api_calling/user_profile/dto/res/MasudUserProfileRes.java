/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.user_profile.dto.res;

import features.thrid_party_api_calling.user_profile.dto.models.UserDataModel;
import java.util.List;

/**
 *
 * @author fazlerabbikhan
 */
public class MasudUserProfileRes {
    private String outMessage;
    private List<UserDataModel> data;

    @Override
    public String toString() {
        return "MasudUserProfileRes{" + "outMessage=" + outMessage + ", data=" + data + ", outCode=" + outCode + '}';
    }
    private String outCode;

    public String getOutMessage() {
        return outMessage;
    }

    public void setOutMessage(String outMessage) {
        this.outMessage = outMessage;
    }

    public List<UserDataModel> getData() {
        return data;
    }

    public void setData(List<UserDataModel> data) {
        this.data = data;
    }

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode;
    }
    
    
}
