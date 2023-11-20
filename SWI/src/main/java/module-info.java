module com.example.swi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;

    opens com.example.swi to javafx.fxml;
    exports com.example.swi;
}