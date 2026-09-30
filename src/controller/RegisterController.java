package controller;

import io.github.palexdev.materialfx.controls.MFXStepper;
import io.github.palexdev.materialfx.controls.MFXStepperToggle;
import io.github.palexdev.mfxresources.fonts.MFXFontIcon;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.util.Objects;

public class RegisterController {

    @FXML
    private MFXStepper mfxStepper;

    @FXML
    public void initialize(){

        try {

            Parent personal = FXMLLoader.load(getClass().getResource("/view/fxml/PersonalData.fxml"));
            Parent contact = FXMLLoader.load(getClass().getResource("/view/fxml/ContactData.fxml"));
            Parent account = FXMLLoader.load(getClass().getResource("/view/fxml/AccountData.fxml"));

            MFXFontIcon userIcon = new MFXFontIcon("fas-user");
            MFXFontIcon accessIcon = new MFXFontIcon("fas-lock");
            MFXFontIcon confirmationIcon = new MFXFontIcon("fas-check");


           MFXStepperToggle personalStep = new MFXStepperToggle("Dados pessoais", userIcon, personal);
            MFXStepperToggle contactStep = new MFXStepperToggle("Contacto",accessIcon, contact);
            MFXStepperToggle accountStep = new MFXStepperToggle("Dados de acesso",confirmationIcon,account);

           mfxStepper.getStepperToggles().addAll(
                    personalStep, contactStep, accountStep);


        }catch (IOException e)
            {
            e.printStackTrace();
            }

    }


}
