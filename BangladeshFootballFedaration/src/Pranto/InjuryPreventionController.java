/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pranto;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pranto
 */
public class InjuryPreventionController implements Initializable {

    @FXML
    private TextArea InjuryPreventionTextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void InjuryPreventionSendButton(ActionEvent event) {
    }

    @FXML
    private void InjuryPreventionBackButton(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("FitnessCoachDashboard.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }
    
}
