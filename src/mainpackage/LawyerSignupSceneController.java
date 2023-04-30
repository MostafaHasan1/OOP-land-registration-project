/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerSignupSceneController implements Initializable {

    @FXML    private TextField lawyerName;
    @FXML    private TextField lawyerEmail;
    @FXML    private TextField lawyerPhoneNumber;
    @FXML    private TextField lawyerID;
    @FXML    private TextField lawyerNIDnumber;
    @FXML    private ComboBox<String> lawyerDivisionCombobox;
    @FXML    private RadioButton maleRadioButton;
    @FXML    private RadioButton femaleRadioButton;
    @FXML    private RadioButton otherRadioButton;
    @FXML    private TextField lawyerDistrict;
    @FXML    private PasswordField lawyerPass;
    @FXML    private DatePicker lawyerDOB;
    @FXML    private TextField lawyerCourtName;
    @FXML    private ComboBox<String> lawyerExperienceYearCombobox;
    @FXML    private DatePicker lawyerDOJ;
    
    
    private ToggleGroup tg;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lawyerDivisionCombobox.getItems().addAll(
                "Barisal", "Chattogram", "Dhaka", "Khulna", 
                "Mymensingh", "Rajshahi", "Rangpur", "Sylhet");
        lawyerExperienceYearCombobox.getItems().addAll("1", "2", "3", "4", "5", "6+");
        
        tg = new ToggleGroup();
        maleRadioButton.setToggleGroup(tg);
        femaleRadioButton.setToggleGroup(tg);
        otherRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void lawyerSignupButtonOnClick(ActionEvent event) {
        //creating a binary file for login parpose
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
         try {
            f = new File("LawyerLoginData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Lawyer lawyer = new Lawyer(  
                    lawyerID.getText(),
                    lawyerPass.getText()
                    );
            oos.writeObject(lawyer);
           /*amin*/
            /* idTxt.setText(null);    nameTxt.setText(null);  cgpaTxt.setText(null);  deptTxt.setText(null);*/
            lawyer.display();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
