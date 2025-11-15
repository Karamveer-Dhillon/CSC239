module com.example.topic6lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.topic6lab2 to javafx.fxml;
    exports com.example.topic6lab2;
}