/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pranto;

import java.io.Serializable;

/**
 *
 * @author pranto
 */
public class Assessment implements Serializable {
   
    String assessmentContext;
    
    
    //A Constructure is fired with the same name of the object
    public Assessment(String assessmentContext) {
        this.assessmentContext = assessmentContext;
    }
    
    

    public String getAssessmentContext() {
        return assessmentContext;
    }

    public void setAssessmentContext(String assessmentContext) {
        this.assessmentContext = assessmentContext;
    }

}