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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class UNOSignupSceneController implements Initializable {

    @FXML    private TextField nameTxtF;
    @FXML    private DatePicker dobDatePker;
    @FXML    private TextField NIDnumTxtF;
    @FXML    private TextField IDtxtF;
    @FXML    private RadioButton maleRadioButton;
    @FXML    private RadioButton femaleRadioButton;
    @FXML    private RadioButton otherRadioButton;
    @FXML    private TextField UpazilaTxt;
    @FXML    private TextField mobileNumTxtF;
    @FXML    private DatePicker dojDatepker;
    @FXML    private TextField mailTxtF;
    @FXML    private TextField passTxtF;
    @FXML    private ComboBox<String> divisonComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        divisonComboBox.getItems().addAll(
                "Barisal", "Chattogram", "Dhaka", "Khulna", 
                "Mymensingh", "Rajshahi", "Rangpur", "Sylhet");
    }    

    @FXML
    private void singUpButtonOnClick(ActionEvent event) throws IOException {
        //creating a binary file for login parpose
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;  
        try {
            f = new File("UNoLoginData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            UNO u = new UNO(
                IDtxtF.getText(),
                passTxtF.getText()    
            );
            oos.writeObject(u);

        } catch (IOException ex) {
            Logger.getLogger(UNOSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(UNOSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // -----------------------------------------------------------------
        // for reading data from UNoLoginData binary file          
        File x = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            x = new File("UNoLoginData.bin");
            fis = new FileInputStream(x);
            ois = new ObjectInputStream(fis);
            UNO u;
            try{
                //outputTextArea.setText("");
                while(true){
                    //System.out.println("Printing objects.");
                    u = (UNO)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    //emp.submitReport();
                    System.out.println(u.ID);
                    //outputTextArea.appendText(emp.toString());
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch     
            //outputTextArea.appendText("All objects are loaded successfully...\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
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

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent chooseUsertype_signup = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene chooseUsertype_signupScene = new Scene(chooseUsertype_signup);
        Stage chooseUsertype_signupStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        chooseUsertype_signupStage.setTitle("Choose user type for signup");
        chooseUsertype_signupStage.setScene(chooseUsertype_signupScene);
        chooseUsertype_signupStage.show();
    }
    
}
