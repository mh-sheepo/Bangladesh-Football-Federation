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
public class LeagalOfficerDashboardController implements Initializable {

    @FXML
    private Button sendLegalReportToPresident;
    @FXML
    private Button sendLegalNoticeToPlayers;
    @FXML
    private Button forwardLegalInformationToAll;
    @FXML
    private Button callAMeetingWithBoard;
    @FXML
    private Button giveLegalAdviceToPlayers;
    @FXML
    private Button updateLegalDashboardOfPlayers;
    @FXML
    private Button updateTheLegalInformation;
    @FXML
    private Button notifyBoardMembersIndividually;
    @FXML
    private Button logOut;
    @FXML
    private Button ViewNotice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendLegalReportToPresidentOnClick(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("sendLegalReportToPesident.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
        
    }

    @FXML
    private void sendLegalNoticeToPlayersOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("sendLegalNoticeToPlayers.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
    }

    @FXML
    private void forwardLegalInformationToAllOnClick(ActionEvent event) throws IOException{
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("forwardLegalInformationToAll.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
         
    }

    @FXML
    private void callAMeetingWithBoardOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("callAMeetingWithBoard.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
    }

    @FXML
    private void giveLegalAdviceToPlayersOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("giveLegalAdviceToPlayers.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
    }

    @FXML
    private void updateLegalDashboardOfPlayersOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("updateLegalDashboardOfPlayers.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
    }

    @FXML
    private void updateTheLegalInformationOnclick(ActionEvent event) throws IOException{
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("updateTheLegalInformation.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
         
    }

    @FXML
    private void notifyBoardMembersIndividuallyOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("notifyBoardMembersIndividually.fxml"));
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
    private void ViewNoticeOnClick(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
         loader.setLocation(getClass().getResource("viewNoticeFromPresident.fxml"));
         Parent dashboardParent = loader.load();
         
         Scene dashboardScene = new Scene(dashboardParent);
         Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
         sameStage.setScene(dashboardScene);
        
         sameStage.show(); 
    }
    
}
