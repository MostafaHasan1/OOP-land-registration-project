/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerDashboardSceneController implements Initializable {

    @FXML    private ListView<String> lawyerEventList;
    @FXML    private Label counterOf_inprogress;
    @FXML    private Label counterOf_inpainding;
    
    String[] LawyerEventList = {"Dashboard", "Cases", "Clint messeages",
                                "Government notices", "Transaction", "Query", "Profile", "Sing out"};
    String selectedListEvent;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lawyerEventList.getItems().addAll(LawyerEventList);
        lawyerEventList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
              selectedListEvent =   lawyerEventList.getSelectionModel().getSelectedItem();
              if(selectedListEvent.equals("Dashboard")){
                  System.out.println("Hi");
              }
            }
            
        });
    }    
    
}
