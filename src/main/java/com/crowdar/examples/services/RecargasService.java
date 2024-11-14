package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EnviarDineroConstants;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.MovimientosConstants;
import com.crowdar.examples.constants.RecargasConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class RecargasService {

    public static void AgregarNuevaLineaParaRecargas() {
        MobileActionManager.waitVisibility(RecargasConstants.BOTON_CONFIRMAR);
        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void HacerCashback(String monto) {
        MobileActionManager.waitVisibility(RecargasConstants.BOTON_CONFIRMAR);
        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void ValidarExistenciaEtiquetasCashback() {
        MobileActionManager.waitVisibility(RecargasConstants.BOTON_CONFIRMAR);
        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void RealizarRecarga() {

            MobileActionManager.click(HomeConstants.BOTON_RECARGA);
            MobileActionManager.waitVisibility(RecargasConstants.TITULO_RECARGA_CLARO);
            MobileActionManager.click(RecargasConstants.BOTON_MI_NUMERO);
            MobileActionManager.click(RecargasConstants.OPCION_OTROS_MONTOS);
            MobileActionManager.click(RecargasConstants.ETIQUETA_CASHBACK);
            MobileActionManager.waitVisibility(RecargasConstants.pantallaConfirmacionRecarga.LINEA_A_RECARGAR);
            MobileActionManager.click(RecargasConstants.pantallaConfirmacionRecarga.BOTON_CONFIRMACION_RECARGA);
            MobileActionManager.waitVisibility(RecargasConstants.pantallaRecargaExitosa.GIF);
    }

    public static void ValidarPantallaRecargaExitosa(){
        MobileActionManager.waitVisibility(RecargasConstants.pantallaRecargaExitosa.GIF);
        Assert.assertTrue(MobileActionManager.isVisible(RecargasConstants.pantallaRecargaExitosa.GIF), "");
        Assert.assertTrue(MobileActionManager.isVisible(RecargasConstants.pantallaRecargaExitosa.TITULO_MONTO_RECARGADO), "");
        Assert.assertTrue(MobileActionManager.isVisible(RecargasConstants.pantallaRecargaExitosa.MONTO_RECARGADO), "");
        Assert.assertTrue(MobileActionManager.isVisible(RecargasConstants.pantallaRecargaExitosa.BOTON_VOLVER_AL_INICIO), "");
        Assert.assertTrue(MobileActionManager.isVisible(RecargasConstants.pantallaRecargaExitosa.BOTON_REALIZAR_OTRA_RECARGA), "");
        MobileActionManager.click(RecargasConstants.pantallaRecargaExitosa.BOTON_VOLVER_AL_INICIO);


    }



}