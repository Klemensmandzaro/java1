module com.example.zadanie13_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.zadanie13_2 to javafx.fxml;
    exports com.example.zadanie13_2;
}