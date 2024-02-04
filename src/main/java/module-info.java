module com.modeus {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.modeus to javafx.fxml;
    exports com.modeus;
}
