package com.example.periodictable.controller;

import com.example.periodictable.View.ElementView;
import com.example.periodictable.dao.ElementsDao;
import com.example.periodictable.model.Element;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;


public class PeriodicTableController {

	Parent root;
	@FXML
	private Pane elementPane;

	int i = 0;

	@FXML
	public void openElementView(MouseEvent event) throws IOException {
		ElementsDao elementsDao = null;
		try {
			elementsDao = new ElementsDao();
		} catch (FileNotFoundException e) {
			showMessageDialog(null, "No se encontraron elementos");
		}

		elementPane = (Pane) event.getSource();

		Label atomicNumberLabel = (Label) elementPane.getChildren().get(1);
		atomicNumberLabel.getText();

		Element selectedElement = elementsDao.getElement(parseInt(atomicNumberLabel.getText()));

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/periodictable/Element_View.fxml"));
		root = loader.load();

		ElementViewController elementViewController = loader.getController();
		elementViewController.handleInfo(selectedElement);

		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}