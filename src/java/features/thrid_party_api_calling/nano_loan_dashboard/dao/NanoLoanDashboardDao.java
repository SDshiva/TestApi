/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.nano_loan_dashboard.dao;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import core.utility.JsonDecoder;
import features.thrid_party_api_calling.nano_loan_dashboard.dto.req.NanoLoanDashboardReq;
import features.thrid_party_api_calling.nano_loan_dashboard.dto.res.NanoLoanDashboardRes;
import org.json.simple.JSONObject;

/**
 *
 * @author fazlerabbikhan
 */
public class NanoLoanDashboardDao {

    public NanoLoanDashboardRes getDashboard(NanoLoanDashboardReq req) {
        NanoLoanDashboardRes res = new NanoLoanDashboardRes();
        try {
            String url = "http://10.11.201.180:8084/nanoloan-adminpannel-api/v1/dashboard/dashboard-data";
            JSONObject json = new JSONObject();
            json.put("userId", req.getUserId());

            System.out.println(json.toJSONString());
            Client restClient = Client.create();
            WebResource webResource = restClient.resource(url);
            ClientResponse resp = null;

            try {
                resp = webResource.accept("application/json")
                        .type("application/json")
                        .header("Authorization", "Bearer " + req.getAuthToken())
                        .header("UserId", req.getUserId()) // or any other value
                        .post(ClientResponse.class, json.toString());
            } catch (ClientHandlerException e) {
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
                    String tREQ = JsonDecoder.getJsonValue(resJson, "tREQ");
                    String tSUC_REQ = JsonDecoder.getJsonValue(resJson, "tSUC_REQ");
                    String tFAIL_REQ = JsonDecoder.getJsonValue(resJson, "tFAIL_REQ");
                    String tDSB_REQ = JsonDecoder.getJsonValue(resJson, "tDSB_REQ");
                    String tREQ_AMT = JsonDecoder.getJsonValue(resJson, "tREQ_AMT");
                    String tDSB_AMT = JsonDecoder.getJsonValue(resJson, "tDSB_AMT");
                    String tDSB_DBT_AMT = JsonDecoder.getJsonValue(resJson, "tDSB_DBT_AMT");
                    String tDSB_CH_AMT = JsonDecoder.getJsonValue(resJson, "tDSB_CH_AMT");
                    String tDSB_VAT_AMT = JsonDecoder.getJsonValue(resJson, "tDSB_VAT_AMT");
                    String fV_REQ = JsonDecoder.getJsonValue(resJson, "fV_REQ");
                    String fV_AUTO = JsonDecoder.getJsonValue(resJson, "fV_AUTO");
                    String fV_MANUAL = JsonDecoder.getJsonValue(resJson, "fV_MANUAL");
                    String fV_PENDING = JsonDecoder.getJsonValue(resJson, "fV_PENDING");
                    String cIB_REQ = JsonDecoder.getJsonValue(resJson, "cIB_REQ");
                    String cIB_VERIFIED = JsonDecoder.getJsonValue(resJson, "cIB_VERIFIED");
                    String cIB_CL = JsonDecoder.getJsonValue(resJson, "cIB_CL");
                    String cIB_UCL = JsonDecoder.getJsonValue(resJson, "cIB_UCL");
                    String cIB_PENDING = JsonDecoder.getJsonValue(resJson, "cIB_PENDING");

                    res.setOutCode(outCode);
                    res.setOutMessage(outMessage);
                    res.settREQ(tREQ);
                    res.settSUC_REQ(tSUC_REQ);
                    res.settFAIL_REQ(tFAIL_REQ);
                    res.settDSB_REQ(tDSB_REQ);

                    res.settREQ_AMT(tREQ_AMT);
                    res.settDSB_AMT(tDSB_AMT);
                    res.settDSB_DBT_AMT(tDSB_DBT_AMT);
                    res.settDSB_CH_AMT(tDSB_CH_AMT);
                    res.settDSB_VAT_AMT(tDSB_VAT_AMT);

                    res.setfV_REQ(fV_REQ);
                    res.setfV_AUTO(fV_AUTO);
                    res.setfV_MANUAL(fV_MANUAL);
                    res.setfV_PENDING(fV_PENDING);

                    res.setcIB_REQ(cIB_REQ);
                    res.setcIB_VERIFIED(cIB_VERIFIED);
                    res.setcIB_CL(cIB_CL);
                    res.setcIB_UCL(cIB_UCL);
                    res.setcIB_PENDING(cIB_PENDING);

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
