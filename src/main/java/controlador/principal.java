package controlador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class principal extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(principal.class.getResource("/vista/vista1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("/controlador/CSS/estilo1.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}