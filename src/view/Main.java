package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

//        UserDao ud =new UserDao(JPAUtil.getEntityManagerFactory());
//
//        User user = new User(null,"luis","luis@gmail.com","Teste1","Luis","Nhabangue");
//
//        ud.createUser(user);
//

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



}
