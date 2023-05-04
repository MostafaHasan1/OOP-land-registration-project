/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    
        File ba = null;
            FileOutputStream fos = null;      
            ObjectOutputStream oos = null;  
            try{
            ba = new File("BankReprensentativeTransactionData.bin");
            if(ba.exists()){
                fos = new FileOutputStream(ba,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(ba);
                oos = new ObjectOutputStream(fos);               
            }
            BTransaction b = new BTransaction(
                 bankTxNameText.getText(),
                 bankTxIDText.getText(),
                 bankTxAmountText.getText(),
                 bankTxTxText.getText()   
            );
            oos.writeObject(b);

        } catch (IOException ex) {
           Logger.getLogger(BankRepresentativeSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(BankRepresentativeSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    }
    @FXML
    private void bankLoadPreviousDataButton(ActionEvent event) {
                ArrayList<String> namelist = new ArrayList<String>();
                ArrayList<String> idlist = new ArrayList<String>();
                ArrayList<String> amountlist = new ArrayList<String>();
                ArrayList<String> txldlist = new ArrayList<String>();
                File x = null;
                FileInputStream fis = null;      
                ObjectInputStream ois = null;
                try {
                    
                    x = new File("BankReprensentativeTransactionData.bin");
                    fis = new FileInputStream(x);
                    ois = new ObjectInputStream(fis);
                    BTransaction b;
                    try{
                        while(true){
                        b = (BTransaction)ois.readObject();
                        String name = b.name;
                        String ID = b.ID;
                        String amount = b.amount;
                        String TXID = b.TXID;                       
                        namelist.add(name);
                        idlist.add(ID);
                        amountlist.add(amount);
                        txldlist.add(TXID);
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
                
    }

}
