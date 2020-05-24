/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilk_sayfa;

import covid1.FXMLDocumentController;
import static covid1.FXMLDocumentController.listt;
import covid1.record;
import covid1.ülkeler;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dell
 */
public class VakalarController implements Initializable {

    @FXML
    private AnchorPane vpane1;
    @FXML
    private TableView table1;
    @FXML
    private TableColumn country;
    @FXML
    private TableColumn totalc;
    @FXML
    private TableColumn newc;
    @FXML
    private TableColumn totald;
    @FXML
    private TableColumn newd;
    @FXML
    private TableColumn population;
    @FXML
    private TableColumn mortality;
    @FXML
    private TableColumn rate;
    @FXML
    private Button vbut1;
    @FXML
    private Button güncelle;
    ObservableList<record> listt1 =FXCollections.observableArrayList();

    ObservableList<ülkeler> ülk =FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //listt1 = FXMLDocumentController.
          System.out.println(listt);
          
        table1.refresh();  
        table1.setItems(ülk);
        
        country.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("ülkeler"));
        totalc.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("totalc"));
        newc.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("newc"));
        totald.setCellValueFactory(new PropertyValueFactory<ülkeler,Integer>("totald"));
        newd.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("newd"));
        population.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("population"));
        mortality.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("mortality"));
        rate.setCellValueFactory(new PropertyValueFactory<ülkeler,String>("attack"));
    }    

    @FXML
    private void cikis(ActionEvent event) {
        javafx.scene.Node source= (javafx.scene.Node) event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
        
    }
    
}
