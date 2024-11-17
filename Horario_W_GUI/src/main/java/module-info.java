module com.example.interfaz_poo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.interfaz_poo to javafx.fxml;
    exports com.example.interfaz_poo;
}