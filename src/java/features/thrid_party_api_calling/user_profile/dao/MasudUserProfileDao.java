/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.user_profile.dao;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import features.thrid_party_api_calling.user_profile.dto.req.MasudUserProfileReq;
import features.thrid_party_api_calling.user_profile.dto.res.MasudUserProfileRes;
import org.json.simple.JSONObject;

/**
 *
 * @author fazlerabbikhan
 */
public class MasudUserProfileDao {

    public MasudUserProfileRes getUserProfile(MasudUserProfileReq req) {
        MasudUserProfileRes res = new MasudUserProfileRes();

        String url = "http://10.11.201.137:8085/api-project/v1/profile";
        
        JSONObject json = new JSONObject();
        json.put("reqCode", req.getReqCode());
        json.put("token", req.getToken());
        json.put("userId", req.getUserId());
        System.out.println(json.toJSONString());
        
        Client restClient = Client.create();
        WebResource webResource = restClient.resource(url);
        ClientResponse resp = null;
        return res;
    }

}
