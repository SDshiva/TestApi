/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_login.dto.req;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanLoginReq {
    private String authUser, userId, password, deviceId, lat, lon, reqFrom;

    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getReqFrom() {
        return reqFrom;
    }

    public void setReqFrom(String reqFrom) {
        this.reqFrom = reqFrom;
    }

    @Override
    public String toString() {
        return "NanoLoanLoginReq{" + "authUser=" + authUser + ", userId=" + userId + ", password=" + password + ", deviceId=" + deviceId + ", lat=" + lat + ", lon=" + lon + ", reqFrom=" + reqFrom + '}';
    }
    
    
}
