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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class MainLandregistrationLoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> chooseUsertypeComboBox;
    @FXML
    private TextField loginGmailIdField;
    @FXML
    private PasswordField loginPasswordField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chooseUsertypeComboBox.getItems().addAll(
                // Moktar
                "Lawyer","UNO","Buyer", "Seller",
                "Property Owner", "Government Official", "Surveyor",
                "Bank representative"
        );
    }
    

    @FXML
    private void loginButtonOnClick(ActionEvent event) throws IOException {
        String selectedItem = chooseUsertypeComboBox.getSelectionModel().getSelectedItem().toString();
        switch(selectedItem){
            case "Lawyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "UNO":
                Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                creating_stage_for_uno.setTitle("UNO dashboard");
                creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                creating_stage_for_uno.show();
           /* case "Buyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Buyer":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Seller":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Property Owner":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();
            case "Government Official":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();*/
            case "Surveyor":
                Parent surveyorSignUp = FXMLLoader.load(getClass().getResource("SurveyorsDashboardScene.fxml"));
                Scene surveyorSignUpScene = new Scene(surveyorSignUp);
                Stage surveyorSignUpStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                surveyorSignUpStage.setTitle("Surveyor");
                surveyorSignUpStage.setScene(surveyorSignUpScene);
                surveyorSignUpStage.show();
            case "Bank representative":
                Parent bankDashBoard = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
                Scene bankDashBoardScene = new Scene(bankDashBoard);
                Stage bankDashBoardStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                bankDashBoardStage.setTitle("Bank representative");
                bankDashBoardStage.setScene(bankDashBoardScene);
                bankDashBoardStage.show();
            default :
                 System.out.println("Select your user type");
                          
        }
    }

    @FXML
    private void signupButtonOnClick(MouseEvent event) throws IOException {
        Parent chooseUsertype_signup = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene chooseUsertype_signupScene = new Scene(chooseUsertype_signup);
        Stage chooseUsertype_signupStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        chooseUsertype_signupStage.setTitle("Choose user type for signup");
        chooseUsertype_signupStage.setScene(chooseUsertype_signupScene);
        chooseUsertype_signupStage.show();
    }

    @FXML
    private void forgotPassowrdOnClick(MouseEvent event) {
    }
    
}
