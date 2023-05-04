/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author akash
 */
public class BankTransactionController implements Initializable {

    @FXML
    private TextField bankTxNameText;
    @FXML
    private TextField bankTxIDText;
    @FXML
    private TextField bankTxAmountText;
    @FXML
    private TableView<BTransaction> txTableView;
    @FXML
    private TableColumn<BTransaction, String> txTableViewName;
    @FXML
    private TableColumn<BTransaction, String> txTableViewID;
    @FXML
    private TableColumn<BTransaction, String> txTableViewAmount;
    @FXML
    private TableColumn<BTransaction, String> txTableViewTXID;
    private TableColumn<BTransaction,String> txTableViewPayment;
    @FXML
    private TextField bankTxTxText;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        txTableViewName.setCellValueFactory(new PropertyValueFactory<BTransaction,String>("Name"));
        txTableViewID.setCellValueFactory(new PropertyValueFactory<BTransaction,String>("ID"));
        txTableViewAmount.setCellValueFactory(new PropertyValueFactory<BTransaction,String>("Amount"));
        txTableViewTXID.setCellValueFactory(new PropertyValueFactory<BTransaction,String>("TXID"));
        txTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }    

    @FXML
    private void BankTransactionBackButton(ActionEvent event) throws IOException {
        Parent BankTransactionBackButtonParent = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
        Scene BankTransactionBackButton = new Scene(BankTransactionBackButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BankTransactionBackButton);
        window.show();
    }

    @FXML
    private void bankAddTrasactionButton(ActionEvent event) {
            BTransaction newTX = new BTransaction(bankTxNameText.getText(),
                                       bankTxIDText.getText(),
                                       bankTxAmountText.getText(),
                                       bankTxTxText.getText()
                                    );
        txTableView.getItems().add(newTX); 
    }

    @FXML
    private void bankLoadPreviousDataButton(ActionEvent event) {
    }
    
}
