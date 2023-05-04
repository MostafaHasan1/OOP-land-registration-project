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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class GovernmentOfficialSignUpSceneController implements Initializable {

    @FXML
    private TextField nameTxtF;
    @FXML
    private TextField phnNumTxtF;
    @FXML
    private TextField nidTxtF;
    @FXML
    private TextField dvisionTxtF;
    @FXML
    private TextField mailTxtF;
    @FXML
    private TextField passTxtF;
    @FXML
    private DatePicker datePker;
    @FXML
    private TextField idTxtF;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void submitButtonClick(ActionEvent event) throws IOException {
        if(nameTxtF.getText().isEmpty() && passTxtF.getText().isEmpty() && phnNumTxtF.getText().isEmpty() && idTxtF.getText().isEmpty()||
          datePker.getValue().toString().isEmpty() && dvisionTxtF.getText().isEmpty() && mailTxtF.getText().isEmpty() && 
          nidTxtF.getText().isEmpty()){
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setTitle("Signup status");
        a.setContentText("Fill up all the Text Fields");
        a.setHeaderText(null);
        a.showAndWait();
        
     }else{
        /*File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;  
        try {
            f = new File("GovernmentOfficialsMainData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            GOVofficials g = new GOVofficials(
                nameTxtF.getText(),idTxtF.getText(),Integer.parseInt(nidTxtF.getText()),
                mailTxtF.getText(),phnNumTxtF.getText()    
            );
            oos.writeObject(g);

        } catch (IOException ex) {
            Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        // -----------------------------------------------------------------
        
       /* // for reading data from lawyeLoginData binary file          
        File x = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        try {
            x = new File("GovernmentOfficialLoginData.bin");
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
                    System.out.println("Govenment login Data:");
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
        
        }*/
        
        //creating a binary file for login parpose
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;  
        try {
            f = new File("GovernmentOfficialsLoginData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            GOVofficials g = new GOVofficials(
                idTxtF.getText(),
                passTxtF.getText()    
            );
            oos.writeObject(g);

        } catch (IOException ex) {
            Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(LawyerSignupSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
  /*      // -----------------------------------------------------------------
        
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
        */
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
