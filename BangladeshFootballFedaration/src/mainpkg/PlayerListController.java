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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class PlayerListController implements Initializable {
    @FXML
    private TextArea playerlistOutput;
   
    @FXML
    private TextField player1;
    @FXML
    private TextField player2;
     @FXML
    private TextField player3;
      @FXML
    private PasswordField player4;
        @FXML
    private TextField player5;
         @FXML
    private TextField player7;
           @FXML
    private PasswordField player8;
          @FXML
    private TextField player6;
           @FXML
    private TextField player11;
            @FXML
    private TextField player10;
             @FXML
    private TextField player9;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void addPlayer(ActionEvent event) {
        
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("PlayerList.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            Player e = new Player(
                   
                    player1.getText(),
                    player2.getText(),
                    player3.getText(),
                    player4.getText(),
                    player5.getText(),
                    player6.getText(),
                    player7.getText(),
                    player8.getText(),
                    player9.getText(),
                    player10.getText(),
                    player11.getText()
                    
                   
                 
                    
                
            );
            oos.writeObject(e);
            
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Add Successful");
        successAlert.setContentText("You have successfully Added!");
        successAlert.showAndWait();

            

        } catch (IOException ex) {
            Logger.getLogger(PlayerListController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(PlayerListController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
       
    }
        
         @FXML
    private void loadPlayerBtn(ActionEvent event) {
        playerlistOutput.clear();
         File file = new File("PlayerList.bin");

        try (FileInputStream fis = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            StringBuilder outputText = new StringBuilder();

            while (true) {
                try {
                    Player e = (Player) ois.readObject();
                    outputText.append(e.toString()).append("\n");
                    
                } 
                
                catch (ClassNotFoundException e) {
                } catch (IOException e) {
                    break;
                }
            }

                      Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                      successAlert.setTitle("Success");
                      successAlert.setHeaderText("Player List");
                      successAlert.setContentText("You have successfully load player list!");
                      successAlert.showAndWait();
            
            
            
            playerlistOutput.appendText(outputText.toString());

        } catch (IOException e) {
        }
        
        
    }

    
    
    

    @FXML
    private void backtoHomepresident(ActionEvent event) throws IOException {
        
           FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PresidentDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
        
        
        
        
        
    }

    @FXML
    private void cleardata(ActionEvent event) {
        playerlistOutput.clear();
    }

   
        
        
    }
    

