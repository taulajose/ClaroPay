package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.PerfilConstants;
import org.testng.Assert;

import java.security.SecureRandom;

public class PerfilService {

    public static void VisualizaMensajeError(){

        MobileActionManager.waitVisibility(PerfilConstants.BANNER_ESPERA_PARA_VOLVER_A_CAMBIAR_ALIAS);
        MobileActionManager.isVisible(PerfilConstants.BANNER_ESPERA_PARA_VOLVER_A_CAMBIAR_ALIAS);
    Assert.assertEquals(MobileActionManager.getText(PerfilConstants.BANNER_ESPERA_PARA_VOLVER_A_CAMBIAR_ALIAS), "Tenés que esperar 24hs para cambiar tu alias nuevamente");
    }

    public static void VisualizaMensajeExito(){

        MobileActionManager.waitVisibility(PerfilConstants.BANNER_ALIAS_MODIFICADO_EXITOSAMENTE);
        MobileActionManager.isVisible(PerfilConstants.BANNER_ALIAS_MODIFICADO_EXITOSAMENTE);
        Assert.assertEquals(MobileActionManager.getText(PerfilConstants.BANNER_ALIAS_MODIFICADO_EXITOSAMENTE),"Tu alias fue actualizado con éxito");
    }

    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private static final int NAME_LENGTH = 8;

    public static String generateRandomName() {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(NAME_LENGTH);

        for (int i = 0; i < NAME_LENGTH; i++) {
            int index = random.nextInt(ALPHA_NUMERIC_STRING.length());
            sb.append(ALPHA_NUMERIC_STRING.charAt(index));
        }

        return sb.toString();
    }

    public static void modificarAlias(){
        MobileActionManager.click(HomeConstants.BOTON_PERFIL);
        MobileActionManager.click(HomeConstants.BOTON_PERFIL);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_PERFIL);
        MobileActionManager.click(PerfilConstants.BOTON_MI_CVU);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_MI_CUENTA);
        MobileActionManager.click(PerfilConstants.BOTON_EDITAR_ALIAS);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_EDITAR_ALIAS);
        String aliasRandom = generateRandomName();
        MobileActionManager.setInput(PerfilConstants.INPUT_EDITAR_ALIAS, aliasRandom);
        MobileActionManager.waitClickable(PerfilConstants.BOTON_CONFIRMAR_CAMBIO_ALIAS);
        MobileActionManager.click(PerfilConstants.BOTON_CONFIRMAR_CAMBIO_ALIAS);

    }

    public static void clickBotonPerfil(){
        MobileActionManager.click(HomeConstants.BOTON_PERFIL);
        MobileActionManager.click(HomeConstants.BOTON_PERFIL);

    }

    public static void clickMiCVU(){
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_PERFIL);
        MobileActionManager.click(PerfilConstants.BOTON_MI_CVU);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_MI_CUENTA);

    }

    public static void clickBotonEditarAlias(){
        MobileActionManager.click(PerfilConstants.BOTON_EDITAR_ALIAS);
        MobileActionManager.waitVisibility(PerfilConstants.TITULO_EDITAR_ALIAS);
    }


    public static void ingresarAlias(){

        String aliasRandom = generateRandomName();
        MobileActionManager.setInput(PerfilConstants.INPUT_EDITAR_ALIAS, aliasRandom);
        MobileActionManager.waitClickable(PerfilConstants.BOTON_CONFIRMAR_CAMBIO_ALIAS);
    }

    public static void clickBotonConfirmarModificarAlias(){

        MobileActionManager.click(PerfilConstants.BOTON_CONFIRMAR_CAMBIO_ALIAS);

    }


}
