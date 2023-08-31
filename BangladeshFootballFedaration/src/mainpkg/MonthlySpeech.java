/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class MonthlySpeech implements Serializable {
    
    private String speech;

    public MonthlySpeech(String speech) {
        this.speech = speech;
    }

    public String getSpeech() {
        return speech;
    }

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @Override
    public String toString() {
        return "MonthlySpeech{" + "speech=" + speech + '}';
    }
    
    
    
    
    
}
