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
public class FootballPlayerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

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
    private void FPScheduleAndNotice(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("ScheduleAndNotice.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPTrainingSessions(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("TrainingSessions.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPSkillDevelopment(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("SkillDevelopment.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }


    @FXML
    private void FPVideoAnalysis(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("VideoAnalysisComment.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPInjuryPrevention(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("InjuryPreventionList.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPNutritionandHydration(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("NutritionandHydration.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPSalaryStatement(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("SalaryStatement.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }


    @FXML
    private void FPTacticalList(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("TacticalList.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");
        stg2.show();
    }

    @FXML
    private void FPlogOut(ActionEvent event) throws IOException {
        
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/mainpkg/LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
    }
    
}
