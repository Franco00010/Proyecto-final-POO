module com.example.horarios_gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.horarios_gui to javafx.fxml;
    exports com.example.horarios_gui;
}