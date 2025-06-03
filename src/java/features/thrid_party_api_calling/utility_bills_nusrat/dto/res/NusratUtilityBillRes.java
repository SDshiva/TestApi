/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_nusrat.dto.res;

/**
 *
 * @author fazlerabbikhan
 */
public class NusratUtilityBillRes {
    private String  userId, outCode, outMessage, billNo;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    @Override
    public String toString() {
        return "NusratUtilityBillRes{" + "userId=" + userId + ", outCode=" + outCode + ", outMessage=" + outMessage + ", billNo=" + billNo + '}';
    }
    
    
}
