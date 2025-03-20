package com.example.periodictable.controller;

import com.example.periodictable.model.Element;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ElementViewController {
	@FXML
	Label nameLabel;
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

	@FXML
	public void openPeriodicTable(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/periodictable/Periodic_Table.fxml")));
		Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void handleInfo(Element element) {
		nameLabel.setText(element.getName() + "(" + element.getSymbol() + ")");
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
	}
}
