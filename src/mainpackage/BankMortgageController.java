/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
public class BankMortgageController implements Initializable {

    @FXML
    private TextField bankMorgageName;
    @FXML
    private TextField bankMorgageId;
    @FXML
    private TextField bankMorgageValue;
    @FXML
    private TextField bankMortgageLoan;
    @FXML
    private TableView<BankMortgage> liTableView;
    @FXML
    private TableColumn<BankMortgage, String> tableName;
    @FXML
    private TableColumn<BankMortgage, String> tableId;
    @FXML
    private TableColumn<BankMortgage, String> tableOwnerValue;
    @FXML
    private TableColumn<BankMortgage, String> tableLIenAmount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tableName.setCellValueFactory(new PropertyValueFactory<BankMortgage,String>("Name"));
        tableId.setCellValueFactory(new PropertyValueFactory<BankMortgage,String>("ID"));
        tableOwnerValue.setCellValueFactory(new PropertyValueFactory<BankMortgage,String>("Amount"));
        tableLIenAmount.setCellValueFactory(new PropertyValueFactory<BankMortgage,String>("Loan"));
    }    

    @FXML
    private void BankMortgageBackButton(ActionEvent event) throws IOException {
        Parent BankMortgageBackButtonParent = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
        Scene BankMortgageBackButton = new Scene(BankMortgageBackButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BankMortgageBackButton);
        window.show();
    }

    @FXML
    private void AddMortgageListButton(ActionEvent event) {
        BankMortgage li = new BankMortgage(bankMorgageName.getText(),bankMorgageId.getText(),bankMorgageValue.getText(),bankMortgageLoan.getText()
                                    );
        liTableView.getItems().add(0,li);
    
        File ba = null;
            FileOutputStream fos = null;      
            ObjectOutputStream oos = null;  
            try{
            ba = new File("BankReprensentativeMortgageData.bin");
            if(ba.exists()){
                fos = new FileOutputStream(ba,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(ba);
                oos = new ObjectOutputStream(fos);               
            }
            BTransaction b = new BTransaction(
                 bankMorgageName.getText(),
                 bankMorgageId.getText(),
                 bankMorgageValue.getText(),
                 bankMortgageLoan.getText()   
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
    private void AddMortgagePDFButton(ActionEvent event) {
    }
  
}
