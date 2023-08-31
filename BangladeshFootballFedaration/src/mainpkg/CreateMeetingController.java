/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CreateMeetingController implements Initializable {

    @FXML
    private TextField speechview;
    @FXML
    private TextField note;
    @FXML
    private DatePicker dateOfmeeting;
    @FXML
    private TextArea viewmeeting;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
    
    
    
    
    
    
    
    

    @FXML
    private void assignmeeting(ActionEvent event) throws IOException {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("MeetingInfo.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Meeting e = new Meeting(
                   
                    speechview.getText(),
                    note.getText(),
                    dateOfmeeting.getValue()
                   
                           
                            
                   
                   
                 
                    
                
            );
            oos.writeObject(e);
            
        Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Meeing");
        successAlert.setContentText("You have successfully assign a meeting!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(CreateMeetingController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CreateMeetingController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
        
        
        
        
        }
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
    private void viww(ActionEvent event) {
        
         File file = new File("MeetingInfo.bin");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            StringBuilder outputText = new StringBuilder();

            while (true) {
                try {
                    Meeting e = (Meeting) ois.readObject();
                    outputText.append(e.toString()).append("\n");
                   
                } 
                
                catch (ClassNotFoundException e) {
                } catch (IOException e) {
                    break;
                }
            }
                      Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                      successAlert.setTitle("Success");
                      successAlert.setHeaderText("Meeting");
                      successAlert.setContentText("You have successfully read meeting information!");
                      successAlert.showAndWait();
                      
                      
            viewmeeting.appendText(outputText.toString());

        } catch (IOException e) {
        }
        
        
        
    }
        
        
        
        
        
        
        
        
        
    }

   

