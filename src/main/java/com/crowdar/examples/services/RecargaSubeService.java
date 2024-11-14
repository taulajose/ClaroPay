package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.RecargaSubeConstants;
import com.crowdar.examples.constants.RecargasConstants;

public class RecargaSubeService {

    public static void modificarAlias(String alias){
        MobileActionManager.isVisible(RecargaSubeConstants.TITULO_TARJETA_SUBE);
        //SWIPE
        MobileActionManager.click(RecargaSubeConstants.editarAlias.BOTON_EDITAR_ALIAS);
        MobileActionManager.setInput(RecargasConstants.INPUT_ALIAS, alias);
        MobileActionManager.click(RecargaSubeConstants.BOTON_CONTINUAR_EDICION);

    }

    public static void eliminarTarjeta(){

        MobileActionManager.isVisible(RecargaSubeConstants.TITULO_TARJETA_SUBE);
        //SWIPE
        MobileActionManager.click(RecargaSubeConstants.BOTON_ELIMINAR_TARJETA);

    }

    public static void realizarRecarga(){
        MobileActionManager.click(HomeConstants.BOTON_RECARGA_SUBE);
        MobileActionManager.click(HomeConstants.BOTON_RECARGA_SUBE);
        MobileActionManager.click(HomeConstants.BOTON_RECARGA_SUBE);
        MobileActionManager.click(HomeConstants.BOTON_RECARGA_SUBE);
        MobileActionManager.isVisible(RecargaSubeConstants.TITULO_TARJETA_SUBE);
        MobileActionManager.click(RecargaSubeConstants.TARJETA_SUBE);
        MobileActionManager.isVisible(RecargaSubeConstants.TITULO_ELEGI_EL_MONTO);
        MobileActionManager.click(RecargaSubeConstants.OPCION_OTROS_MONTOS);
        MobileActionManager.click(RecargaSubeConstants.MONTO_RECARGA);
        MobileActionManager.isVisible(RecargaSubeConstants.pantallaConfirmacion.TITULO);
        MobileActionManager.isVisible(RecargaSubeConstants.pantallaConfirmacion.MONTO_A_RECARGAR);
        MobileActionManager.click(RecargaSubeConstants.pantallaConfirmacion.BOTON_PAGAR);

    }

    public static void validarPantallaRecargaError() {
        MobileActionManager.isVisible(RecargaSubeConstants.pantallaRecargaError.MENSAJE);
        MobileActionManager.isVisible(RecargaSubeConstants.pantallaRecargaError.BOTON_VOLVER_A_INICIO);
        MobileActionManager.isVisible(RecargaSubeConstants.pantallaRecargaError.BOTON_REINTENTAR);
        MobileActionManager.click(RecargaSubeConstants.pantallaRecargaError.BOTON_VOLVER_A_INICIO);
    }
}
