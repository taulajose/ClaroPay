package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.PerfilService;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;

public class PerfilSteps extends PageSteps {

    @When("Cambio el alias")
    public void cambioAlias(){PerfilService.modificarAlias();}

    @When("el usuario ingresa a Mi Perfil")
    public void clickBotonPerfil(){PerfilService.clickBotonPerfil();}

    @When("el usuario hace click en el botón \"Mi CVU\"")
    public void clickMiCVU(){PerfilService.clickMiCVU();}

    @When("el usuario hace click en el botón \"Editar alias\"")
    public void clickEditarAlias(){PerfilService.clickBotonEditarAlias();}

    @When("el usuario ingresa nuevo alias válido")
    public void ingresaroAlias(){PerfilService.ingresarAlias();}

    @When("el usuario hace click en el botón \"Continuar\"")
    public void clickBotonConfirmarCambioAlias(){PerfilService.clickBotonConfirmarModificarAlias();}

    @Then("se visualiza mensaje \"Tu alias fue cambiada con éxito\"")
    public void mensajeCambioAliasExitoso(){PerfilService.VisualizaMensajeExito();}


    @Then("se visualiza mensaje \"Tenés que esperar 24hs para cambiar tu alias nuevamente\"")
    public void mensajeError(){PerfilService.VisualizaMensajeError();}

}
