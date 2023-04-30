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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class ChooseUsertypeForSignupController implements Initializable {

    @FXML
    private ComboBox<String> usertypeComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        usertypeComboBox.getItems().addAll(
                "Lawyer","UNO","Buyer", "Seller",
                "Property Owner", "Government Official", 
                "Surveyor", "Bank representative"
        );
    }
    /*private void handleSceneComboBoxAction(ActionEvent event) throws IOException {
        String selectedItem = usertypeComboBox.getSelectionModel().getSelectedItem().toString();
        switch(selectedItem){
            case "Lawyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerSignupScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
    
    
    }    

    
}*/

    @FXML
    private void nextButttonOnClick(ActionEvent event) throws IOException {
        String selectedItem = usertypeComboBox.getSelectionModel().getSelectedItem().toString();
        switch(selectedItem){
            case "Lawyer":
                Parent lawyerMenuList1 = FXMLLoader.load(getClass().getResource("lawyerSignupScene.fxml"));
                Scene lawyerMenuListScene1 = new Scene(lawyerMenuList1);
                Stage lawyerMenuListStage1  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage1.setTitle("Lawyer");
                lawyerMenuListStage1.setScene(lawyerMenuListScene1);
                lawyerMenuListStage1.show();
            case "UNO":
                Parent UNOsignup_Link = FXMLLoader.load(getClass().getResource("UNOSignupScene.fxml"));
                Scene creating_sceneofUNOsignup = new Scene(UNOsignup_Link);
                Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                creating_stage_for_uno.setTitle("UNO singupScene");
                creating_stage_for_uno.setScene(creating_sceneofUNOsignup);
                creating_stage_for_uno.show();
            case "Surveyor":
                Parent surveyorSignUp = FXMLLoader.load(getClass().getResource("SurveyorSignUpScene.fxml"));
                Scene surveyorSignUpScene2 = new Scene(surveyorSignUp);
                Stage surveyorSignUpStage2  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                surveyorSignUpStage2.setTitle("Surveyor");
                surveyorSignUpStage2.setScene(surveyorSignUpScene2);
                surveyorSignUpStage2.show();
            case "Bank representative":
                Parent bankRepesentative = FXMLLoader.load(getClass().getResource("BankRepresentativeSignUpScene.fxml"));
                Scene bankRepesentativeScene2 = new Scene(bankRepesentative);
                Stage bankRepesentativeStage2  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                bankRepesentativeStage2.setTitle("Bank representative");
                bankRepesentativeStage2.setScene(bankRepesentativeScene2);
                bankRepesentativeStage2.show();
        }
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent mainLogin_Link = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
        Scene creating_sceneofmainLogin = new Scene(mainLogin_Link);
        Stage creating_stage_for_mainLogScene  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        creating_stage_for_mainLogScene.setTitle("Land Registration Main Scene");
        creating_stage_for_mainLogScene.setScene(creating_sceneofmainLogin);
        creating_stage_for_mainLogScene.show();
    }
}