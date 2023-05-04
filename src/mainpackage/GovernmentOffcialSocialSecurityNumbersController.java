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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author moinu
 */
public class GovernmentOffcialSocialSecurityNumbersController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoLandInfo(ActionEvent event) throws IOException {
        Parent GoLandInfo = FXMLLoader.load(getClass().getResource("GovernmentOffcialLandInformation.fxml"));
                    Scene GoLandInfoScene = new Scene(GoLandInfo);
                    Stage GoLandInfoStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoLandInfoStage.setTitle("Welcome to Land Information!");
                    GoLandInfoStage.setScene(GoLandInfoScene);
                    GoLandInfoStage.show();
    }

    @FXML
    private void GoDashOfficial(ActionEvent event) throws IOException {
        Parent GoDashOfficial = FXMLLoader.load(getClass().getResource("GovernmentOfficialDashboard.fxml"));
                    Scene GoDashOfficialScene = new Scene(GoDashOfficial);
                    Stage GoDashOfficialStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoDashOfficialStage.setTitle("Welcome to Government Official Dashboard!");
                    GoDashOfficialStage.setScene(GoDashOfficialScene);
                    GoDashOfficialStage.show();
    }

    @FXML
    private void GoDocumentApp(ActionEvent event) throws IOException {
        Parent GoDocumentApp = FXMLLoader.load(getClass().getResource("GovernmentOffcialDocumentApproval.fxml"));
                    Scene GoDocumentAppScene = new Scene(GoDocumentApp);
                    Stage GoDocumentAppStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoDocumentAppStage.setTitle("Welcome to Government Official Document Approval!");
                    GoDocumentAppStage.setScene(GoDocumentAppScene);
                    GoDocumentAppStage.show();
        
        
    }

    @FXML
    private void GoLandReg(ActionEvent event) throws IOException {
        Parent GoLandReg = FXMLLoader.load(getClass().getResource("GovernmentOffcialLandRegistrations.fxml"));
                    Scene GoLandRegScene = new Scene(GoLandReg);
                    Stage GoLandRegStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoLandRegStage.setTitle("Welcome to Government Official Dashboard!");
                    GoLandRegStage.setScene(GoLandRegScene);
                    GoLandRegStage.show();
    }

    @FXML
    private void GoNotices(ActionEvent event) {
    }

    @FXML
    private void GoUser(ActionEvent event) {
    }

    @FXML
    private void GoTermsandPolicies(ActionEvent event) {
    }

    @FXML
    private void GoSocialSecurity(ActionEvent event) {
    }

    @FXML
    private void GoLandPrice(ActionEvent event) {
    }

    @FXML
    private void GoDataAna(ActionEvent event) {
    }

    @FXML
    private void GoOwnerDt(ActionEvent event) {
    }

    @FXML
    private void GoOwnerList(ActionEvent event) {
    }
    
}
