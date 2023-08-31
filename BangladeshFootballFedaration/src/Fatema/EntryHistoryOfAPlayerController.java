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
import java.util.ArrayList;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Momo
 */
public class EntryHistoryOfAPlayerController implements Initializable {

    @FXML
    private TextField PlayerNameFxid;
    @FXML
    private TextField AgeFxid;
    @FXML
    private TextArea HistryTextArea;
    @FXML
    private DatePicker DateOfInjuryFxid;
    @FXML
    private DatePicker DateOfCheckupFxid;
    @FXML
    private TextArea ViewDetailsTextArea;


    /**
     * Initializes the controller class.
     * @param url
     * @param rb
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
    private void SaveButton(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("Entry_InJuary_Player.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
           
            EntryHistoryOfPlayer E = new EntryHistoryOfPlayer(
                     
                     Integer.parseInt(AgeFxid.getText()) ,
                     PlayerNameFxid.getText(),
                     HistryTextArea.getText(),
                     DateOfInjuryFxid.getValue(),
                     DateOfCheckupFxid.getValue()
                     
            );

            oos.writeObject(E);

        } catch (IOException ex) {
            Logger.getLogger(EntryHistoryOfAPlayerController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(EntryHistoryOfAPlayerController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Successful!!");
        a.setContentText("new Pokice Case ");
        a.showAndWait();
        
    }

    @FXML
    private void ViewButton(ActionEvent event) {
        
                
        ViewDetailsTextArea.setText("");
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Entry_InJuary_Player.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EntryHistoryOfPlayer Em;
            try {
                ViewDetailsTextArea.setText("");
                while (true) {

                    Em = (EntryHistoryOfPlayer) ois.readObject();

                    ViewDetailsTextArea.appendText(Em.toString());
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
    
}
