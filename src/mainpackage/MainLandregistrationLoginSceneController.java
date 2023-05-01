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
                    a.setContentText("Provide your data to login your Dashboard!");
                    a.setHeaderText(null);
                    a.showAndWait();
                    
                }else if(unoIDlist.contains(unoID)&&unoPassList.contains(unoPass)){
                    Parent UNOdashboard_Link = FXMLLoader.load(getClass().getResource("UNODashboardScene.fxml"));
                    Scene creating_sceneofUNOdashb = new Scene(UNOdashboard_Link);
                    Stage creating_stage_for_uno  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    creating_stage_for_uno.setTitle("UNO dashboard");
                    creating_stage_for_uno.setScene(creating_sceneofUNOdashb);
                    creating_stage_for_uno.show();
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
