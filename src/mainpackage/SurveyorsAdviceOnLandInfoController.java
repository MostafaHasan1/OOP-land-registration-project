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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author akash
 */
public class SurveyorsAdviceOnLandInfoController implements Initializable {

    @FXML
    private TextArea textFieldSurvo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void surveyorsAdviceBackButton(ActionEvent event) throws IOException {
        Parent surveyorsAdviceBackButtonParent = FXMLLoader.load(getClass().getResource("SurveyorsDashboardScene.fxml"));
        Scene surveyorsAdviceBackButton = new Scene(surveyorsAdviceBackButtonParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(surveyorsAdviceBackButton);
        window.show();   
    }

    @FXML
    private void surveyorsAdvicePublishButton(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("survoNotice.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            SurveyorsAdvice e = new SurveyorsAdvice(
                textFieldSurvo.getText()  
            );
            oos.writeObject(e);

        } catch (IOException ex) {
            Logger.getLogger(SurveyorSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(SurveyorSignUpSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }
    
}
