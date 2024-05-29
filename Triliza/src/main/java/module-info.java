module sample.triliza {
    requires javafx.controls;
    requires javafx.fxml;

    opens sample.triliza to javafx.fxml;
    exports sample.triliza;
}
