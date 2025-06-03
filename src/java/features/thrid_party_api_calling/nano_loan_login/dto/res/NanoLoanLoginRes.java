/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_login.dto.res;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanLoginRes {
    private String outCode, outMessage, authToken, userName, userEmail, userMobile, userRole, approverLvl;

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

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getApproverLvl() {
        return approverLvl;
    }

    public void setApproverLvl(String approverLvl) {
        this.approverLvl = approverLvl;
    }

    @Override
    public String toString() {
        return "NanoLoanLoginRes{" + "outCode=" + outCode + ", outMessage=" + outMessage + ", authToken=" + authToken + ", userName=" + userName + ", userEmail=" + userEmail + ", userMobile=" + userMobile + ", userRole=" + userRole + ", approverLvl=" + approverLvl + '}';
    }
    
    
}
