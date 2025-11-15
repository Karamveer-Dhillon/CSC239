package com.example.topic6readingassignment;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Demo extends Application {

    private static final String CHOOSE = "choose one";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Karamveer Dhillon - Topic 6 Reading Assignment");

        BorderPane root = new BorderPane();

        ComboBox<String> shapeCombo = new ComboBox<>();
        shapeCombo.getItems().addAll(CHOOSE, "circle", "square", "triangle");
        shapeCombo.setValue(CHOOSE);

        ComboBox<String> colorCombo = new ComboBox<>();
        colorCombo.getItems().addAll(CHOOSE, "red", "green", "blue", "yellow", "white", "black");
        colorCombo.setValue(CHOOSE);

        HBox top = new HBox(8, new Label("Shape: "), shapeCombo, new Label("Color: "), colorCombo);
        top.setStyle("-fx-padding: 10;");
        root.setTop(top);

        StackPane center = new StackPane();
        center.setMinSize(400, 300);
        root.setCenter(center);

        Runnable redraw = () -> draw(center, shapeCombo.getValue(), colorCombo.getValue());

        // redraw when shape or color changes
        shapeCombo.valueProperty().addListener((o, ov, nv) -> redraw.run());
        colorCombo.valueProperty().addListener((o, ov, nv) -> redraw.run());

        // redraw when center size changes (keeps shape centered and sized)
        center.widthProperty().addListener((o, ov, nv) -> redraw.run());
        center.heightProperty().addListener((o, ov, nv) -> redraw.run());


        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void draw(StackPane pane, String shape, String colorName) {
        pane.getChildren().clear();
        if (shape == null || CHOOSE.equals(shape)) return;


        switch (shape) {
            case "circle": {
                Circle c = new Circle(100);
                c.setFill(mapColor(colorName));
                c.setStroke(Color.BLACK);
                pane.getChildren().add(c);
                break;
            }
            case "square": {
                Rectangle r = new Rectangle(100,100);
                r.setFill(mapColor(colorName));
                r.setStroke(Color.BLACK);
                pane.getChildren().add(r);
                break;
            }
            case "triangle": {
                Polygon triangle = new Polygon();

                triangle.getPoints().addAll(new Double[]{
                        100.0, 50.0,
                        50.0, 150.0,
                        150.0, 150.0
                });
                triangle.setFill(mapColor(colorName));
                triangle.setStroke(Color.BLACK);
                pane.getChildren().add(triangle);
                break;
            }
            default:
                break;
        }
    }

    private Color mapColor(String name) {
        if (name == null || CHOOSE.equals(name)) return Color.TRANSPARENT;
        switch (name.toLowerCase()) {
            case "red": return Color.RED;
            case "green": return Color.GREEN;
            case "blue": return Color.BLUE;
            case "yellow": return Color.YELLOW;
            case "white": return Color.WHITE;
            case "black": return Color.BLACK;
            default: return Color.TRANSPARENT;
        }
    }
}
