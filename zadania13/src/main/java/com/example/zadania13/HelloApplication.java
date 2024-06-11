package com.example.zadania13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.Date;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        TextField imie = new TextField();
        imie.setPromptText("Podaj imie");
        DatePicker data = new DatePicker();
        Button button = new Button("Oblicz");
        Label label = new Label();
        button.setOnAction(actionEvent -> {
            String im = imie.getText();
            LocalDate teraz = LocalDate.now();
            LocalDate wiek = data.getValue();
            int to = teraz.getYear()-wiek.getYear();

            label.setText(im+" ma "+String.valueOf(to)+" lat");
            if (to<0)
            {
                label.setText("Wprowadzono date przyszlosci");
            }
        });

        vbox.getChildren().add(imie);
        vbox.getChildren().add(data);
        vbox.getChildren().add(button);
        vbox.getChildren().add(label);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}