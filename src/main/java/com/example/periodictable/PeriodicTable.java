package com.example.periodictable;

import com.example.periodictable.dao.ElementsDao;
import com.example.periodictable.model.Elements;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.EventObject;

import static javax.swing.JOptionPane.*;

public class PeriodicTable extends Application {


    // double screenWidth = Screen.getPrimary().getBounds().getWidth();
   // double screenHeight = Screen.getPrimary().getBounds().getHeight();

    @Override
    public void start(Stage stage) throws IOException {
        try {
            ElementsDao elementsDao = new ElementsDao();
            for (Elements element : elementsDao.getAllElements()) {
                System.out.println(element);
            }
        } catch (FileNotFoundException e) {
            showMessageDialog(null, "No se encontraron elementos");
        }

        Parent root = FXMLLoader.load(getClass().getResource("Periodic_Table.fxml"));

        Scene scene = new Scene(root);

       //stage.setFullScreen(true);
       // stage.setResizable(false);

        String stylePath = PeriodicTable.class.getResource("css/Style.css").toExternalForm();
        scene.getStylesheets().add(stylePath);

        String iconPath = PeriodicTable.class.getResource("icons/App_Icon.png").toExternalForm();
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