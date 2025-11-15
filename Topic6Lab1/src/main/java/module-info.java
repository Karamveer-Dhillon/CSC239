module com.example.topic6lab1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.topic6lab1 to javafx.fxml;
    exports com.example.topic6lab1;
}