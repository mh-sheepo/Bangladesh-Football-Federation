/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.EOFException;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ManageEmployeController implements Initializable {

    @FXML
    private TableView<Employee> employeListTable;
    @FXML
    private TableColumn<Employee,String> employeName;
    @FXML
    private TableColumn<Employee,String> employeUID;
    @FXML
    private TableColumn<Employee,String> employeSallary;
    @FXML
    private TableColumn<Employee,String> employeNID;
    @FXML
    private TableColumn<Employee,String> employeDOJ;
    @FXML
    private TableColumn<Employee,String> employeDesignation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        employeName.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
        employeUID.setCellValueFactory(new PropertyValueFactory<Employee,String>("uid"));
        employeSallary.setCellValueFactory(new PropertyValueFactory<Employee,String>("salary"));
        employeNID.setCellValueFactory(new PropertyValueFactory<Employee,String>("nid"));
        employeDOJ.setCellValueFactory(new PropertyValueFactory<Employee,String>("doj"));
        employeDesignation.setCellValueFactory(new PropertyValueFactory<Employee,String>("designation"));
        
        
        
        
        
        
        
    }    

   @FXML
private void loademp(ActionEvent event) {
    ObjectInputStream ois = null;
    
    try {
        ois = new ObjectInputStream(new FileInputStream("Employee.bin"));
        
        Employee s;
        while ((s = (Employee) ois.readObject()) != null) {
            employeListTable.getItems().add(s);
        }
    } catch (EOFException eofEx) {
        // This exception will be thrown when the end of the file is reached
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        if (ois != null) {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
    private void addempfxid(ActionEvent event) throws IOException {
        
          FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AddEmployee.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
    }

  
    
}
