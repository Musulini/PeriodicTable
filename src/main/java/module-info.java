module com.example.periodictable {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires java.desktop;

    opens com.example.periodictable to javafx.fxml;
    exports com.example.periodictable;
    exports com.example.periodictable.controller;
    opens com.example.periodictable.controller to javafx.fxml;
}