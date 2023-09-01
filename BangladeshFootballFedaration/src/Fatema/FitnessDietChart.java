/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fatema;

import java.io.Serializable;

/**
 *
 * @author Momo
 */
public class FitnessDietChart implements Serializable  {

 private String Name,Email,Give_Advice ;    

    public FitnessDietChart(String Name, String Email, String Give_Advice) {
        this.Name = Name;
        this.Email = Email;
        this.Give_Advice = Give_Advice;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getGive_Advice() {
        return Give_Advice;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setGive_Advice(String Give_Advice) {
        this.Give_Advice = Give_Advice;
    }

    @Override
    public String toString() {
        return "FitnessDietChart{" + "Name=" + Name + ", Email=" + Email + ", Give_Advice=" + Give_Advice + '}';
    }
 
 
 
}
