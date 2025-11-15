package com.example.topic6lab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.awt.*;

public class Topic6Lab1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Topic 6 Lab 1 Karamveer Dhillon");

        Label label = new Label("Don't touch things");
        Button button = new Button("Press Me");

        Circle circle = new Circle(25);
        circle.setFill(javafx.scene.paint.Color.ALICEBLUE);
        circle.setStroke(javafx.scene.paint.Color.BLUE);

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button, circle);

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
