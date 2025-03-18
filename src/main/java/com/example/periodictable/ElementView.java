package com.example.periodictable;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class ElementView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Element_View.fxml"));

        Scene scene = new Scene(root);

        String stylePath = ElementView.class.getResource("css/Element_View.css").toExternalForm();
        scene.getStylesheets().add(stylePath);

        String iconPath = ElementView.class.getResource("icons/App_Icon.png").toExternalForm();
        Image icon = new Image(iconPath);
        stage.getIcons().add(icon);

        stage.setTitle("Info. Elementos");
        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
