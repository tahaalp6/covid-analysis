/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.InputStream;
/*import java.lang.invoke.StringConcatFactory;*/
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Observable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
    @FXML
    private Button get_url_btn;
    @FXML
    public TextField url_textfield;
    @FXML
    public Label dataTextArea;
    
    public static ObservableList<record> listt =FXCollections.observableArrayList();

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
        javafx.scene.Node source= (javafx.scene.Node) event.getSource();
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

    @FXML
    private void get_data(ActionEvent event) {
        String fileUrl = "https://opendata.ecdc.europa.eu/covid19/casedistribution/xml/"; //url_textfield.getText();
        String FILE_URL = fileUrl;
        int sum=0;
        try {
            InputStream in = new URL(FILE_URL).openStream();
            Files.copy(in, Paths.get(".\\.\\fileStorage\\data.xml"), StandardCopyOption.REPLACE_EXISTING);

            File fXmlFile = new File(".\\.\\fileStorage\\data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("record");
            System.out.println("-----------------------");
             ArrayList dlist=new ArrayList();
             
             
             
            for (int temp = 0; temp < nList.getLength(); temp++) {
                
                
                
                org.w3c.dom.Node nNode = nList.item(temp);
                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE) {
                     
                    Element eElement = (Element) nNode;
                   
                   
                 
                
                   listt.add(temp,new record(getTagValue("dateRep", eElement),
                           Integer.parseInt(getTagValue("day", eElement)),
                           Integer.parseInt(getTagValue("month", eElement)),
                           Integer.parseInt(getTagValue("year", eElement)),
                           Integer.parseInt(getTagValue("cases", eElement)),
                           Integer.parseInt(getTagValue("deaths", eElement)),
                           getTagValue("countriesAndTerritories", eElement),
                           getTagValue("geoId", eElement),
                           getTagValue("countryterritoryCode", eElement),
                           getTagValue("popData2018", eElement),
                           getTagValue("continentExp", eElement)));
           
                   
                   

        
                    
                 /*  System.out.print("dateRep : " + getTagValue("dateRep", eElement) + " -- ");
                    System.out.print("day : " + getTagValue("day", eElement)+ " -- ");
                    System.out.print("month : " + getTagValue("month", eElement)+ " -- ");
                    System.out.print("year : " + getTagValue("year", eElement)+ " -- ");
                    System.out.print("cases : " + getTagValue("cases", eElement)+ " -- ");
                    System.out.print("deaths : " + getTagValue("deaths", eElement)+ " -- ");
                    System.out.print("SalarcountriesAndTerritoriesy : " + getTagValue("countriesAndTerritories", eElement)+ " -- ");
                    System.out.print("geoId : " + getTagValue("geoId", eElement)+ " -- ");
                   System.out.print("countryterritoryCode : " + getTagValue("countryterritoryCode", eElement)+ " -- ");
                    System.out.print("popData2018 : " + getTagValue("popData2018", eElement)+ " -- ");
                    System.out.println("continentExp : " + getTagValue("continentExp", eElement));
*/
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sum);
        
        
    }
        

    private static String getTagValue(String sTag, Element eElement) {
        NodeList nlList = eElement.getElementsByTagName(sTag).item(0).getChildNodes();
        if((org.w3c.dom.Node) nlList.item(0) == null){

            return "";

        }
        org.w3c.dom.Node nValue = (org.w3c.dom.Node) nlList.item(0);
        return nValue.getNodeValue();
    }
    
    public ObservableList<record> getListt(){
        return listt;
    }
    
}
