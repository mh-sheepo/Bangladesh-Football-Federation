/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Fatema;

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
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainpkg.GeneralNotice;
import mainpkg.GiveGeneralNoticeController;

/**
 * FXML Controller class
 *
 * @author Momo
 */
public class FitnessDietChartController implements Initializable {

    @FXML
    private TextField NameFxid;
    @FXML
    private TextField MailFxid;
    @FXML
    private TextArea AdviceTextAreaFxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ExitButton(ActionEvent event) throws IOException {
        
         FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MedicalDoctorDashBoard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }

    @FXML
    private void SendButton(ActionEvent event) {
        
                
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("SendMassagePlayer.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new Fatema.AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            
            FitnessDietChart F = new FitnessDietChart (
                   
                   NameFxid.getText(),
                    MailFxid.getText(),
                    AdviceTextAreaFxid.getText()    
            );
            oos.writeObject(F);
            
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Send Massage");
        successAlert.setContentText("Massage successfully sent to Player!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(FitnessDietChartController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FitnessDietChartController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @FXML
    private void ViewButton(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewFitnessChart.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();

    }
    
}
