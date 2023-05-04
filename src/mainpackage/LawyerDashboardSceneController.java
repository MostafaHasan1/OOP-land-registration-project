/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerDashboardSceneController implements Initializable {

    private ListView<String> lawyerEventList;
    @FXML    private Label counterOf_inprogress;
    @FXML    private Label counterOf_inpainding;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void dashboardButtonOnClick(ActionEvent event) throws IOException {
        Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
        Scene lawyerMenuListScene = new Scene(lawyerMenuList);
        Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        lawyerMenuListStage.setTitle("Welcome to Lawyer Dashboard!");
        lawyerMenuListStage.setScene(lawyerMenuListScene);
        lawyerMenuListStage.show();
    }

    @FXML
    private void casesButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void clintMessageButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void governmentNoticesButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void transactionButtonOnlick(ActionEvent event) {
    }

    @FXML
    private void queryButtonOnlick(ActionEvent event) {
    }

    @FXML
    private void profileButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void signoutButtonOnclick(ActionEvent event) {
    }
    
}
