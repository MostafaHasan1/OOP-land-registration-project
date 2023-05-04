/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
    private PasswordField loginPasswordField;
    @FXML
    private TextField loginIDtxtF;
    //private ArrayList<String>idList;
    //private ArrayList<String>passList;

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
        if(selectedItem == "Lawyer"){
                String lawid = loginIDtxtF.getText();
                String lawpass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
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
                        //ArrayList<String> idList = new ArrayList<String>();
                        while(true){
                        
                        //System.out.println("Printing objects.");
                        l = (Lawyer)ois.readObject();
                        String id = l.ID;
                        String pass = l.pass;
                        idList.add(id);
                        passList.add(pass);
                        //System.out.println(idList.size());
                        
                        //idList.add(id);
                        //passList.add(pass);
                        //Object obj = ois.readObject();
                        //obj.submitReport();
                        //emp.submitReport();
                        //if(lawid.equals(l.ID) && lawpass.equals(l.pass)){
                        //   System.out.println("a");
                        //}
                        //System.out.println(id + pass);
                        //System.out.println(l.pass);
                        
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
                }if (lawid.trim().isEmpty() && lawpass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(lawid)&&passList.contains(lawpass)){
                    
                    Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                    Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                    Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    lawyerMenuListStage.setTitle("Welcome to Lawyer Dashboard!");
                    lawyerMenuListStage.setScene(lawyerMenuListScene);
                    lawyerMenuListStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
            
        }else if(selectedItem == "UNO"){
                String unoID = loginIDtxtF.getText();
                String unoPass = loginPasswordField.getText();
                ArrayList<String> unoIDlist = new ArrayList<String>();
                ArrayList<String> unoPassList = new ArrayList<String>();
                File unoX = null;
                FileInputStream unoFis = null;      
                ObjectInputStream unoOis = null;
                try {
                    
                    unoX = new File("UNoLoginData.bin");
                    unoFis = new FileInputStream(unoX);
                    unoOis = new ObjectInputStream(unoFis);
                    UNO u;
                    try{
                        while(true){
                            u = (UNO)unoOis.readObject();
                            String id = u.ID;
                            String pass = u.pass;
                            unoIDlist.add(id);
                            unoPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(unoOis != null) unoOis.close();
                } catch (IOException ex) { }
                }if(unoID.trim().isEmpty() && unoPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login to your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(unoIDlist.contains(unoID)&&unoPassList.contains(unoPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("Welcome to Upazila Nirbahi Officer Dashboard ");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
    } else if(selectedItem == "GovernmentOfficial"){
                String govID = loginIDtxtF.getText();
                String govPass = loginPasswordField.getText();
                ArrayList<String> govIDlist = new ArrayList<String>();
                ArrayList<String> govPassList = new ArrayList<String>();
                File govX = null;
                FileInputStream govFis = null;      
                ObjectInputStream govOis = null;
                try {
                    
                    govX = new File("GOVLoginData.bin");
                    govFis = new FileInputStream(govX);
                    govOis = new ObjectInputStream(govFis);
                    GovernmentOfficial a;
                    try{
                        while(true){
                            a = (GovernmentOfficial)govOis.readObject();
                            String id = a.ID;
                            String pass = a.pass;
                            govIDlist.add(id);
                            govPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                if(govFis != null) govOis.close();
                } catch (IOException ex) {
                }
                
                }if(govID.trim().isEmpty() && govPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                          
                }else if(govIDlist.contains(govID)&&govPassList.contains(govPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("Welcome Upazila Nirbahi Officer Dashboard ");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
                }
                
         }else if(selectedItem == "Surveyor"){
                String survoid = loginIDtxtF.getText();
                String survopass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("SurveyorLoginData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    Surveyor s;
                    try{
                        while(true){
                        s = (Surveyor)ois.readObject();
                        String id = s.ID;
                        String pass = s.pass;
                        idList.add(id);
                        passList.add(pass);
                        }
                    }//end of nested try
                    catch(Exception e){
                    }             
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
                }
                if (survoid.trim().isEmpty() && survopass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Enter Login Data and Please Try Again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(survoid)&&passList.contains(survopass)){
                    Parent SurveyorSignIn = FXMLLoader.load(getClass().getResource("SurveyorsDashboardScene.fxml"));
                    Scene SurveyorSignInScene = new Scene(SurveyorSignIn);
                    Stage SurveyorSignInStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    SurveyorSignInStage.setTitle("Welcome to Surveyor Dashboard!");
                    SurveyorSignInStage.setScene(SurveyorSignInScene);
                    SurveyorSignInStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();

                }
                 
           }else if(selectedItem == "Bank representative"){
                String bankid = loginIDtxtF.getText();
                String bankpass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("BankReprensentativeLoginData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    BankReprensentative b;
                    try{
                        while(true){
                        b = (BankReprensentative)ois.readObject();
                        String id = b.ID;
                        String pass = b.pass;
                        idList.add(id);
                        passList.add(pass);
                        }
                    }//end of nested try
                    catch(Exception e){
                    }             
                } catch (IOException ex) { } 
                finally {
                try {
                    if(ois != null) ois.close();
                } catch (IOException ex) { }
                }
                if (bankid.trim().isEmpty() && bankpass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Enter Login Data and Please Try Again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }else if(idList.contains(bankid)&&passList.contains(bankpass)){
                    Parent BankSignIn = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
                    Scene BankSignInScene = new Scene(BankSignIn);
                    Stage BankSignInStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    BankSignInStage.setTitle("Welcome to Bank Reprensentative Dashboard!");
                    BankSignInStage.setScene(BankSignInScene);
                    BankSignInStage.show();
            
                }
                else {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();             
                }
           } else if(selectedItem == "Government Official"){
                String govID = loginIDtxtF.getText();
                String govPass = loginPasswordField.getText();
                ArrayList<String> govIDlist = new ArrayList<String>();
                ArrayList<String> govPassList = new ArrayList<String>();
                File govX = null;
                FileInputStream govFis = null;      
                ObjectInputStream govOis = null;
                try {
                    
                    govX = new File("GovernmentOfficialsLoginData.bin");
                    govFis = new FileInputStream(govX);
                    govOis = new ObjectInputStream(govFis);
                    GOVofficials g;
                    try{
                        while(true){
                            g = (GOVofficials)govOis.readObject();
                            String id = g.ID;
                            String pass = g.pass;
                            govIDlist.add(id);
                            govPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(govOis != null) govOis.close();
                } catch (IOException ex) { }
                }if(govID.trim().isEmpty() && govPass.trim().isEmpty()){
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(govIDlist.contains(govID)&&govPassList.contains(govPass)){
                    Parent govdashboard_Link = FXMLLoader.load(getClass().getResource("GOVdashboard.fxml"));
                    Scene creating_sceneofgovdashb = new Scene(govdashboard_Link);
                    Stage creating_stage_for_gov  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_gov.setTitle("Welcome to Governmet Official Dashboard ");
                    creating_stage_for_gov.setScene(creating_sceneofgovdashb);
                    creating_stage_for_gov.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again!");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
           }
     
    
        /*switch(selectedItem){
            case "Lawyer":
                /*Lawyer c = new Lawyer(
                loginIDtxtF.getText(),
                loginPasswordField.getText()    
            );*/ 
         /*       String lawid = loginIDtxtF.getText();
                String lawpass = loginPasswordField.getText();
                ArrayList<String> idList = new ArrayList<String>();
                ArrayList<String> passList = new ArrayList<String>();
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
                        //ArrayList<String> idList = new ArrayList<String>();
                        while(true){
                        
                        //System.out.println("Printing objects.");
                        l = (Lawyer)ois.readObject();
                        String id = l.ID;
                        String pass = l.pass;
                        idList.add(id);
                        passList.add(pass);
                        //System.out.println(idList.size());
                        
                        //idList.add(id);
                        //passList.add(pass);
                        //Object obj = ois.readObject();
                        //obj.submitReport();
                        //emp.submitReport();
                        //if(lawid.equals(l.ID) && lawpass.equals(l.pass)){
                        //   System.out.println("a");
                        //}
                        //System.out.println(id + pass);
                        //System.out.println(l.pass);
                        
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
                if (lawid.trim().isEmpty() && lawpass.trim().isEmpty()) {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Provide your data to login your Dashboard");
                    a.setHeaderText(null);
                    a.showAndWait();
                }/* else {
                    Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                    Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                    Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    lawyerMenuListStage.setTitle("Lawyer");
                    lawyerMenuListStage.setScene(lawyerMenuListScene);
                    lawyerMenuListStage.show();
                }*/
                /*if(idList.contains(lawid)&&passList.contains(lawpass)){
                    Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                    Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                    Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    lawyerMenuListStage.setTitle("Lawyer");
                    lawyerMenuListStage.setScene(lawyerMenuListScene);
                    lawyerMenuListStage.show();
                }if else(lawid==null && lawpass==null){
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password. Please try again");
                    a.setHeaderText(null);
                    a.showAndWait();
                }*/
                    
                
                
      /*      case "UNO":
                String unoID = loginIDtxtF.getText();
                String unoPass = loginPasswordField.getText();
                ArrayList<String> unoIDlist = new ArrayList<String>();
                ArrayList<String> unoPassList = new ArrayList<String>();
                File unoX = null;
                FileInputStream unoFis = null;      
                ObjectInputStream unoOis = null;
                try {
                    
                    unoX = new File("UNoLoginData.bin");
                    unoFis = new FileInputStream(unoX);
                    unoOis = new ObjectInputStream(unoFis);
                    UNO u;
                    try{
                        while(true){
                            u = (UNO)unoOis.readObject();
                            String id = u.ID;
                            String pass = u.pass;
                            unoIDlist.add(id);
                            unoPassList.add(pass);
                        }
                   
                    }//end of nested try
                    catch(Exception e){
                    //
                    }//nested catch     
                 
                    //outputTextArea.appendText("All objects are loaded successfully...\n");            
                } catch (IOException ex) { } 
                finally {
                try {
                    if(unoOis != null) unoOis.close();
                } catch (IOException ex) { }
                }
                if(unoIDlist.contains(unoID)&&unoPassList.contains(unoPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("UNO dashboard");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
                }else{
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Login status");
                    a.setContentText("Incorrect username or password");
                    a.setHeaderText(null);
                    a.showAndWait();
                }
                
                
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
                lawyerMenuListStage.show();*/
            /*case "Property Owner":
                Parent property_owner_dasboard = FXMLLoader.load(getClass().getResource("PropertyOwnerDashboard.fxml"));
                Scene property_owner_dasboard_scene = new Scene(property_owner_dasboard);
                Stage property_owner_dasboard_stage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                property_owner_dasboard_stage.setTitle("Property Owner");
                property_owner_dasboard_stage.setScene(property_owner_dasboard_scene);
                property_owner_dasboard_stage.show();
            /*case "Government Official":
                Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
                Scene lawyerMenuListScene = new Scene(lawyerMenuList);
                Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                lawyerMenuListStage.setTitle("Lawyer");
                lawyerMenuListStage.setScene(lawyerMenuListScene);
                lawyerMenuListStage.show();*/
            /*case "Surveyor":
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
                bankDashBoardStage.show();*/
           /* default :
                Parent mainLogin_Link = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
                Scene creating_sceneofmainLogin = new Scene(mainLogin_Link);
                Stage creating_stage_for_mainLogScene  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                creating_stage_for_mainLogScene.setTitle("Welcome to digital land registration platform!");
                creating_stage_for_mainLogScene.setScene(creating_sceneofmainLogin);
                creating_stage_for_mainLogScene.show(); */
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
