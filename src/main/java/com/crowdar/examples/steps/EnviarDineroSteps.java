package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.EnviarDineroService;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnviarDineroSteps extends PageSteps {

    @When("Hago click en Con Alias CBU o CVU")
    public void clickConAliasCBUcvu(){EnviarDineroService.clickBotonAliasCBU();}

    @When("Hago click en Con Numero de telefono")
    public void clickConNumeroTelefono(){EnviarDineroService.clickBotonTelefono();}

    @When("Hago click en una cuenta asociada")
    public void clickCuentaAsociada(){EnviarDineroService.clickCuentaUsuario();}

    @When("Elijo el monto predeterminado de $5.000")
    public void elegirMontoEnvio(){EnviarDineroService.clickMontoAenviar();}

    @When("Ingreso el monto ${int}")
    public void elegirMontoEnvio(int monto){EnviarDineroService.IngresarMontoPersonalizado(monto);}

    @When("Hago click en el boton Continuar")
    public void clickBotonContinuar(){EnviarDineroService.clickBotonContinuar();}

    @When("Hago Click en el boton Enviar")
    public void clickBotonEnviar(){EnviarDineroService.clickBotonEnviar();}

    @When("Ingreso el PIN {int}")
    public void ingresarPIN(int PIN){EnviarDineroService.ingresarPIN(PIN);}

    @Then("Se visualiza el comprobante")
    public void validarComprobante(){EnviarDineroService.validacionComprobante();}

    @When("Hago click en el boton ver comprobante")
    public void clickVerComprobante(){EnviarDineroService.clickVerComprobante();}

    @When("Hago click en Nuevo contacto")
    public void clickNuevoContacto(){EnviarDineroService.clickAgregarContacto();}

    @When("Ingreso el numero telefonico {string}")
    public void inputIngresoNuevoContacto(String telefono){EnviarDineroService.ingresoNuevoContactoTelefonico(telefono);}

    @When("Hago click en el boton siguiente de la pantalla agregar Nuevo contacto")
    public void clickSiguienteNuevoContacto(){EnviarDineroService.clickAgregarContactoSiguiente();}

    @When("Ingreso el nombre del contacto")
    public void IngresoNombreNuevoContacto(){EnviarDineroService.ingresoNombreNuevoContactoTelefonico();}

    @Then("se visualiza la pantalla de operacion exitosa")
    public void visualizarPantallaEnvioExitosa(){EnviarDineroService.validarPantallaExitosa();}

    @Then("se visualiza el mensaje de PIN incorrecto")
    public void visualizarMensajePinIncorrecto(){EnviarDineroService.validarErrorPin();}

}
