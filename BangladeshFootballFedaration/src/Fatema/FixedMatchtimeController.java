/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Fatema;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Momo
 */
public class FixedMatchtimeController implements Initializable {

    @FXML
    private TextArea TextFieldArea;
    @FXML
    private DatePicker DatePickerFxid;
    @FXML
    private TextField TimeFxid;
    @FXML
    private TextField PlaceFxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewButton(ActionEvent event) throws IOException { 
                 
        TextFieldArea.setText("");
       
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("FixedMatchtime.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            FixedMatchtime FT;
            try {
                TextFieldArea.setText("");
                while (true) {

                    FT = (FixedMatchtime) ois.readObject();

                    TextFieldArea.appendText(FT.toString());
                }
            } catch (Exception e) {
                //
            }
            //  viewTextField.appendText(" \n");            
        } catch (IOException ex) {
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } 
            
            catch (IOException ex) {
            }
        }
        
    }

    @FXML
    private void SubmitButton(ActionEvent event) { 
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("FixedMatchtime.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
           
            FixedMatchtime F = new FixedMatchtime(

                     PlaceFxid.getText(),
                    Integer.parseInt (TimeFxid.getText()),
                     DatePickerFxid.getValue()
                     
            );

            oos.writeObject(F);

        } catch (IOException ex) {
            Logger.getLogger(FixedMatchtimeController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(FixedMatchtimeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("Notification Send All Empolyee ");
        a.showAndWait();
    }

    @FXML
    private void BackButton(ActionEvent event) throws IOException {
               FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AssistantManagerDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
}
        
       

