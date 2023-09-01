/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Fatema;

import java.io.IOException;
import java.net.URL;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Momo
 */
public class AssistantManagerDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CalledAMeetingWithBFF(ActionEvent event) {
    }

    @FXML
    private void ArrangeEvent(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ArrangeEvent.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void FixedMatchTime(ActionEvent event) throws IOException {
        
       FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FixedMatchtime.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void EventManagement(ActionEvent event) throws IOException {
       
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ArrangeEvent.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }

    @FXML
    private void EnsureRulesAndRegulation(ActionEvent event) {
    }

    @FXML
    private void NoticeMassage(ActionEvent event) {
    }

    @FXML
    private void Feedback(ActionEvent event) {
    }

    private void LogOutFxid(ActionEvent event) {
        
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/mainpkg/LoginPageScene.fxml"));
        Parent loginParent = loader.load();
        
        Scene loginScene = new Scene(loginParent);
        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(loginScene);
        
        primaryStage.show();
    } catch (IOException e) {
    }

    }
    
    
    

    @FXML
    private void ViewNoticeFxid(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViweNoticeFromPresident.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
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
    
}
