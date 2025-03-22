module com.example.periodictable {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;
	requires org.apache.commons.lang3;

	exports com.example.periodictable.controller;
    opens com.example.periodictable.controller to javafx.fxml;
	exports com.example.periodictable.View;
	opens com.example.periodictable.View to javafx.fxml;
}