/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author cis101
 */
public class LoginChangeController implements Initializable {

   
    @FXML
    private Label systemDateLabelID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        updateDateTimeLabel();
        // TODO
    }    

    @FXML
    private void goToLogin(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
    }
    
     public void updateDateTimeLabel() {

DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss a");
DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

LocalDateTime currentDateAndTime = LocalDateTime.now();
String formattedTime = currentDateAndTime.format(timeFormat);
String formattedDate = currentDateAndTime.format(dateFormat);

String stringCurrentDateAndTime = formattedTime + "\n" + formattedDate;
systemDateLabelID.setText(stringCurrentDateAndTime);

      
    }
    
}
