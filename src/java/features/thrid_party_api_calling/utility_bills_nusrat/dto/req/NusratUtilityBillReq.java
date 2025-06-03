/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_nusrat.dto.req;

/**
 *
 * @author fazlerabbikhan
 */
public class NusratUtilityBillReq {
    private String reqCode, billNo, userId, authToken;

    public String getReqCode() {
        return reqCode;
    }

    public void setReqCode(String reqCode) {
        this.reqCode = reqCode;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
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

    @Override
    public String toString() {
        return "NusratUtilityBillReq{" + "reqCode=" + reqCode + ", billNo=" + billNo + ", userId=" + userId + ", authToken=" + authToken + '}';
    }
    
    
}
