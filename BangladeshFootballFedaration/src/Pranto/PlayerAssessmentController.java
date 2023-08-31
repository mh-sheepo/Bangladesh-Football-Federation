/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Pranto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author prant
 */
public class PlayerAssessmentController implements Initializable {

    @FXML
    private TextArea PAssessmenttextarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void PAssessmentBack(ActionEvent event) throws IOException {
        Parent loginScene = FXMLLoader.load(getClass().getResource("FitnessCoachDashboard.fxml"));
        Scene scene2 = new Scene(loginScene);
        Stage stg2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stg2.setScene(scene2);
        stg2.setTitle("BFF-BD");

        stg2.show();
    }

    @FXML
    private void PAssessmentSend(ActionEvent event) {
        File file=new File("assessment.bin");
        FileOutputStream fos= null;
        ObjectOutputStream oos= null;        
            try {
                if (file.exists()) {
                    fos = new FileOutputStream(file, true);
                    oos = new AppendableObjectOutputStream(fos);
                } else {
                    fos = new FileOutputStream(file);
                    oos = new ObjectOutputStream(fos);
                }
                //string
                String container = PAssessmenttextarea.getText();
                
                //Assessment type object
                Assessment newobject = new Assessment(container);
               
                oos.writeObject(newobject);

            } catch (IOException ex) {
                //  Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (oos != null) {
                        oos.close();
                    }
                } catch (IOException ex) {
                    //Logger.getLogger(MainFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            PAssessmenttextarea.clear();
        
        
    }
    
}

//ReadWrite
class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {}
}   