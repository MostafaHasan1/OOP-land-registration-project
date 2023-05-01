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
 * @author Hasan
 */
public class SurveyorSignUpSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void surveyorSignUpBackButton(ActionEvent event) throws IOException {
        Parent surveyorSignUpBackParent = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene surveyorSignUpBack = new Scene(surveyorSignUpBackParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorSignUpBack);
        window.show();
    }
    
}
