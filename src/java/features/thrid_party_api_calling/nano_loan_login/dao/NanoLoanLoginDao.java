/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_login.dao;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import core.utility.JsonDecoder;
import features.thrid_party_api_calling.nano_loan_login.dto.req.NanoLoanLoginReq;
import features.thrid_party_api_calling.nano_loan_login.dto.res.NanoLoanLoginRes;
import org.json.simple.JSONObject;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanLoginDao {

    public NanoLoanLoginRes userLogin(NanoLoanLoginReq req) {
        NanoLoanLoginRes res = new NanoLoanLoginRes();

        try {
            String url = "http://10.11.201.180:8084/nanoloan-adminpannel-api/v1/login/do-login";
            JSONObject json = new JSONObject();
            json.put("authUser", req.getAuthUser());
            json.put("userId", req.getUserId());
            json.put("password", req.getPassword());
            json.put("deviceId", req.getDeviceId());
            json.put("lat", req.getLat());
            json.put("lon", req.getLon());
            json.put("reqFrom", req.getReqFrom());

            System.out.println(json.toJSONString());
            Client restClient = Client.create();
            WebResource webResource = restClient.resource(url);
            ClientResponse resp = null;
            
            try {
                resp = webResource.accept("application/json")
                        .type("application/json")
                        .post(ClientResponse.class, json.toString());
            } catch (ClientHandlerException e) {
                System.out.println(e.toString());
                res.setOutCode("1");
                res.setOutMessage("ClientHandler Server Err!" + e.toString());
            } catch (Throwable e) {
                System.out.println(e.toString());
                res.setOutCode("1");
                res.setOutMessage("Throwable Server Err!" + e.toString());
            }
            
            try {
                System.out.println("Status : " + resp.getStatus());
                System.out.println(resp.getStatus());
                if (resp.getStatus() == 200) {
                    String output = resp.getEntity(String.class);
                    JSONObject resJson = JsonDecoder.getJson(output);
                    System.out.println(resJson.toString());

                    String outCode = JsonDecoder.getJsonValue(resJson, "outCode");
                    String outMessage = JsonDecoder.getJsonValue(resJson, "outMessage");
                    String authToken = JsonDecoder.getJsonValue(resJson, "authToken");
                    String userName = JsonDecoder.getJsonValue(resJson, "userName");
                    String userEmail = JsonDecoder.getJsonValue(resJson, "userEmail");
                    String userMobile = JsonDecoder.getJsonValue(resJson, "userMobile");
                    String userRole = JsonDecoder.getJsonValue(resJson, "userRole");
                    String approverLvl = JsonDecoder.getJsonValue(resJson, "approverLvl");
                    res.setOutCode(outCode);
                    res.setOutMessage(outMessage);
                    res.setAuthToken(authToken);
                    res.setUserName(userName);
                    res.setUserEmail(userEmail);
                    res.setUserMobile(userMobile);
                    res.setUserRole(userRole);
                    res.setApproverLvl(approverLvl);

                } else {
                    res.setOutCode("1");
                    res.setOutMessage("Server Err!");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
                res.setOutCode("1");
                res.setOutMessage("Server Err!" + e.toString());
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            res.setOutCode("1");
            res.setOutMessage("Server Err!" + e.toString());
        }
        return res;
    }

}
