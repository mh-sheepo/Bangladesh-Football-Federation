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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CoachDashboardController implements Initializable {

    @FXML
    private Button makeANewTeam;
    @FXML
    private Button giveFeedbackToPlayers;
    @FXML
    private Button callAMeetingWithBoardMembers;
    @FXML
    private Button scheduleThePractice;
    @FXML
    private Button updatePhysicalCondition;
    @FXML
    private Button callAMeetingWithPlayers;
    @FXML
    private Button callForSpecialTraining;
    @FXML
    private Button callAPressConference;
    @FXML
    private Button logOut;
    @FXML
    private Button viewNotice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makeANewTeamOnClick(ActionEvent event) throws IOException{
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("makeANewTeam.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show();   
         
       
    }

    @FXML
    private void giveFeedbackToPlayersOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("giveFeedbackToPlayers.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show();   
        
        
        
    }

    @FXML
    private void callAMeetingWithBoardMembersOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("callAMeetingWithBoardMembers.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void scheduleThePracticeOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("scheduleThePractice.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void updatePhysicalConditionOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("updatePhysicalCondition.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void callAMeetingWithPlayersOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("callAMeetingWithPlayers.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void callForSpecialTrainingOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("callForSpecialTraining.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void callAPressConferenceOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("callForPressConference.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
    }

    @FXML
    private void logOutOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/mainpkg/LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();  
    }

    @FXML
    private void viewNoticeOnClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("viewNoticeFromPresident.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();  
    }
    
}
