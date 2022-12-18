module com.o92design.scandi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.o92design.scandi to javafx.fxml;
    exports com.o92design.scandi;
}
