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
public class PropertyOwnerApplyforregistrationController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoTransactions(ActionEvent event) throws IOException {
        Parent GoTransactions = FXMLLoader.load(getClass().getResource("PropertyOwnerMyTransactions.fxml"));
                    Scene GoTransactionsScene = new Scene(GoTransactions);
                    Stage GoTransactionsStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoTransactionsStage.setTitle("Welcome to Property Owner My Transactions!");
                    GoTransactionsStage.setScene(GoTransactionsScene);
                    GoTransactionsStage.show();
    }

    @FXML
    private void GoMarketPlace(ActionEvent event) throws IOException {
        Parent GoMarketPlace = FXMLLoader.load(getClass().getResource("PropertyOwnerMarketplace.fxml"));
                    Scene GoMarketPlaceScene = new Scene(GoMarketPlace);
                    Stage GoMarketPlaceStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoMarketPlaceStage.setTitle("Welcome to Property Owner Marketplace!");
                    GoMarketPlaceStage.setScene(GoMarketPlaceScene);
                    GoMarketPlaceStage.show();
    }

    @FXML
    private void GoApplyReg(ActionEvent event) throws IOException {
        Parent GoApplyReg = FXMLLoader.load(getClass().getResource("PropertyOwnerApplyforregistration.fxml"));
                    Scene GoApplyRegScene = new Scene(GoApplyReg);
                    Stage GoApplyRegStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoApplyRegStage.setTitle("Welcome to Property Owner Apply for registration!");
                    GoApplyRegStage.setScene(GoApplyRegScene);
                    GoApplyRegStage.show();
        
    }

    @FXML
    private void GoAuction(ActionEvent event) throws IOException {
        Parent GoAuction = FXMLLoader.load(getClass().getResource("PropertyOwnerSellAucion.fxml"));
                    Scene GoAuctionScene = new Scene(GoAuction);
                    Stage GoAuctionStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoAuctionStage.setTitle("Welcome to Property Owner Sell Aucion!");
                    GoAuctionStage.setScene(GoAuctionScene);
                    GoAuctionStage.show();
    }

    @FXML
    private void GoReqVer(ActionEvent event) throws IOException {
        Parent GoReqVer = FXMLLoader.load(getClass().getResource("PropertyOwnerRequestVerificationController.fxml"));
                    Scene GoReqVerScene = new Scene(GoReqVer);
                    Stage GoReqVerStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoReqVerStage.setTitle("Welcome to Property Owner Request Verification Controller!");
                    GoReqVerStage.setScene(GoReqVerScene);
                    GoReqVerStage.show();
    }

    @FXML
    private void GoFines(ActionEvent event) throws IOException {
        Parent GoFines = FXMLLoader.load(getClass().getResource("PropertyOwnerMyfinesPenalties.fxml"));
                    Scene GoFinesScene = new Scene(GoFines);
                    Stage GoFinesStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoFinesStage.setTitle("Welcome to Property Owner My fines Penalties!");
                    GoFinesStage.setScene(GoFinesScene);
                    GoFinesStage.show();
    }

    @FXML
    private void GoHelp(ActionEvent event) throws IOException {
        Parent GoHelp = FXMLLoader.load(getClass().getResource("PropertyOwnerHelpforregistration.fxml"));
                    Scene GoHelpScene = new Scene(GoHelp);
                    Stage GoHelpStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoHelpStage.setTitle("Welcome to Property Owner Help for registration!");
                    GoHelpStage.setScene(GoHelpScene);
                    GoHelpStage.show();
    }

    @FXML
    private void GoRegDoc(ActionEvent event) throws IOException {
        Parent GoRegDoc = FXMLLoader.load(getClass().getResource("PropertyOwnerPropertyRegistrationDocuments.fxml"));
                    Scene GoRegDocScene = new Scene(GoRegDoc);
                    Stage GoRegDocStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoRegDocStage.setTitle("Welcome to Property Owner Property Registration Documents!");
                    GoRegDocStage.setScene(GoRegDocScene);
                    GoRegDocStage.show();
    }

    @FXML
    private void GoProperties(ActionEvent event) throws IOException {
        Parent GoProperties = FXMLLoader.load(getClass().getResource("PropertyOwnerMyProperty.fxml"));
                    Scene GoPropertiesScene = new Scene(GoProperties);
                    Stage GoPropertiesStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoPropertiesStage.setTitle("Welcome to Property Owner My Property!");
                    GoPropertiesStage.setScene(GoPropertiesScene);
                    GoPropertiesStage.show();
    }

    @FXML
    private void GoRecords(ActionEvent event) throws IOException {
        Parent GoRecords = FXMLLoader.load(getClass().getResource("PropertyOwnerMyRecords.fxml"));
                    Scene GoRecordsScene = new Scene(GoRecords);
                    Stage GoRecordsStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoRecordsStage.setTitle("Welcome to Property Owner My Records!");
                    GoRecordsStage.setScene(GoRecordsScene);
                    GoRecordsStage.show();
    }

    @FXML
    private void GoDashPropOwner(ActionEvent event) throws IOException {
        Parent GoDashPropOwner = FXMLLoader.load(getClass().getResource("PropertyOwnerDashboard.fxml"));
                    Scene GoDashPropOwnerScene = new Scene(GoDashPropOwner);
                    Stage GoDashPropOwnerStage  = (Stage) ((Node)event.getSource()).getScene().getWindow();
                    GoDashPropOwnerStage.setTitle("Welcome to Property Owner Dashboard!");
                    GoDashPropOwnerStage.setScene(GoDashPropOwnerScene);
                    GoDashPropOwnerStage.show();
    }
    
}
