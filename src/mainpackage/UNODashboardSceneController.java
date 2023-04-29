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
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Hasan
 */
public class UNODashboardSceneController implements Initializable {

    @FXML
    private ListView<String> UNOActivityList;
    
    String[] unoActivityList = {"Dashboard", "Tax verification", "Owenership transfer",
                                "Government notices", "Mutation cirtificate", "Deeds approval", "Profile", "Sing out"};
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UNOActivityList.getItems().addAll(unoActivityList);
    }    
    
}
