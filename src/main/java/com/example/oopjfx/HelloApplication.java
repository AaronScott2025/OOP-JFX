package com.example.oopjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("OOP.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 791, 514);
        scene.getStylesheets().add("styles.css");
        stage.setTitle("OOP/CSS PROJECT!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}