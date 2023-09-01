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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Sheepo
 */
public class GiveGeneralNoticeController implements Initializable {

    @FXML
    private TextField noticeid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void backtohome(ActionEvent event) throws IOException {
        
        
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PresidentDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
    }

    @FXML
    private void send(ActionEvent event) {
        
         File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("GeneralNotice.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            GeneralNotice e = new GeneralNotice(
                   
                    noticeid.getText()
  
                
            );
            oos.writeObject(e);
            
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("General Notice");
        successAlert.setContentText("Notice successfully sent to the employee!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(GiveGeneralNoticeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(GiveGeneralNoticeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
   
    }

    @FXML
    private void viewnotice(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ViewNotice.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();

    }
    
}
