package controlador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class control {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}