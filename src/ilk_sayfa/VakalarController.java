/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ilk_sayfa;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    public TableView<covidd> table1;
    @FXML
    private TableColumn<covidd, String> country;
    @FXML
    private TableColumn<covidd, Integer> totalc; 
    @FXML
    private TableColumn<covidd,Integer> newc;
    @FXML
    private TableColumn<covidd,Integer> totald;
    @FXML
    private TableColumn<covidd, Integer> newd;
    @FXML
    private TableColumn<covidd, Integer> population;
    @FXML
    private TableColumn<covidd,Integer> mortality;
    @FXML
    private TableColumn<covidd, Integer> rate;
    @FXML
    private Button vbut1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }    

    @FXML
    private void cikis(ActionEvent event) {
        Node source= (Node) event.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }

  
    
    class covidd{
        private SimpleStringProperty country;
        private SimpleIntegerProperty totalc;
        private SimpleIntegerProperty newc;
        private SimpleIntegerProperty totald;
        private SimpleIntegerProperty newd;
        private SimpleIntegerProperty population;
        private SimpleIntegerProperty mortality;
        private SimpleIntegerProperty rate;

       covidd(String country,int totalc,int newc,int totald,int newd,int population,int mortality,int rate){
           this.country=new SimpleStringProperty(country);
           this.totalc=new SimpleIntegerProperty(totalc);
           this.newc=new SimpleIntegerProperty(newc);
           this.totald=new SimpleIntegerProperty(totald);
           this.newd=new SimpleIntegerProperty(newd);
           this.population=new SimpleIntegerProperty(population);
           this.mortality=new SimpleIntegerProperty(mortality);
           this.rate=new SimpleIntegerProperty(rate);
       }     

        public String getCountry() {
            return country.get();
        }

        public Integer getTotalc() {
            return totalc.get();
        }

        public Integer getNewc() {
            return newc.get();
        }

        public Integer getTotald() {
            return totald.get();
        }

        public Integer getNewd() {
            return newd.get();
        }

        public Integer getPopulation() {
            return population.get();
        }

        public Integer getMortality() {
            return mortality.get();
        }

        public Integer getRate() {
            return rate.get();
        }

        
        
    }
}
