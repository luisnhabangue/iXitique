package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;


public class AuthController {
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfPassword;

    @FXML
    public void btnLogin(ActionEvent actionEvent) {

    tfUsername.getText();

    }
}
