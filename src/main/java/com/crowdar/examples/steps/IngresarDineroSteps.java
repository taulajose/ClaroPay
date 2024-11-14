package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.IngresarDineroService;
import cucumber.api.java.en.When;

import java.util.NoSuchElementException;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class IngresarDineroSteps extends PageSteps {

    @When("Hago click en boton Con Tarjeta de debito")
    public void clickBotonMovimientos() {
        IngresarDineroService.clickConTarjetaDebito();
    }

    @When("Hago click en boton Ingresar dinero en la pantalla de confirmacion")
    public void clickConfirmarIngresarDinero() {
        IngresarDineroService.clickConfirmarIngresoDinero();
    }



}
