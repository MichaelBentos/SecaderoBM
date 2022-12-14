module com.example.secadero {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.secadero to javafx.fxml;
    exports com.secadero;

    opens com.secadero.modelo to javafx.fxml;
    exports com.secadero.modelo;

    opens com.secadero.controlador to javafx.fxml;
    exports com.secadero.controlador;
}