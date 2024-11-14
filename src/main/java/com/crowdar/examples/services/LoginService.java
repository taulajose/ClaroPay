package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.constants.PerfilConstants;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {
    public static void doLogin(String email, String password){
        MobileActionManager.setInput(LoginConstants.INPUT_USER, email);
        MobileActionManager.click(LoginConstants.BUTTON_CONTINUAR);
        MobileActionManager.waitVisibility(LoginConstants.BUTTON_INGRESAR);
        MobileActionManager.setInput(LoginConstants.INPUT_PASSWORD, password);
        MobileActionManager.click(LoginConstants.BUTTON_INGRESAR);

    }

    public static void cerrarSesion(){

        MobileActionManager.click(HomeConstants.BOTON_PERFIL);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_PERFIL);
        MobileActionManager.click(PerfilConstants.BOTON_CERRAR_SESION);

    }

}
