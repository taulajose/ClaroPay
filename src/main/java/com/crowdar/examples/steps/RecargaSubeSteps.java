package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.RecargaSubeService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Then;

public class RecargaSubeSteps extends PageSteps {

    @When("elimino la tarjeta SUBE")
    public void eliminarTarjeta(){
        RecargaSubeService.eliminarTarjeta();
    }

    @When("Modifico el alias de la tarjeta SUBE con el nombre (.*)")
    public void modificarAlias(String alias) {
        RecargaSubeService.modificarAlias(alias);
    }

    @When("Realizo una recarga SUBE")
    public void RecargaSube() {
        RecargaSubeService.realizarRecarga();
    }

    @Then("Visualizo la pantalla de error de recarga SUBE")
    public void ValidarPantallaError() {
        RecargaSubeService.validarPantallaRecargaError();
    }

}
