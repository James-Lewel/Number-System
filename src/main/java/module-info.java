module com.example.numbersystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.numbersystem to javafx.fxml;
    exports com.example.numbersystem;
}