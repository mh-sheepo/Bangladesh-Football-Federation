/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class UpdateFinancePageController implements Initializable {

    @FXML
    private TextField duesamount;
    @FXML
    private TextField name;
    @FXML
    private TextField uid;
    @FXML
    private TextField designation;
    @FXML
    private TextField givensalary;
    @FXML
    private TextField payments;
    @FXML
    private TextField monthlyprofit;
    @FXML
    private TextField lastpayment;
    @FXML
    private TextField taxesamount;
    @FXML
    private TextField revenue;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void update(ActionEvent event) {
        
        
         File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("UpdateFinanceData.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Finance e = new Finance(
           
                    name.getText(),
                    designation.getText(),
                    Integer.parseInt(revenue.getText()),
                    Integer.parseInt(monthlyprofit.getText()),
                    Integer.parseInt(duesamount.getText()),
                    Integer.parseInt(lastpayment.getText()),
                    Integer.parseInt(taxesamount.getText()),
                    Integer.parseInt(uid.getText()),
                    Integer.parseInt(givensalary.getText()),
                    Integer.parseInt(payments.getText())
                  
                    
                   
                   
                 
                    
                
            );
            oos.writeObject(e);
            
           
         Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Signup Successful");
        successAlert.setContentText("You have successfully signed up!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(UpdateFinancePageController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(UpdateFinancePageController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    @FXML
    private void backtohome(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AccountantDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }
    
}
