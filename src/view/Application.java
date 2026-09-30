package view;

import io.github.palexdev.materialfx.theming.JavaFXThemes;
import io.github.palexdev.materialfx.theming.MaterialFXStylesheets;
import io.github.palexdev.materialfx.theming.UserAgentBuilder;
import javafx.fxml.FXMLLoader;
import io.github.palexdev.mfxresources.fonts.MFXFontIcon;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;


public class Application extends javafx.application.Application {



    @Override
    public void start(Stage stage) throws IOException {
        UserAgentBuilder.builder().themes(JavaFXThemes.MODENA)
                .themes(MaterialFXStylesheets.forAssemble(true))
                .setDeploy(true)
                .setResolveAssets(true)
                .build()
                .setGlobal();



        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/RegisterStepper.fxml"));
      //  Parent root = FXMLLoader.load();

        Scene scene = new Scene(fxmlLoader.load());
        


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }




}
