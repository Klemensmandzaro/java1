package com.example.zadanie13_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vbox = new VBox();
        TextArea area1 = new TextArea();
        TextArea area2 = new TextArea();

        TextField cyfra = new TextField();
        Button button = new Button("Oblicz");
        button.setOnAction(actionEvent -> {
            String[] im = area1.getText().split("");
            int ten = Integer.parseInt(cyfra.getText());
            StringBuilder nowy = new StringBuilder(new String());
            for (String k : im)
            {
                if (k.equals(" "))
                {
                    nowy.append(" ");
                }
                else
                {
                    char to = (char) (k.charAt(0)+ten);
                    nowy.append(to);
                }
            }
            area2.setText(String.valueOf(nowy));
        });

        vbox.getChildren().add(area1);
        vbox.getChildren().add(cyfra);
        vbox.getChildren().add(button);
        vbox.getChildren().add(area2);
        Scene scene = new Scene(vbox, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}