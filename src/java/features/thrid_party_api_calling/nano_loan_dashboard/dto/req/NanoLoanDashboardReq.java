/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_dashboard.dto.req;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanDashboardReq {
    private String userId, authToken;

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NanoLoanDashboardReq{" + "userId=" + userId + ", authToken=" + authToken + '}';
    }

    
    
}
