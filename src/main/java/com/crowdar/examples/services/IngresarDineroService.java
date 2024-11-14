package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.IngresarDineroConstants;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class IngresarDineroService {

    public static void clickEnviarDinero(){
        MobileActionManager.click(HomeConstants.BOTON_ENVIAR_DINERO);
    }

    public static void clickConTarjetaDebito() {
        MobileActionManager.waitVisibility(IngresarDineroConstants.BOTON_CON_TARJETA_DEBITO);
        MobileActionManager.click(IngresarDineroConstants.BOTON_CON_TARJETA_DEBITO);
        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void clickConfirmarIngresoDinero() {
        MobileActionManager.waitVisibility(IngresarDineroConstants.BOTON_INGRESAR_DINERO);
        MobileActionManager.click(IngresarDineroConstants.BOTON_INGRESAR_DINERO);
        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

}
