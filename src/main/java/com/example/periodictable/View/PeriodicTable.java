package com.example.periodictable.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class PeriodicTable extends Application {


    // double screenWidth = Screen.getPrimary().getBounds().getWidth();
   // double screenHeight = Screen.getPrimary().getBounds().getHeight();

    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/periodictable/Periodic_Table.fxml")));

        Scene scene = new Scene(root);

       //stage.setFullScreen(true);
       // stage.setResizable(false);

        String stylePath = PeriodicTable.class.getResource("/com/example/periodictable/css/Style.css").toExternalForm();
        scene.getStylesheets().add(stylePath);

        String iconPath = PeriodicTable.class.getResource("/com/example/periodictable/icons/App_Icon.png").toExternalForm();
        Image icon = new Image(iconPath);
        stage.getIcons().add(icon);

        stage.setTitle("Tabla Periódica");
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}