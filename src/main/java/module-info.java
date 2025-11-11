module org.example.mycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens mycalculator to javafx.fxml;
    exports mycalculator;
    exports mycalculator.OperationImplementations;
    opens mycalculator.OperationImplementations to javafx.fxml;
}