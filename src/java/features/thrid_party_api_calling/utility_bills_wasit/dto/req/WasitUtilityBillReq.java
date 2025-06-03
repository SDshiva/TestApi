/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_wasit.dto.req;

/**
 *
 * @author fazlerabbikhan
 */
public class WasitUtilityBillReq {
    private String token, id, billType, userId, authToken;

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "WasitUtilityBillReq{" + "token=" + token + ", id=" + id + ", billType=" + billType + ", userId=" + userId + ", authToken=" + authToken + '}';
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }
}
