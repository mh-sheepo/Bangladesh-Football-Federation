/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * 
 */
public class SignupController implements Initializable {

    @FXML
    private PasswordField newPassId;
    @FXML
    private TextField newNameId;
    @FXML
    private TextField newUserId;
    @FXML
    private TextField newEmailId;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signuptohome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }

    @FXML
    private void signupButton(ActionEvent event) {
        
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("SignupData.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            SignupData e = new SignupData(
                   
                    newNameId.getText(),
                    newEmailId.getText(),
                    newPassId.getText(),
                    newUserId.getText()
                   
                 
                    
                
            );
            oos.writeObject(e);
            
           
         Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Signup Successful");
        successAlert.setContentText("You have successfully signed up!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
       
      
        
    }

    @FXML
    private void logoTohome(MouseEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
        
    }



    @FXML
    private void getOTP(ActionEvent event) {
        
        
         TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Input Alert");
        dialog.setHeaderText("Enter OTP");
        dialog.setContentText("Please enter the OTP for complete signup.");
     
        Optional<String> result = dialog.showAndWait();
        if(result.isPresent()){
            //you need to write the code to verify OTP for authenticity and open the file 
            showCustomInformationAlert("OTP verified. Thanks! Now click on SignUp button for complete signup process!.");
        }
        else {
            //you need to write the code to perform the actual task 
            showCustomInformationAlert("File opening aborted! ");
        }        
    }
    private void showCustomInformationAlert(String str) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText(str);
        a.showAndWait();         
        
        
        
        
    }
}
   

