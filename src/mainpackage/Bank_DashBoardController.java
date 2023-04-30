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
 * @author akash
 */
public class Bank_DashBoardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BankTransactionButton(ActionEvent event) throws IOException {
        Parent BankTransactionParent = FXMLLoader.load(getClass().getResource("BankTransaction.fxml"));
        Scene BankTransaction = new Scene(BankTransactionParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BankTransaction);
        window.show();        
    }

    @FXML
    private void bankLienButton(ActionEvent event) throws IOException {
        Parent bankLienButtonParent = FXMLLoader.load(getClass().getResource("BankLienInfo.fxml"));
        Scene bankLienButton = new Scene(bankLienButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bankLienButton);
        window.show();
    }

    @FXML
    private void bankPropertyOwnerButton(ActionEvent event) throws IOException {
        Parent bankPropertyOwnerButtonParent = FXMLLoader.load(getClass().getResource("BankPropertyOwnerInfo.fxml"));
        Scene bankPropertyOwnerButton = new Scene(bankPropertyOwnerButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bankPropertyOwnerButton);
        window.show();
    }

    @FXML
    private void bankMortgageButton(ActionEvent event) throws IOException {
        Parent bankMortgageButtonParent = FXMLLoader.load(getClass().getResource("BankMortgage.fxml"));
        Scene bankMortgageButton = new Scene(bankMortgageButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bankMortgageButton);
        window.show();    
    }

    @FXML
    private void BankSignOutButton(ActionEvent event) throws IOException {
        Parent BankSignOutButtonParent = FXMLLoader.load(getClass().getResource("mainLandregistrationLoginScene.fxml"));
        Scene BankSignOutButton = new Scene(BankSignOutButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BankSignOutButton);
        window.show();
    }

    @FXML
    private void bankAccountDeatails(ActionEvent event) throws IOException {
        Parent bankAccountDeatailsParent = FXMLLoader.load(getClass().getResource("BankAccountDetails.fxml"));
        Scene bankAccountDeatails = new Scene(bankAccountDeatailsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(bankAccountDeatails);
        window.show();     
    }
    
}
