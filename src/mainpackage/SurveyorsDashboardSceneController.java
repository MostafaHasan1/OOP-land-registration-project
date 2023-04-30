/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author akash
 */
public class SurveyorsDashboardSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void surveyorSetBoundaraiesButton(ActionEvent event) throws IOException {
        Parent surveyorSetBoundaraiesButtonParent = FXMLLoader.load(getClass().getResource("SurveyorsSetBoundaries.fxml"));
        Scene surveyorSetBoundaraiesButton = new Scene(surveyorSetBoundaraiesButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorSetBoundaraiesButton);
        window.show();   
    }

    @FXML
    private void surveyorGiveAdviceButton(ActionEvent event) throws IOException {
        Parent surveyorGiveAdviceButtonParent = FXMLLoader.load(getClass().getResource("SurveyorsAdviceOnLandInfo.fxml"));
        Scene surveyorGiveAdviceButton = new Scene(surveyorGiveAdviceButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorGiveAdviceButton);
        window.show();          
    }

    @FXML
    private void SurveyorsBackButton(ActionEvent event) throws IOException {
        Parent SurveyorsBackButtonParent = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
        Scene SurveyorsBackButton = new Scene(SurveyorsBackButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(SurveyorsBackButton);
        window.show();   
    }

    @FXML
    private void surveyorsAccountDetailsButton(ActionEvent event) throws IOException {
        Parent surveyorsAccountDetailsButtonParent = FXMLLoader.load(getClass().getResource("SurveyorsAccountDetails.fxml"));
        Scene surveyorsAccountDetailsButton = new Scene(surveyorsAccountDetailsButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorsAccountDetailsButton);
        window.show();   
    }

    @FXML
    private void surveyorClientReqButton(ActionEvent event) throws IOException {
        Parent surveyorClientReqButtonParent = FXMLLoader.load(getClass().getResource("SurveyorsClientRequest.fxml"));
        Scene surveyorClientReqButton = new Scene(surveyorClientReqButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorClientReqButton);
        window.show();   
    }
    
}
