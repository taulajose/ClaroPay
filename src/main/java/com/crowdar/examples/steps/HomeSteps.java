package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import cucumber.api.java.en.When;

import java.util.NoSuchElementException;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @When("Hago click en boton Recarga")
    public void clickBotonRecarga() {
        try {
            MobileActionManager.click(HomeConstants.BOTON_RECARGA);
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Error: Boton Recarga");
        }

    }
    @When("Hago click en boton Movimientos")
    public void clickBotonMovimientos() {
        MobileActionManager.click(HomeConstants.BOTON_MOVIMIENTOS_NAVBAR);
    }

    @When("Hago click en el boton Enviar")
    public void clickEnBotonEnvio() {MobileActionManager.click(HomeConstants.BOTON_ENVIAR_DINERO);}

    @When("Hago click en el boton Ingresar")
    public void clickEnBotonIngresar() {MobileActionManager.click(HomeConstants.BOTON_INGRESAR_DINERO);}

    @When("Hago click en Perfil")
    public void irPerfil() {
        MobileActionManager.click(HomeConstants.BOTON_PERFIL);
    }

}
