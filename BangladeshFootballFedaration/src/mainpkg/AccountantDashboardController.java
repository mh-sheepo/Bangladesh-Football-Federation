/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
public class AccountantDashboardController implements Initializable {



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logoutButton(ActionEvent event) throws IOException {
          FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("LoginPageScene.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
        
        
    }

    @FXML
    private void chartload(ActionEvent event) throws IOException {
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("SalaryDataChart.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
    }

    @FXML
    private void prepSalaries(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PrepareSalaries.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @FXML
    private void updateFinance(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("UpdateFinance.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
        
    }

    @FXML
    private void checkdues(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("CheckDues.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   

        
        

    }

    @FXML
    private void viewpaymentrecords(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewPaymentsRecords.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   

        
        
        
        
        
    }

    @FXML
    private void paytaxes(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PayTax.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   

        
        
        
        
        
        
        
        
        
    }

    @FXML
    private void monthlyProfit(ActionEvent event) throws IOException {
        
          FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MonthlyProfit.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   

        
        
        
        
    }

    @FXML
    private void TotalRevenue(ActionEvent event) throws IOException {
        
        
          FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("RevenueData.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
        
    }

    
}
