package com.example.topic6lab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Labels
        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");
        Label ageLabel = new Label("Age:");

        // Fields
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter your username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        TextField ageField = new TextField();
        ageField.setPromptText("Enter your age");

        // Button + output
        Button loginButton = new Button("Login");

        //TextArea outputArea = new TextArea();
        //outputArea.setWrapText(true);

        Label outputArea = new Label();
        outputArea.setWrapText(true);


        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();
            String ageText = ageField.getText();

            if (username.isEmpty() || password.isEmpty() || ageText.isEmpty()) {
                System.out.println("Please fill in all fields.");
                outputArea.setText("Please fill in all fields!!");
                return;
            }
            int age;
            int newAge;
            try {
                age = Integer.parseInt(ageText);
            } catch (NumberFormatException e) {
                System.out.println("Age must be a number.");
                outputArea.setText("Age must be a number!!");
                return;
            }

            newAge = age + 5;
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("Current Age: " + age);
            System.out.println("Age in 5 years: " + newAge);

            usernameField.clear();
            passwordField.clear();
            ageField.clear();

            outputArea.setText("Welcome " + username + ",  your password is " + password + ", and in 5 years your age will be " + newAge);

            System.out.println("Login successful!");
        });
        VBox vbox1 = new VBox(5,userLabel, usernameField,passLabel, passwordField,ageLabel, ageField);
        vbox1.setSpacing(8);
        vbox1.setAlignment(javafx.geometry.Pos.CENTER_LEFT);

        VBox vbox = new VBox(15, vbox1, loginButton, outputArea);
        vbox.setPadding(new javafx.geometry.Insets(15));
        vbox.setAlignment(javafx.geometry.Pos.TOP_CENTER);


        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("LOGIN: " + "Karamveer Dhillon");
        primaryStage.show();

    }
}