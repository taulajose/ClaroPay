package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.MovimientosService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MovimientosSteps extends PageSteps {

    @When("Realizo un filtro")
    public void filtrar(){MovimientosService.filtrar();}

    @When("Hago click en el boton de filtros")
    public void clickBotonFiltros(){MovimientosService.clickBotonFiltros();}

    @When("selecciona el filtro {string}")
    public void seleccionarFiltro(String filtro){MovimientosService.seleccionarFiltro(filtro);}

    @Then("la lista de movimientos debe mostrar solo los que contienen {string} en su título o descripción")
    public void validarFiltro(String titulo){MovimientosService.tituloMovimiento(titulo);}


}
