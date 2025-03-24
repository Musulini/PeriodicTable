package com.example.periodictable.controller;

import com.example.periodictable.dao.ElementsDao;
import com.example.periodictable.model.Element;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.apache.commons.lang3.time.StopWatch;

import java.io.File;
import java.io.IOException;
import java.util.EventObject;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class ElementViewController {

	@FXML
	AnchorPane mainContainer;
	// ELEMENT PANE
	@FXML
	private Pane nameContainer;

	@FXML
	private Pane triangleElement;

	@FXML
	ImageView elementImage;
	@FXML
	Label nameLabel;
	@FXML
	Label symbolLabel;
	@FXML
	Label atomicNumberLabel;
	@FXML
	Label atomicMassLabel;
	@FXML
	Label groupLabel;
	@FXML
	Label periodLabel;
	@FXML
	Label aggregationStateLabel;
	@FXML
	Label densityLabel;
	@FXML
	Label fusionPointLabel;
	@FXML
	Label boillingPointLabel;
	@FXML
	Label electronConfigLabel;
	@FXML
	Label electroNegativityLabel;
	@FXML
	Label valencyLabel;
	@FXML
	Label atomicRadiusLabel;
	@FXML
	Label discovererLabel;
	@FXML
	Label discoveringYearLabel;

	String[] styles = new String[2];

	@FXML
	public void clickedButton(ActionEvent event) throws IOException {
		backtoPeriodicTable(event);
	}

	@FXML
	public void keyPressed(KeyEvent event) throws IOException {
		if (event.getCode().equals(KeyCode.ESCAPE)) {
			backtoPeriodicTable(event);
		}

		//Left Arrow (Previous Element)
		if (event.getCode().equals(KeyCode.LEFT)) {
			previousElement();
			System.out.println("ola left");
		}

		//Left Arrow (Next Element)
		if (event.getCode().equals(KeyCode.RIGHT)) {
			System.out.println("ola right");
			nextElement();
		}
	}

	public void handleInfo(Element element, String[] elementStyleClasses) {
		styles = elementStyleClasses;
		File file = new File(element.getImage());
		Image image = new Image(file.toURI().toString());

		//AÑADIENDO ESTILO A nameContainer
		nameContainer.getStyleClass().add(elementStyleClasses[0]);
		triangleElement.getStyleClass().add(elementStyleClasses[1]);

		System.out.println(nameContainer.getStyle());

		//AÑADIENDO CONTENIDO
		elementImage.setImage(image);
		nameLabel.setText(element.getName());
		symbolLabel.setText(element.getSymbol());
		atomicNumberLabel.setText(String.valueOf(element.getAtomicNumber()));
		atomicMassLabel.setText(String.valueOf(element.getAtomicMass()));
		groupLabel.setText(String.valueOf(element.getAtomicGroup()));
		periodLabel.setText(String.valueOf(element.getPeriod()));
		aggregationStateLabel.setText(String.valueOf(element.getAggregationState()));
		densityLabel.setText(String.valueOf(element.getDensity()));
		fusionPointLabel.setText(String.valueOf(element.getFusionPoint()));
		boillingPointLabel.setText(String.valueOf(element.getBoilingPoint()));
		electronConfigLabel.setText(String.valueOf(element.getElectronConfiguration()));
		electroNegativityLabel.setText(String.valueOf(element.getElectronegativity()));
		valencyLabel.setText(String.valueOf(element.getValency()));
		atomicRadiusLabel.setText(String.valueOf(element.getAtomicRadius()));
		discovererLabel.setText(String.valueOf(element.getDiscoverer()));
		discoveringYearLabel.setText(String.valueOf(element.getDiscoveryYear()));

		rotateImage();
	}

	public void rotateImage() {
		TranslateTransition translate = new TranslateTransition();
		RotateTransition rotateZ = new RotateTransition();
		FadeTransition fade = new FadeTransition();

		translate.setNode(elementImage);
		translate.setDuration(Duration.seconds(1));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByY(10);
		translate.setAutoReverse(true);
		translate.play();

		rotateZ.setNode(elementImage);
		rotateZ.setDuration(Duration.millis(7000));
		rotateZ.setCycleCount(TranslateTransition.INDEFINITE);
		rotateZ.setInterpolator(Interpolator.LINEAR);
		rotateZ.setByAngle(360);
		rotateZ.play();


		fade.setNode(elementImage);
		fade.setDuration(Duration.seconds(1));
		fade.setInterpolator(Interpolator.LINEAR);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}

	public void backtoPeriodicTable(EventObject event) throws IOException {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/periodictable/Periodic_Table.fxml")));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void previousElement() throws IOException {
		int atomicNumber = parseInt(atomicNumberLabel.getText());
		ElementsDao elementsDao = new ElementsDao();
		handleInfo(elementsDao.getElement(atomicNumber - 1), styles);
	}

	public void nextElement() throws IOException {
		int atomicNumber = parseInt(atomicNumberLabel.getText());
		ElementsDao elementsDao = new ElementsDao();
		handleInfo(elementsDao.getElement(atomicNumber + 1), styles);
	}
}
