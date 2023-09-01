/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

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
public class CheckDuesController implements Initializable {

    @FXML
    private TableView<Finance> duesTable;
    @FXML
    private TableColumn<Finance,String> dues;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
         dues.setCellValueFactory(new PropertyValueFactory<Finance,String>("dues"));
        
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

    @FXML
    private void View(ActionEvent event) {
        
         ObjectInputStream ois=null;
         try {
            Finance s;
            ois = new ObjectInputStream(new FileInputStream("UpdateFinanceData.bin"));
            s = (Finance) ois.readObject();
            //s.display();
            duesTable.getItems().add(s);
            s = (Finance) ois.readObject(); duesTable.getItems().add(s);            
            
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

   
    
}
