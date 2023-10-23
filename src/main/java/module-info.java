module com.example.bd_biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.bd_biblioteca to javafx.fxml;
    exports com.example.bd_biblioteca;
    exports com.example.bd_biblioteca.controlers_scenes;
    opens com.example.bd_biblioteca.controlers_scenes to javafx.fxml;
}