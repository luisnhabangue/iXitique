package controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import service.AuthService;


public class AuthController {
    AuthService as;
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField pfPassword;


    public AuthController() {
      //  this.as = new AuthService();
    }

    @FXML
    public void btnEntrar(ActionEvent actionEvent) {

        String username = tfUsername.getText();
        String password = pfPassword.getText();

        as.login(username,password);


    }

    public void createAccount(ActionEvent actionEvent) {
    }
}
