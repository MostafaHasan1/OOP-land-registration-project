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
public class GovernmentOffcialLandInformationController implements Initializable {

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
    private void GoNotices(ActionEvent event) throws IOException {
        Parent GoNotices = FXMLLoader.load(getClass().getResource("GovernmentOffcialLandNotices.fxml"));
                    Scene GoNoticesScene = new Scene(GoNotices);
                    Stage GoNoticesStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoNoticesStage.setTitle("Welcome to Government Official Notices!");
                    GoNoticesStage.setScene(GoNoticesScene);
                    GoNoticesStage.show();
        
    }

    @FXML
    private void GoUser(ActionEvent event) throws IOException {
        Parent GoUser = FXMLLoader.load(getClass().getResource("GovernmentOffcialUserAccess.fxml"));
                    Scene GoUserScene = new Scene(GoUser);
                    Stage GoUserStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoUserStage.setTitle("Welcome to Government Official User Access!");
                    GoUserStage.setScene(GoUserScene);
                    GoUserStage.show();
    }

    @FXML
    private void GoTermsandPolicies(ActionEvent event) throws IOException {
        Parent GoTermsandPolicies = FXMLLoader.load(getClass().getResource("GovernmentOffcialTermsAndPolicies.fxml"));
                    Scene GoTermsandPoliciesScene = new Scene(GoTermsandPolicies);
                    Stage GoTermsandPoliciesStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoTermsandPoliciesStage.setTitle("Welcome to Government Offcial Terms And Policies!");
                    GoTermsandPoliciesStage.setScene(GoTermsandPoliciesScene);
                    GoTermsandPoliciesStage.show();
    }

    @FXML
    private void GoSocialSecurity(ActionEvent event) throws IOException {
        Parent GoSocialSecurity = FXMLLoader.load(getClass().getResource("GovernmentOffcialSocialSecurityNumbersController.fxml"));
                    Scene GoSocialSecurityScene = new Scene(GoSocialSecurity);
                    Stage GoSocialSecurityStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoSocialSecurityStage.setTitle("Welcome to Government Offcial Social Security Numbers Controller!");
                    GoSocialSecurityStage.setScene(GoSocialSecurityScene);
                    GoSocialSecurityStage.show();
    }

    @FXML
    private void GoLandPrice(ActionEvent event) throws IOException {Parent GoSocialSecurity = FXMLLoader.load(getClass().getResource("GovernmentOffcialSocialSecurityNumbersController.fxml"));
                    Scene GoSocialSecurityScene = new Scene(GoSocialSecurity);
                    Stage GoSocialSecurityStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoSocialSecurityStage.setTitle("Welcome to Government Offcial Social Security Numbers Controller!");
                    GoSocialSecurityStage.setScene(GoSocialSecurityScene);
                    GoSocialSecurityStage.show();
    }

    @FXML
    private void GoDataAna(ActionEvent event) throws IOException {
        Parent GoDataAna = FXMLLoader.load(getClass().getResource("GovernmentOffcialDataAnalysis.fxml"));
                    Scene GoDataAnaScene = new Scene(GoDataAna);
                    Stage GoDataAnaStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoDataAnaStage.setTitle("Welcome to Government Offcial Data Analysis!");
                    GoDataAnaStage.setScene(GoDataAnaScene);
                    GoDataAnaStage.show();
    }

    @FXML
    private void GoOwnerDt(ActionEvent event) throws IOException {
        Parent GoOwnerDt = FXMLLoader.load(getClass().getResource("GovernmentOfficialLandOwnerDetails.fxml"));
                    Scene GoOwnerDtScene = new Scene(GoOwnerDt);
                    Stage GoOwnerDtStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoOwnerDtStage.setTitle("Welcome to Government Offcial Government fficial Land Owner Details!");
                    GoOwnerDtStage.setScene(GoOwnerDtScene);
                    GoOwnerDtStage.show();
    }

    @FXML
    private void GoOwnerList(ActionEvent event) throws IOException {
        Parent GoOwnerList = FXMLLoader.load(getClass().getResource("GovernmentOffcialLandOwnerList.fxml"));
                    Scene GoOwnerListScene = new Scene(GoOwnerList);
                    Stage GoOwnerListStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoOwnerListStage.setTitle("Welcome to Government Offcial LandOwner List!");
                    GoOwnerListStage.setScene(GoOwnerListScene);
                    GoOwnerListStage.show();
        
    }
    
}
