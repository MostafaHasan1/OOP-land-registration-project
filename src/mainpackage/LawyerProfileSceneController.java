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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerProfileSceneController implements Initializable {

    @FXML
    private Label lawyerNamelLabel;
    @FXML
    private Label lawyerNIDlabel;
    @FXML
    private Label lawyerIDLabel;
    @FXML
    private Label lawyerDobLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dashboardButtonOnclick(ActionEvent event) throws IOException {
        Parent lawyerMenuList = FXMLLoader.load(getClass().getResource("lawyerDashboardScene.fxml"));
        Scene lawyerMenuListScene = new Scene(lawyerMenuList);
        Stage lawyerMenuListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        lawyerMenuListStage.setTitle("Welcome to Lawyer Dashboard!");
        lawyerMenuListStage.setScene(lawyerMenuListScene);
        lawyerMenuListStage.show();
    }

    @FXML
    private void caseButtonOnclick(ActionEvent event) throws IOException {
        Parent caseSceneURL = FXMLLoader.load(getClass().getResource("LawyerCasesScene.fxml"));
        Scene lawyerCaseScene = new Scene(caseSceneURL);
        Stage caseSceneStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        caseSceneStage.setTitle("Cases");
        caseSceneStage.setScene(lawyerCaseScene);
        caseSceneStage.show();
    }

    @FXML
    private void clintMsgButtonOnclick(ActionEvent event) throws IOException {
        Parent clintMSgSceneURL = FXMLLoader.load(getClass().getResource("LawyerClintMegScene.fxml"));
        Scene clintMsgScene = new Scene(clintMSgSceneURL);
        Stage clintMsgStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        clintMsgStage.setTitle("Clint Messages");
        clintMsgStage.setScene(clintMsgScene);
        clintMsgStage.show();
    }

    @FXML
    private void govNoticButtonOnclick(ActionEvent event) throws IOException {
        Parent govNoticURL = FXMLLoader.load(getClass().getResource("LaywerGovNotcScene.fxml"));
        Scene govNoticScene = new Scene(govNoticURL);
        Stage govNoticStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        govNoticStage.setTitle("Government Notice");
        govNoticStage.setScene(govNoticScene);
        govNoticStage.show();
    }

    @FXML
    private void transactionButtonOnclick(ActionEvent event) throws IOException {
        Parent transactionURL = FXMLLoader.load(getClass().getResource("LawyerTransactionScene.fxml"));
        Scene transactionScene = new Scene(transactionURL);
        Stage transactionSceneStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        transactionSceneStage.setTitle("Transaction");
        transactionSceneStage.setScene(transactionScene);
        transactionSceneStage.show();
    }

    @FXML
    private void queryButtonOnclick(ActionEvent event) throws IOException {
        Parent querryURL = FXMLLoader.load(getClass().getResource("LawyerQueryScene.fxml"));
        Scene querryScene = new Scene(querryURL);
        Stage querryStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        querryStage.setTitle("Querry");
        querryStage.setScene(querryScene);
        querryStage.show();
    }

    @FXML
    private void profileButtonOnclick(ActionEvent event) throws IOException {
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
              /*  finally {
                try {
            /*        if(ois != null) ois.close();
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
                    a.showAndWait();} */
        
        Parent profileURL = FXMLLoader.load(getClass().getResource("LawyerProfileScene.fxml"));
        Scene profileScene = new Scene(profileURL);
        Stage profileStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        profileStage.setTitle("Profile");
        profileStage.setScene(profileScene);
        profileStage.show();
    }

    @FXML
    private void signoutButtonOnclick(ActionEvent event) throws IOException {
        Parent mainLogin_Link = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
        Scene creating_sceneofmainLogin = new Scene(mainLogin_Link);
        Stage creating_stage_for_mainLogScene  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        creating_stage_for_mainLogScene.setTitle("Welcome to digital land registration platform!");
        creating_stage_for_mainLogScene.setScene(creating_sceneofmainLogin);
        creating_stage_for_mainLogScene.show();
    }

    @FXML
    private void changePassTXTonClick(MouseEvent event) {
        
    }
    
}
