module com.project.fall2021extra {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.project.fall2021extra to javafx.fxml;
    exports com.project.fall2021extra;
}