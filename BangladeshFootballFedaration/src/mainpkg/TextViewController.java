/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class TextViewController implements Initializable {

    @FXML
    private TextArea signupdataOutputTextView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void textview(ActionEvent event) {
        
        signupdataOutputTextView.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Signata.txt");
            sc = new Scanner(f);
            if(f.exists()){
                signupdataOutputTextView.appendText("Content of Emp.txt:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    signupdataOutputTextView.appendText(
                            "newNameId="+tokens[0]
                            +", newEmailId="+tokens[1]
                            +", newPassId="+tokens[2]
                            +", newUserId="+tokens[3]+"\n"                    
                    );
                }
            }
            else 
                signupdataOutputTextView.setText("oops! Emp.txt does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(TextViewController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }
        
        
        
        
    }
    

