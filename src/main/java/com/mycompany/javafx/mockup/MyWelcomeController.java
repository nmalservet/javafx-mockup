package com.mycompany.javafx.mockup;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * main controller
 * @author nicolas malservet
 */
public class MyWelcomeController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label lstatus;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        //print a log
        System.out.println("button pressed.");
        label.setText("hello, welcome.");
        lstatus.setText("Ok we can add labels.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
