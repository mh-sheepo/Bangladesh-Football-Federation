/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SalaryDataChartController implements Initializable {

    @FXML
    private BarChart<?, ?> barChart;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private CategoryAxis xAxis;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
          XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.getData().add(new XYChart.Data<String,Number>("Farid",25));
        series.getData().add(new XYChart.Data<String,Number>("Shahed",150));
        series.getData().add(new XYChart.Data<String,Number>("Faria",160));
        series.getData().add(new XYChart.Data<String,Number>("Raihan",200));
        series.setName("Monthly Pay");
     
        
        
        
    }    

    @FXML
    private void tohome(ActionEvent event) throws IOException {
        
            
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AccountantDashboard.fxml"));
        Parent dashboardParent = loader.load();
        
        Scene dashboardScene = new Scene(dashboardParent);
        Stage sameStage = (Stage)((Node)event.getSource()).getScene().getWindow();       
        sameStage.setScene(dashboardScene);
        
        sameStage.show();
    }
    
}
