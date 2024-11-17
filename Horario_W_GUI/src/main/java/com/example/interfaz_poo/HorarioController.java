package com.example.interfaz_poo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HorarioController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}