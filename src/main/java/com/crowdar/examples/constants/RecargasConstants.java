package com.crowdar.examples.constants;

public class RecargasConstants {

    public static final String TITULO_RECARGA_CLARO= "XPATH://android.view.View[@text=\"Recargar Claro\"]";
    public static final String BANNER_PASATE_A_CLARO= "XPATH:";
    public static final String LINEA_ULTIMAS_RECARGAS= "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";
    public static final String BOTON_RECARGAR_NUEVA_LINEA_CLARO= "XPATH://android.widget.TextView[@resource-id=\"custom-text\"]"; //custom-text  ID
    ///
    public static final String INPUT_LINEA_CLARO= "XPATH:";
    public static final String INPUT_ALIAS= "XPATH:";
    public static final String BOTON_CONFIRMAR= "XPATH:";
    ///
    public static final String BOTON_MI_NUMERO= "XPATH://android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup";

    public static final String BANNER_CASHBACK= "XPATH://android.widget.ImageView";
    public static final String LINK_BANNER_CASHBACK_TERMINOS_CONDICIONES= "XPATH://android.widget.TextView[@text=\"Términos y condiciones\"]";
    public static final String OPCION_OTROS_MONTOS= "XPATH://android.widget.TextView[@text=\"Otros montos\"]";
    public static final String DIV_RECARGA= "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]";
    // monto del componente //android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]
    // cantidad de reintegro //android.widget.TextView[@text="REINTEGRO $300"]
    // porcentaje cashback //android.widget.TextView[@text="REINTEGRO $300"]
    // palabra cashback //android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup
    public static final String TITULO_MONTO_RECARGA= "XPATH:";
    public static final String ETIQUETA_CASHBACK= "XPATH:";
    public static final String BOTON_RECARGAR= "XPATH:(//android.widget.TextView[@text=\"Recargar\"])[4]";

    //PANTALLA CONFIRMACION DE RECARGA

    public static class pantallaConfirmacionRecarga{

        public static final String TITULO= "XPATH://android.widget.TextView[@text=\"Total a recargar\"]";
        public static final String MONTO_A_RECARGAR= "XPATH://android.widget.TextView[@text=\"15000\"]";
        public static final String LINEA_A_RECARGAR = "XPATH://android.widget.TextView[@text=\"3512075852\"]";
        public static final String SALDO_DISPONIBLE_BILLETERA= "XPATH://android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]";
        public static final String BOTON_CONFIRMACION_RECARGA= "XPATH://android.widget.TextView[@text=\"Confirmar Recarga\"]";
        // monto que va a devolver  //android.widget.TextView[@text="$3000"]
        // Total a recargar
        // linea a recargar //android.widget.TextView[@text="3512075852"]
        //banner cashback //android.widget.FrameLayout[@resource-id="android:id/content"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]
    }


    //PANTALLA RECARGA EXITOSA
    public static class pantallaRecargaExitosa {
        public static final String GIF = "XPATH://android.widget.ImageView";
        public static final String MONTO_RECARGADO = "";
        public static final String TITULO_MONTO_RECARGADO = "";
        public static final String BOTON_REALIZAR_OTRA_RECARGA = "XPATH://android.widget.TextView[@text=\"Realizar otra recarga\"]";
        public static final String BOTON_VOLVER_AL_INICIO = "XPATH://android.widget.TextView[@text=\"Volver al Inicio\"]";
    }
    /// PANTALLA RECARGA EXITOSA CASHBACK
    public static final String MONTO_RECARGADO_CASHBACK= "XPATH:XPATH://android.widget.TextView[@text=\"$15000,00 \"]";
    public static final String MONTO_A_DEVOLVER_CASHBACK= "XPATH:";
    public static final String TITULO_MONTO_RECARGADO_CASHBACK= "XPATH:XPATH://android.widget.TextView[@text=\"Te vamos a acreditar en tu billetera $3000\uD83D\uDCB0\"]";

}
