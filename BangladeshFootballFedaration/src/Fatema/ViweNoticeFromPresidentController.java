/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Fatema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainpkg.GeneralNotice;

/**
 * FXML Controller class
 *
 * @author Sheepo
 */
public class ViweNoticeFromPresidentController implements Initializable {

    @FXML
    private TextField NoticeViewFxid;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewNoticeButton(ActionEvent event) {
          
         File file = new File("GeneralNotice.bin");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            StringBuilder outputText = new StringBuilder();

            while (true) {
                try {
                    GeneralNotice e = (GeneralNotice) ois.readObject();
                    outputText.append(e.toString()).append("\n");
                   
                } 
                
                catch (ClassNotFoundException e) {
                } catch (IOException e) {
                    break;
                }
            }
            
                      Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                      successAlert.setTitle("Success");
                      successAlert.setHeaderText("Notice");
                      successAlert.setContentText("You have successfully read Notice!");
                      successAlert.showAndWait();
            
            NoticeViewFxid.appendText(outputText.toString());

        } catch (IOException e) {
        }        
    }
 
    @FXML
    private void BackButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MedicalDoctorDashBoard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
    
}
