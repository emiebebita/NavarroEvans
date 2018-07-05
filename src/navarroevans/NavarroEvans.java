/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navarroevans;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Emie
 */
public class NavarroEvans extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        // get the screen size
        Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();
        
        // load the fxml file of the sign in
        Parent root = FXMLLoader.load(getClass().getResource("/navarroevans/views/Menu.fxml"));
        
        // create the scene
        Scene scene = new Scene(root);
        
        // show the scene in the middle of the screen
        primaryStage.setScene(scene);
        primaryStage.setX((screenSize.getWidth() - primaryStage.getWidth()) / 2);
        primaryStage.setY((screenSize.getHeight() - primaryStage.getHeight()) / 2);
        primaryStage.setMinWidth(1024);
        primaryStage.setMinHeight(500);
        primaryStage.setResizable(false);
        
        // set the application title
        primaryStage.setTitle("Proyecto de Métodos Numéricos");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
