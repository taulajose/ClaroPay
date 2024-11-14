package com.crowdar.examples.constants;

public class RecargaSubeConstants {

    public static final String TITULO_TARJETA_SUBE= "XPATH://android.widget.TextView[@text=\"Tarjetas SUBE\"]";
    public static final String TARJETA_SUBE= "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";

    public static class editarAlias{
        public static final String BOTON_EDITAR_ALIAS= "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup";
        public static final String INPUT_ALIAS= "XPATH://android.widget.EditText[@text=\"Alias del contacto\"]";
        public static final String BOTON_CANCELAR_EDICION= "XPATH://boton cancelar edicion //android.widget.TextView[@text=\"Cancelar\"]";
        public static final String BOTON_GUARDAR_ALIAS= "XPATH://boton guardar alias //android.widget.TextView[@text=\"Guardar\"]";

    }

    public static final String BOTON_ELIMINAR_TARJETA= "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup";
    public static final String BOTON_AGREGAR_NUEVA_SUBE= "XPATH://android.widget.TextView[@resource-id=\"custom-text\"]"; //
    // titulo nueva tarjeta //android.view.View[@text="Nueva tarjeta SUBE"]
    public static final String INPUT_NUMERO_SUBE= "XPATH://android.widget.EditText[@text=\"Número de SUBE\"]";
    public static final String INPUT_ALIAS_NUEVA_SUBE= "XPATH://android.widget.EditText[@text=\"Alias (Opcional)\"]";

    public static final String BOTON_CONTINUAR_EDICION= "XPATH://android.widget.TextView[@text=\"Continuar\"]";
    public static final String TITULO_ELEGI_EL_MONTO= "XPATH://android.widget.TextView[@text=\"Elegí el monto a recargar en tu SUBE\"]";
    public static final String OPCION_OTROS_MONTOS= "XPATH://android.widget.TextView[@text=\"Otro monto\"]";
    public static final String MONTO_RECARGA= "XPATH://android.widget.TextView[@text=\"$ 2000\"]";

    //PANTALLA CONFIRMACION

    public static class pantallaConfirmacion{
        public static final String TITULO= "XPATH://android.widget.TextView[@text=\"Total a recargar\"]";
        public static final String MONTO_A_RECARGAR= "XPATH://android.widget.TextView[@text=\"2000\"]";
        public static final String NUMERO_TARJETA_SUBE= "XPATH://android.widget.TextView[@text=\"6061267001325008\"]";
        public static final String TARJETA_BILLETERA= "XPATH://android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";
        public static final String BOTON_PAGAR= "XPATH://android.widget.TextView[@text=\"Pagar\"]";

    }
    //PANTALLA EXITOSA
    public static class pantallaRecargaExitosa{
        public static final String TITULO= "XPATH:";
    }


    //PANTALLA ERROR
    public static class pantallaRecargaError{
        public static final String MENSAJE= "XPATH://android.widget.TextView[@text=\"Ups! No se pudo procesar la recarga. Intentá nuevamente.\"]";
        public static final String BOTON_VOLVER_A_INICIO= "XPATH://android.widget.TextView[@text=\"Volver al inicio\"]";
        public static final String BOTON_REINTENTAR= "XPATH://android.widget.TextView[@text=\"Reintentar\"]";
    }
}
