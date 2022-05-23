module com.example.fis_escuela_salfa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fis_escuela_salfa to javafx.fxml;
    exports com.example.fis_escuela_salfa;
}