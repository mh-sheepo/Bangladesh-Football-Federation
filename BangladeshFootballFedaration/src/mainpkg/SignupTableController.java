/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SignupTableController implements Initializable {

    @FXML
    private TableColumn<SignupData,String> name;
    @FXML
    private TableColumn<SignupData,String> email;
    @FXML
    private TableColumn<SignupData,String> password;
    @FXML
    private TableColumn<SignupData,String> uid;
    @FXML
    private TableView<SignupData> tableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         uid.setCellValueFactory(new PropertyValueFactory<SignupData,String>("newUserId"));
        name.setCellValueFactory(new PropertyValueFactory<SignupData,String>("newNameId"));
        email.setCellValueFactory(new PropertyValueFactory<SignupData,String>("newEmailId"));
        password.setCellValueFactory(new PropertyValueFactory<SignupData,String>("newPassId"));
    }    

    @FXML
    private void loadTable(ActionEvent event) {
        
         ObjectInputStream ois=null;
         try {
            SignupData s;
            ois = new ObjectInputStream(new FileInputStream("SignupData.bin"));
            s = (SignupData) ois.readObject();
            //s.display();
            tableView.getItems().add(s);
            s = (SignupData) ois.readObject(); tableView.getItems().add(s);            
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
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
    
}
