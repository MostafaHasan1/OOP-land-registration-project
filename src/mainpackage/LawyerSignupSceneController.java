/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
    //private String id;
    //private String pass;
    
    
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
    private void lawyerSignupButtonOnClick(ActionEvent event) throws IOException {
        
        if(lawyerName.getText().isEmpty() && lawyerEmail.getText().isEmpty() && lawyerPhoneNumber.getText().isEmpty() && lawyerID.getText().isEmpty()||
          lawyerDOJ.getValue().toString().isEmpty() && lawyerDistrict.getText().isEmpty() && lawyerPass.getText().isEmpty() && 
          lawyerDOB.getValue().toString().isEmpty() && lawyerNIDnumber.getText().isEmpty()){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Signup status");
        a.setContentText("Fill up all the Text Fields");
        a.setHeaderText(null);
        a.showAndWait();
        
     }else{
            File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;  
        try {
            f = new File("LawyerMainData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            Lawyer l = new Lawyer(
                lawyerName.getText(),lawyerID.getText(),Integer.parseInt(lawyerNIDnumber.getText()),
                lawyerEmail.getText(),lawyerPhoneNumber.getText()    
            );
            oos.writeObject(l);

        } catch (IOException ex) {
            Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // -----------------------------------------------------------------
        
        // for reading data from lawyeLoginData binary file          
        File x = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            x = new File("LawyerLoginData.bin");
            fis = new FileInputStream(x);
            ois = new ObjectInputStream(fis);
            Lawyer l;
            try{
                //outputTextArea.setText("");
                while(true){
                    //System.out.println("Printing objects.");
                    l = (Lawyer)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    //emp.submitReport();
                    System.out.println("Lawyer Data:");
                    System.out.println(l.ID);
                    System.out.println(l.pass);
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
        
        }
        
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
            Lawyer l = new Lawyer(
                lawyerID.getText(),
                lawyerPass.getText()    
            );
            oos.writeObject(l);

        } catch (IOException ex) {
            Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // -----------------------------------------------------------------
        
        // for reading data from lawyeLoginData binary file          
        File x = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            x = new File("LawyerLoginData.bin");
            fis = new FileInputStream(x);
            ois = new ObjectInputStream(fis);
            Lawyer l;
            try{
                //outputTextArea.setText("");
                while(true){
                    //System.out.println("Printing objects.");
                    l = (Lawyer)ois.readObject();
                    //Object obj = ois.readObject();
                    //obj.submitReport();
                    //emp.submitReport();
                    System.out.println("Lawyer Data:");
                    System.out.println(l.ID);
                    System.out.println(l.pass);
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
    private void backButtononClick(MouseEvent event) throws IOException {
        Parent chooseUsertype_signup = FXMLLoader.load(getClass().getResource("chooseUsertypeForSignup.fxml"));
        Scene chooseUsertype_signupScene = new Scene(chooseUsertype_signup);
        Stage chooseUsertype_signupStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        chooseUsertype_signupStage.setTitle("Welcome to digital land registration platform!");
        chooseUsertype_signupStage.setScene(chooseUsertype_signupScene);
        chooseUsertype_signupStage.show();
    }
    
}
