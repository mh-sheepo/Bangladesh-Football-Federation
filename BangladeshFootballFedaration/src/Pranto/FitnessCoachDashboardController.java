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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FitnessCoachDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void logOutfxid(ActionEvent event) throws IOException {
        
         
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/mainpkg/LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
    }

    @FXML
    private void PlayerAssessment(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("PlayerAssessment.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }


    @FXML
    private void Conditioning(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("ConditioningProgram.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void StrengthandPowerDevelopment(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("StrengthAndPowerDevelopment.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void IndividualizedTrainingPrograms(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("IndividualizedTrainingPrograms.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

   
    @FXML
    private void fcViewNotice(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("FcViewNotice.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void ViewInjuryPreventionListButton(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("InjuryPrevention.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }
    
    
    @FXML
    private void DietChart(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("DietChart.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void RecoveryStrategies(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("RecoveryStrategies.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void FlexibilityandMobility(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("FlexibilityandMobility.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }
}