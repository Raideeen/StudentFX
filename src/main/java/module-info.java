module com.example.studentfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentfx to javafx.fxml;
    exports com.example.studentfx;
}