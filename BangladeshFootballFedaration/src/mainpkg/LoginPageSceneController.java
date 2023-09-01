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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sheepo
 */
public class LoginPageSceneController implements Initializable {
    
       
    @FXML
    private ComboBox<String> comboBoxUser;
    @FXML
    private PasswordField passwordField;
     
    @FXML
    private Label systemDateLabel;
    @FXML
    private Label systemTimeLabel;

    
    private final String[] users = {"President", "Accountant", "Medical Doctor","Assistant Manager","Coach","Leagal Officer","Referee","Technical Director","Fitness Coach","Football Player"};
    private final String[] passwords = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    @FXML
  

    
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       updateDateTimeLabel();
       comboBoxUser.getItems().addAll("President", "Accountant", "Medical Doctor","Assistant Manager","Coach","Leagal Officer","Referee","Technical Director","Fitness Coach","Football Player");
  
       
    
    
    }    

    @FXML
    private void newusersignup(MouseEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Signup.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }

    @FXML
    private void loginButton(ActionEvent event) throws IOException {
        
         
        String selectedUser = comboBoxUser.getSelectionModel().getSelectedItem();
        String password = passwordField.getText();

        for (int i = 0; i < users.length; i++) {
            if (selectedUser.equals(users[i]) && password.equals(passwords[i])) {
                
               
            String dashboardFXML; // Declare the variable here

            // Determine the appropriate dashboard FXML based on the selected user
            switch (selectedUser) {
                case "President":
                    dashboardFXML = "PresidentDashboard.fxml";
                    break;
                case "Accountant":
                    dashboardFXML = "AccountantDashboard.fxml";
                    break;
                case "Fitness Coach":
                    dashboardFXML = "/Pranto/FitnessCoachDashboard.fxml";
                    break;
                case "Football Player":
                    dashboardFXML = "/Pranto/FootballPlayerDashboard.fxml";
                    break;
                 case "Medical Doctor":
                    dashboardFXML = "/Fatema/MedicalDoctorDashBoard.fxml";
                    break;    
                 case "Assistant Manager":
                    dashboardFXML = "/Fatema/AssistantManagerDashboard.fxml";
                    break;        
                    
                  case "Coach":
                    dashboardFXML = "/Indronil/CoachDashboard.fxml";
                    break;    
                 case "Leagal Officer":
                    dashboardFXML = "/Indronil/LeagalOfficerDashboard.fxml";
                    break;           
                    
                    
                    
                 
                
                default:
                    // Handle the case when the selected user does not match any known user type
        
                    return;
                    
            }
            
             Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("Successfully Login ");
        a.showAndWait();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(dashboardFXML));
            Parent dashboardParent = loader.load();

            Scene dashboardScene = new Scene(dashboardParent);
            Stage sameStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            sameStage.setScene(dashboardScene);

            sameStage.show();
         
            return;
            }
           
        
    
        }
        
    }
    
    
    public void updateDateTimeLabel() {

        DateTimeFormatter setFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        String stringCurrentDateAndTime = currentDateAndTime.format(setFormat);
        systemDateLabel.setText(stringCurrentDateAndTime);
        
        DateTimeFormatter setTimeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime currentTimeOnly = LocalDateTime.now();
        String stringCurrentTime = currentTimeOnly.format(setTimeFormat);
        systemTimeLabel.setText(stringCurrentTime);
    }

    @FXML
    private void exitButton(ActionEvent event) {
        System.exit(0);
    }

    private void showNotification(String login_Failed, String invalid_username_or_password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
    
    
    
    
}
