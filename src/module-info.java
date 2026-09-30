module iXitique {
    requires jakarta.persistence;
    requires java.persistence;
    requires  javafx.base;
    requires  javafx.controls;
    requires  javafx.fxml;
    requires  javafx.graphics;
    requires jbcrypt;

    opens view;
    opens controller;
}