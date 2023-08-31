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
public class RevenueDataController implements Initializable {

    @FXML
    private TableView<Finance> revenuerecordsTable;
    @FXML
    private TableColumn<Finance,String> revenuerecords;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     revenuerecords.setCellValueFactory(new PropertyValueFactory<Finance,String>("revenue"));
    }    

    @FXML
    private void view(ActionEvent event) {
        
          
         ObjectInputStream ois = null;
    
    try {
        ois = new ObjectInputStream(new FileInputStream("UpdateFinanceData.bin"));
        Finance s;

        while ((s = (Finance) ois.readObject()) != null) {
            revenuerecordsTable.getItems().add(s);
        }
    } catch (EOFException eof) {
        // End of file reached, no need to handle this exception
    } catch (IOException | ClassNotFoundException ex) {
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
