/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author dell
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private AnchorPane pane1;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Button but1;
    @FXML
    private Button but2;
    @FXML
    private Label label3;
    @FXML
    private Button but3;
    @FXML
    private Button but4;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    void loadw(String loc,String title){
         try {
             Parent root=FXMLLoader.load(getClass().getResource(loc));
              Stage stage=new Stage(StageStyle.DECORATED);
              stage.setTitle(title);
              stage.setScene(new Scene(root));
              stage.show();
              
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
   
    }

    @FXML
    private void bak(ActionEvent event) {
        loadw("/ilk_sayfa/vakalar.fxml","add new");
        
        
    }

    @FXML
    private void cikis(ActionEvent event) {
        Node source= (Node) event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void git(ActionEvent event) {
        loadw("/graf/grafik.fxml","add new");
        
    }

    @FXML
    private void go(ActionEvent event) {
        loadw("/görsel/görselli.fxml","add new");
        
    }
    
}
