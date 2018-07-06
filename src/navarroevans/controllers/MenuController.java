/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navarroevans.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Emie
 */
public class MenuController implements Initializable {
    
    @FXML
    private Button cuadrado;

    @FXML
    private Button simpson;

    @FXML
    private Button lagrange;

    @FXML
    private Button trapezoidal;

    @FXML
    private Button newton;
    
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    public void changeStage(String viewName) throws IOException {
        // get the screen size
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        // reference the stage
        Stage oldStage = (Stage) root.getScene().getWindow();
        // save the old stage position
        double x = oldStage.getX();
        double y = oldStage.getY();
        // close old stage
        oldStage.close();
        // create the new stage
        Stage newStage = new Stage();
        // load the fxml file of the main window
        Parent newRoot = FXMLLoader.load(getClass().getResource("/navarroevans/views/"+viewName+".fxml"));
        // create the scene
        Scene scene = new Scene(newRoot);
        // load the scene to the stage
        newStage.setScene(scene);
        //show the new stage
        newStage.show();
        newStage.setMinWidth(1024);
        newStage.setMinHeight(500);
        newStage.setResizable(false);
        // put the new stage in the same place of the old one or in the center if maximized
        if(oldStage.isMaximized() == true) {
            newStage.setX((screenSize.getWidth() - newStage.getWidth()) / 2);
            newStage.setY((screenSize.getHeight() - newStage.getHeight()) / 2);
        } else {
            newStage.setY(y);
            newStage.setX(x);
        }
        // set the application title
        newStage.setTitle("Proyecto de Métodos Numéricos");
    }
    
    public void Newton() throws IOException {
        changeStage("Newton");
    }
    
    public void Simpson() throws IOException {
        changeStage("Simpson");
    }
    
    public void Trapezoidal() throws IOException {
        changeStage("Trapezoidal");
    }
    
    public void Lagrange() throws IOException {
        changeStage("Lagrange");
    }
    
    public void Cuadrado() throws IOException {
        changeStage("Cuadrado");
    }
    
}
