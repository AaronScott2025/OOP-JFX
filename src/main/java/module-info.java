module com.example.oopjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopjfx to javafx.fxml;
    exports com.example.oopjfx;
}