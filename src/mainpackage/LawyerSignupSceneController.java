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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerSignupSceneController implements Initializable {

    @FXML
    private TextField lawyerName;
    @FXML
    private TextField lawyerEmail;
    @FXML
    private TextField lawyerPhoneNumber;
    @FXML
    private TextField lawyerID;
    @FXML
    private TextField lawyerNIDnumber;
    @FXML
    private ComboBox<?> lawyerDivisionCombobox;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton femaleRadioButton;
    @FXML
    private RadioButton otherRadioButton;
    @FXML
    private TextField lawyerDistrict;
    @FXML
    private PasswordField lawyerPass;
    @FXML
    private DatePicker lawyerDOB;
    @FXML
    private TextField lawyerCourtName;
    @FXML
    private DatePicker lawyerDOB1;
    @FXML
    private ComboBox<?> lawyerExperienceYearCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lawyerSignupButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backButtononClick(MouseEvent event) throws IOException {
        Parent chooseUsertype_signup = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene chooseUsertype_signupScene = new Scene(chooseUsertype_signup);
        Stage chooseUsertype_signupStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        chooseUsertype_signupStage.setTitle("Choose user type for signup");
        chooseUsertype_signupStage.setScene(chooseUsertype_signupScene);
        chooseUsertype_signupStage.show();
    }
    
}
