/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author prabhatkumar
 */
public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        btn1.setText("Say 'Hello World'");
        btn2.setText("Say 'Hello Prabhat'");
        btn1.setOnAction((ActionEvent event) -> {
            System.out.println("Hello World!");
        });
        
        btn2.setOnAction((ActionEvent event) -> {
            System.out.println("Hello Prabhat!");
        });
        
        StackPane root = new StackPane();
        
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        
        Scene scene = new Scene(root, 500, 450);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
