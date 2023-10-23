package com.example.bd_biblioteca;

import com.example.bd_biblioteca.class_auxiliar.ConexionMySQL;
import javafx.application.Application;
import java.sql.Connection;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        ConexionMySQL SQL = new ConexionMySQL();
        Connection conn = SQL.conectarMySQL();
        System.out.println(conn);
    }

    public static void main(String[] args) {
        launch();
    }
}