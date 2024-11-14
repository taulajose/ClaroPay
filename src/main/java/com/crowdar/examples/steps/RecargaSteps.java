package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.RecargasService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RecargaSteps extends PageSteps {

    @When("Realizo una recarga")
    public void realizoRecarga(){RecargasService.RealizarRecarga();}

    @Then("se muestra la pantalla de recarga exitosa")
    public void validarPantallaRecargaExitosa(){RecargasService.ValidarPantallaRecargaExitosa();}

}
