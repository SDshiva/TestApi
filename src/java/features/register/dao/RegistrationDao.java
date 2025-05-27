/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.register.dao;

import features.register.dto.req.RegistrationReq;
import features.register.dto.res.RegistrationRes;

/**
 *
 * @author fazlerabbikhan
 */
public class RegistrationDao {

    public RegistrationRes register(RegistrationReq request) {
        RegistrationRes response = new RegistrationRes();

        try{
        if (request.getUserName().isEmpty()) {
            response.setOutCode("1");
            response.setOutMessage("Enter User Name");
        }
        else if(request.getEmail().isEmpty()){
            response.setOutCode("1");
            response.setOutMessage("Enter Email");
        }
        else if(request.getPassword().isEmpty()){
            response.setOutCode("1");
            response.setOutMessage("Enter Password");
        }
        else{
            response.setOutCode("0");
            response.setOutMessage("Registration Successful!");
        }
        }catch(Exception e){
            response.setOutCode("1");
            response.setOutMessage("Registration Problem!" + e.toString());
        }
        return response;
    }

}
