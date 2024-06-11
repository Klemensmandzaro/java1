module com.example.zadania13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zadania13 to javafx.fxml;
    exports com.example.zadania13;
}