/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author moinu
 */
public class GovernmentOfficialDashboardController implements Initializable {

    @FXML
    private MenuButton LandMenuButton;
    @FXML
    private MenuButton OthersMenuButton;
    @FXML
    private MenuButton LandOwnerMenuButton;
    @FXML
    private MenuButton SecurityMenuButton;
    @FXML
    private MenuButton InformationMenuButton;
    @FXML
    private MenuButton DocumentsMenuButton;
    @FXML
    private MenuItem SubLandInformation;
    @FXML
    private MenuItem SubLandRegistration;
    @FXML
    private MenuItem SubLandOwnerList;
    @FXML
    private MenuItem SubLandOwnerDetails;
    @FXML
    private MenuItem SubSocialSecurityNumber;
    @FXML
    private MenuItem SubUserAccess;
    @FXML
    private MenuItem SubLandPricing;
    @FXML
    private MenuItem SubDataAnalysis;
    @FXML
    private MenuItem SubDocumentApproval;
    @FXML
    private MenuItem SubNotices;
    @FXML
    private MenuItem SubTermsandPolicies;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void pop(MouseEvent event) {
    }

}
