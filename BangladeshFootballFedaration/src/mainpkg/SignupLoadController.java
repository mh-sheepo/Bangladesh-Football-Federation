/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SignupLoadController implements Initializable {
    
    
    

    @FXML
    private TextArea signupdataOutput;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void loadsignup(ActionEvent event) {
         File file = new File("SignupData.bin");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            StringBuilder outputText = new StringBuilder();

            while (true) {
                try {
                    SignupData e = (SignupData) ois.readObject();
                    outputText.append(e.toString()).append("\n");
                   
                } 
                
                catch (ClassNotFoundException e) {
                } catch (IOException e) {
                    break;
                }
            }
                      Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                      successAlert.setTitle("Success");
                      successAlert.setHeaderText("New Signup Data");
                      successAlert.setContentText("You have successfully read signup data!");
                      successAlert.showAndWait();
                      
                      
            signupdataOutput.appendText(outputText.toString());

        } catch (IOException e) {
        }
        
   
    }


    private void tableScene(ActionEvent event) throws IOException {
        
        
        
         
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Test.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
        
        
    }

    @FXML
    private void backtoHomeSignup(ActionEvent event) throws IOException {
        
        
          
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PresidentDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }

    @FXML
    private void cleardata(ActionEvent event) {
         signupdataOutput.clear();
    }

    private void textload(ActionEvent event) throws IOException {
             
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Text view.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void Tableload(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("signupTable.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
        
        
        
        
    }
        
     

    

        
        
        
    }
    

