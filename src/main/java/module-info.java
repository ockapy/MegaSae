module com.sae {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sae to javafx.fxml;
    exports com.sae;
}
