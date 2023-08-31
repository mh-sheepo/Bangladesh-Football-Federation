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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Indro
 */
public class SendLegalNoticeToPlayersController implements Initializable {

    @FXML
    private TextField player1;
    @FXML
    private TextField player31;
    @FXML
    private TextField player21;
    @FXML
    private PasswordField player81;
    @FXML
    private TextField player51;
    @FXML
    private TextField player71;
    @FXML
    private TextField player61;
    @FXML
    private PasswordField player111;
    @FXML
    private TextField player101;
    @FXML
    private TextField player91;
    @FXML
    private PasswordField player1111;
    @FXML
    private PasswordField player1121;
    @FXML
    private PasswordField player1131;
    @FXML
    private PasswordField player1141;
    @FXML
    private Button backToHomePage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToHomePageOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("LeagalOfficerDashboard.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show();
    }
    
}
