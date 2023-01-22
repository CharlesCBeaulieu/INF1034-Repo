package com.example.projet1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));

        //create rectangle
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(200);
        rectangle1.setHeight(100);
        rectangle1.setArcWidth(20);
        rectangle1.setArcHeight(20);
        rectangle1.setX(100);
        rectangle1.setY(100);
        rectangle1.setFill(Color.BLUE);

        //create group
        Group group1 = new Group();
        group1.getChildren().addAll(rectangle1);

        //create scene
        Scene scene = new Scene(group1, 500, 500);

        //stage
        stage.isResizable();
        stage.setTitle("Application");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}