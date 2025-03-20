package com.example.periodictable.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ElementView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String stylePath = ElementView.class.getResource("/com/example/periodictable/css/Information_View.css").toExternalForm();
        String iconPath = ElementView.class.getResource("/com/example/periodictable/icons/App_Icon.png").toExternalForm();
        Image icon = new Image(iconPath);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/periodictable/Element_View.fxml")));

        Scene scene = new Scene(root);
        scene.getStylesheets().add(stylePath);
        stage.setTitle("Info. Elementos");
        stage.getIcons().add(icon);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
