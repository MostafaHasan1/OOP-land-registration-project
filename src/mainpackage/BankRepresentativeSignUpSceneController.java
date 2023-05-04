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
public class BankRepresentativeSignUpSceneController implements Initializable {

    @FXML
    private TextField bankNameText;
    @FXML
    private TextField bankNIDText;
    @FXML
    private TextField bankNumberText;
    @FXML
    private TextField bankIDText;
    @FXML
    private TextField bankEmailText;
    @FXML
    private DatePicker bankDateOB;
    @FXML
    private PasswordField bankPassText;
    @FXML
    private DatePicker bankDateOF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bankSignUpBackButton(ActionEvent event) throws IOException {
        Parent bankSignUpBackParent = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene bankSignUpBack = new Scene(bankSignUpBackParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bankSignUpBack);
        window.show();
    }

    @FXML
    private void bankSignUpButton(ActionEvent event) throws IOException {
      if(bankNameText.getText().isEmpty() || bankNIDText.getText().isEmpty()||bankNumberText.getText().isEmpty() || bankIDText.getText().isEmpty()||
          bankDateOB.getValue().toString().isEmpty() || bankEmailText.getText().isEmpty()||bankPassText.getText().isEmpty() || 
          bankDateOF.getValue().toString().isEmpty()){
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
            g = new File("BankReprensentativeLoginData.bin");
            if(g.exists()){
                fos = new FileOutputStream(g,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(g);
                oos = new ObjectOutputStream(fos);               
            }
            BankReprensentative b = new BankReprensentative(
                bankIDText.getText(),
                bankPassText.getText()    
            );
            oos.writeObject(b);

        } catch (IOException ex) {
            Logger.getLogger(BankRepresentativeSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(BankRepresentativeSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
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
}
