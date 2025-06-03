/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.utility_bills_wasit.dao;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import core.utility.JsonDecoder;
import features.thrid_party_api_calling.utility_bills_wasit.dto.req.WasitUtilityBillReq;
import features.thrid_party_api_calling.utility_bills_wasit.dto.res.WasitUtilityBillRes;
import org.json.simple.JSONObject;

/**
 *
 * @author fazlerabbikhan
 */
public class WasitUtilityBillDao {

    public WasitUtilityBillRes getBillDetails(WasitUtilityBillReq reqModel) {
        WasitUtilityBillRes res = new WasitUtilityBillRes();
        try {
            String url = "http://10.11.201.52:8080/api-project/v1/billPayment";
            JSONObject json = new JSONObject();
            json.put("token", reqModel.getToken());
            json.put("id", reqModel.getId());
            json.put("billType", reqModel.getBillType());
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
                    //decode
                    //System.out.println("Successful");
                    String output = resp.getEntity(String.class);
                    JSONObject resJson = JsonDecoder.getJson(output);
                    System.out.println(resJson.toString());

                    String outMessage = JsonDecoder.getJsonValue(resJson, "outMessage");
//                String outCode = JsonDecoder.getJsonValue(resJson, "outCode");
                    String amount = JsonDecoder.getJsonValue(resJson, "amount");
                    String billName = JsonDecoder.getJsonValue(resJson, "billName");
                    String date = JsonDecoder.getJsonValue(resJson, "date");
                    res.setOutCode("0");
                    res.setOutMessage(outMessage);
                    res.setBillName(billName);
                    res.setDate(date);

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
