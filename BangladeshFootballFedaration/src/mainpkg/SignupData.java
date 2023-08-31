/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

public class SignupData implements Serializable {
    
      private String newNameId,newEmailId,newPassId,newUserId;

    public SignupData(String newNameId, String newEmailId, String newPassId, String newUserId) {
        this.newNameId = newNameId;
        this.newEmailId = newEmailId;
        this.newPassId = newPassId;
        this.newUserId = newUserId;
    }



    public String getNewNameId() {
        return newNameId;
    }

    public void setNewNameId(String newNameId) {
        this.newNameId = newNameId;
    }

    public String getNewEmailId() {
        return newEmailId;
    }

    public void setNewEmailId(String newEmailId) {
        this.newEmailId = newEmailId;
    }

    public String getNewPassId() {
        return newPassId;
    }

    public void setNewPassId(String newPassId) {
        this.newPassId = newPassId;
    }

    public String getNewUserId() {
        return newUserId;
    }

    public void setNewUserId(String newUserId) {
        this.newUserId = newUserId;
    }

    
    @Override
    public String toString() {
      return "SignupData{\n" +
            "newNameId=" + newNameId + "\n" +
            "newEmailId=" + newEmailId + "\n" +
            "newPassId=" + newPassId + "\n" +
            "newUserId=" + newUserId + "\n" +
            "}\n";
}
}

