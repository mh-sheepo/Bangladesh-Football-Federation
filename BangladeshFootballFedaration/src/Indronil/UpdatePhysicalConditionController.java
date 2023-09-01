/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Indronil;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Indro
 */
public class UpdatePhysicalConditionController implements Initializable {

    @FXML
    private PasswordField player4;
    @FXML
    private TextField player1;
    @FXML
    private TextField player3;
    @FXML
    private TextField player2;
    @FXML
    private PasswordField player8;
    @FXML
    private TextField player5;
    @FXML
    private TextField player7;
    @FXML
    private TextField player6;
    @FXML
    private PasswordField player11;
    @FXML
    private TextField player10;
    @FXML
    private TextField player9;
    @FXML
    private Button executeTheTeam;
    @FXML
    private PasswordField player111;
    @FXML
    private PasswordField player112;
    @FXML
    private PasswordField player113;
    @FXML
    private PasswordField player114;
    @FXML
    private ListView<?> newTeamList;
    @FXML
    private Button backToHomeScreen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void executeTheTeamOnClick(ActionEvent event) {
    }

    @FXML
    private void backToHomeScreenOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CoachDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void player1OnClick(ActionEvent event) {
    }
    
}
