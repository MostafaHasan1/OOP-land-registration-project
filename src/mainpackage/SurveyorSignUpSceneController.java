/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class SurveyorSignUpSceneController implements Initializable {

    @FXML
    private TextField survoTextFieldName;
    @FXML
    private TextField survoTextFieldNID;
    @FXML
    private TextField survoTextFieldID;
    @FXML
    private TextField survoTextFieldNumber;
    @FXML
    private DatePicker survoComboFieldDob;
    @FXML
    private TextField survoTextFieldEmail;
    @FXML
    private TextField survoTextFieldAddress;
    @FXML
    private TextField survoTextFieldCity;
    @FXML
    private PasswordField survoTextFieldPass;

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

    @FXML
    private void surveyorSignUpButton(ActionEvent event) throws IOException {
      
     if(survoTextFieldName.getText().isEmpty() || survoTextFieldNID.getText().isEmpty()||survoTextFieldID.getText().isEmpty() || survoTextFieldNumber.getText().isEmpty()||
              survoComboFieldDob.getValue().toString().isEmpty() || survoTextFieldEmail.getText().isEmpty()||survoTextFieldAddress.getText().isEmpty() || 
              survoTextFieldCity.getText().isEmpty()||survoTextFieldPass.getText().isEmpty()){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Signup status");
        a.setContentText("Fill up all the Text Fields");
        a.setHeaderText(null);
        a.showAndWait();
        
     }else{ 
        File g = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;  
        try {
            g = new File("SurveyorLoginData.bin");
            if(g.exists()){
                fos = new FileOutputStream(g,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(g);
                oos = new ObjectOutputStream(fos);               
            }
            Surveyor l = new Surveyor(
                survoTextFieldID.getText(),
                survoTextFieldPass.getText()    
            );
            oos.writeObject(l);

        } catch (IOException ex) {
            Logger.getLogger(SurveyorSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(SurveyorSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                               
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Signup status");
        a.setContentText("Signup Successful");
        a.setHeaderText(null);
        a.showAndWait();
        
        Parent mainLogin_Link = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
        Scene creating_sceneofmainLogin = new Scene(mainLogin_Link);
        Stage creating_stage_for_mainLogScene  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        creating_stage_for_mainLogScene.setTitle("Land Registration Main Scene");
        creating_stage_for_mainLogScene.setScene(creating_sceneofmainLogin);
        creating_stage_for_mainLogScene.show();
            
    }
    }
} 
