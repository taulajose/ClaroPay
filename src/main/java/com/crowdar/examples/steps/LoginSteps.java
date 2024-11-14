package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;


public class LoginSteps extends PageSteps {

    @Given("Estoy logueado con usuario (.*) y password (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @When("Cierro la sesion")
    public void cerrarSesion() {LoginService.cerrarSesion();}


}
