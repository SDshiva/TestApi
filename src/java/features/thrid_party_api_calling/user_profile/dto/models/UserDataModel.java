/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features.thrid_party_api_calling.user_profile.dto.models;

/**
 *
 * @author fazlerabbikhan
 */
public class UserDataModel {
    private String name;
    private String mobile;
    private String email;

    @Override
    public String toString() {
        return "UserDataModel{" + "name=" + name + ", mobile=" + mobile + ", email=" + email + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
