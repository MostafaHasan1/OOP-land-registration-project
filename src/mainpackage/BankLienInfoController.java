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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author akash
 */
public class BankLienInfoController implements Initializable {

    @FXML
    private TextField bankLienname;
    @FXML
    private TextField bankLienid;
    @FXML
    private TextField bankLienaddress;
    @FXML
    private TextField bankLienAmount;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BankLienData(ActionEvent event) throws IOException {        
        Parent BankLienDataParent = FXMLLoader.load(getClass().getResource("Bank_DashBoard.fxml"));
        Scene BankLienData = new Scene(BankLienDataParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(BankLienData);
        window.show();     
    }

    @FXML
    private void BankAddLienData(ActionEvent event) {
    }

    @FXML
    private void BankLienDeleteData(ActionEvent event) {
    }
    
}
