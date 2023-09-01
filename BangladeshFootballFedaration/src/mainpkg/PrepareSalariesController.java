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
public class PrepareSalariesController implements Initializable {

    @FXML
    private TableColumn<Employee,String> uidSalary;
    @FXML
    private TableColumn<Employee,String> nameSalary;
    @FXML
    private TableColumn<Employee,String> desgSalary;
    @FXML
    private TableColumn<Employee,String> basicSalary;
    @FXML
    private TableColumn<Employee,Float> Salary;
    @FXML
    private TableColumn<Employee,String> payableSalary;
    @FXML
    private TableView<Employee> salaryTable;

    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
        
        uidSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("uid"));
        nameSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("name"));
        desgSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("designation"));
        //basicSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("newPassId"));
        Salary.setCellValueFactory(new PropertyValueFactory<Employee,Float>("salary"));
        //payableSalary.setCellValueFactory(new PropertyValueFactory<Employee,String>("newPassId"));
    
        
        
        
    }    

    @FXML
    private void proccess(ActionEvent event) {
        
       /*ObjectInputStream ois=null;
         try {
            Employee s;
            ois = new ObjectInputStream(new FileInputStream("Employee.bin"));
            s = (Employee) ois.readObject();
            //s.display();
            salaryTable.getItems().add(s);
            s = (Employee) ois.readObject(); salaryTable.getItems().add(s);            
            
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
        */
       
       
       
       ObjectInputStream ois = null;
try {
    ois = new ObjectInputStream(new FileInputStream("Employee.bin"));
    
    while (true) {
        try {
            Employee s = (Employee) ois.readObject();
            if (s == null) {
                break; // Reached end of file
            }
            salaryTable.getItems().add(s);
        } catch (EOFException eofEx) {
            break; // Reached end of file
        }
    }
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
        loader.setLocation(getClass().getResource("AccountantDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();   
        
        
        
        
        
        
        
    }
    
}
