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
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class LawyerQuerySceneController implements Initializable {

    @FXML
    private TableView<?> queryTableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dshbrdButtonOnClick(ActionEvent event) throws IOException {
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
    private void clntMSGbuttonOnclick(ActionEvent event) throws IOException {
        Parent clintMSgSceneURL = FXMLLoader.load(getClass().getResource("LawyerClintMegScene.fxml"));
        Scene clintMsgScene = new Scene(clintMSgSceneURL);
        Stage clintMsgStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
        clintMsgStage.setTitle("Clint Messages");
        clintMsgStage.setScene(clintMsgScene);
        clintMsgStage.show();
    }

    @FXML
    private void govNoticeButtonOnclick(ActionEvent event) throws IOException {
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
    
}
