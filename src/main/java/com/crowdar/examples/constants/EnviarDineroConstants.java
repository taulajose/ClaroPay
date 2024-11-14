package com.crowdar.examples.constants;


public class EnviarDineroConstants {

    public static final String TITULO= "XPATH://android.view.View[@text=\"Enviar dinero\"]";
    public static final String BOTON_CON_ALIAS_CBU= "XPATH://android.widget.TextView[@text=\"Con alias, CBU o CVU\"]";
    public static final String BOTON_CON_NUMERO_TELEFONO= "XPATH://android.widget.TextView[@text=\"Con número de teléfono\"]";
    public static final String TITULO_CON_NUMERO_TELEFONO= "XPATH://android.view.View[@text=\"A una cuenta Claro Pay\"]";
    public static final String BOTON_NUEVO_CONTACTO= "XPATH://android.widget.TextView[@text=\"Nuevo contacto\"]";
    public static final String INPUT_NUEVO_CONTACTO= "XPATH://android.widget.EditText[@text=\"Número de teléfono\"]";
    public static final String BOTON_SIGUIENTE_NUEVO_CONTACTO= "XPATH://android.widget.TextView[@text=\"Siguiente\"]";
    public static final String INPUT_NOMBRE_NUEVO_CONTACTO= "XPATH://android.widget.EditText[@text=\"Nombre Apellido\"]";




    public static class pantalla_1_AunaCuenta {
        public static final String TITULO = "XPATH://android.view.View[@text=\"A una cuenta\"]";
        public static final String CUENTA = "XPATH://android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup";

        public static final String BOTON_AGREGAR_CUENTA = "XPATH://android.widget.TextView[@text=\"Agregar cuenta\"]";

    }
//PANTALLA ENVIAR DINERO
    public static class pantalla_2_EnviarDinero {
        public static final String TITULO = "XPATH://android.view.View[@text=\"Enviar dinero\"]";
        public static final String MONTO_A_ENVIAR = "XPATH://android.widget.TextView[@text=\"$5.000\"]";
        public static final String MONTO_5000 = "XPATH://android.widget.TextView[@resource-id=\"custom-text\" and @text=\"$5000\"]";
        public static final String BOTON_CONTINUAR = "XPATH://android.widget.TextView[@text=\"Continuar\"]";
        public static final String MONTO_TECLADO_NUMERICO_1 = "XPATH://android.widget.TextView[@text=\"1\"]";
        public static final String MONTO_TECLADO_NUMERICO_2 = "XPATH://android.widget.TextView[@text=\"2\"]";
        public static final String MONTO_TECLADO_NUMERICO_3 = "XPATH://android.widget.TextView[@text=\"3\"]";
        public static final String MONTO_TECLADO_NUMERICO_4 = "XPATH://android.widget.TextView[@text=\"4\"]";
        public static final String MONTO_TECLADO_NUMERICO_5 = "XPATH://android.widget.TextView[@text=\"5\"]";
        public static final String MONTO_TECLADO_NUMERICO_6 = "XPATH://android.widget.TextView[@text=\"6\"]";
        public static final String MONTO_TECLADO_NUMERICO_7 = "XPATH://android.widget.TextView[@text=\"7\"]";
        public static final String MONTO_TECLADO_NUMERICO_8 = "XPATH://android.widget.TextView[@text=\"8\"]";
        public static final String MONTO_TECLADO_NUMERICO_9 = "XPATH://android.widget.TextView[@text=\"9\"]";
        public static final String MONTO_TECLADO_NUMERICO_0 = "XPATH://android.widget.TextView[@text=\"0\"]";

}
    public static final String MODAL_INGRESAR_PIN = "XPATH://android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]";
    public static final String PIN_COMPONENTE = "//android.widget.TextView";
    public static final String PIN_ERROR_MENSAJE = "XPATH://android.widget.TextView[@text=\"El PIN ingresado es incorrecto\"]";

    //del 7 al 15 y el 0 es el 17
    //PANTALLA CONFIRMACION ENVIO
    public static class pantalla_3_ConfirmacionEnvio {
        public static final String TITULO = "XPATH://android.view.View[@text=\"Total a enviar\"]";
        public static final String MONTO_A_ENVIAR = "XPATH://android.widget.TextView[@resource-id=\"amount-integer\"]";
        public static final String BOTON_ENVIAR = "XPATH://android.widget.TextView[@text=\"Enviar dinero\"]";
        public static final String TITULO_MODAL_PIN = "XPATH://android.widget.TextView[@text=\"Ingresá tu PIN de 4 dígitos.\"]";
        public static final String PIN_1 = "XPATH://android.widget.TextView[@text=\"1\"]";
        public static final String PIN_2 = "XPATH://android.widget.TextView[@text=\"2\"]";
        public static final String PIN_3 = "XPATH://android.widget.TextView[@text=\"3\"]";
        public static final String PIN_4 = "XPATH://android.widget.TextView[@text=\"4\"]";
        public static final String PIN_5 = "XPATH://android.widget.TextView[@text=\"5\"]";
        public static final String PIN_6 = "XPATH://android.widget.TextView[@text=\"6\"]";
        public static final String PIN_7 = "XPATH://android.widget.TextView[@text=\"7\"]";
        public static final String PIN_8 = "XPATH://android.widget.TextView[@text=\"8\"]";
        public static final String PIN_9 = "XPATH://android.widget.TextView[@text=\"9\"]";
        public static final String PIN_0 = "XPATH://android.widget.TextView[@text=\"0\"]";
        public static final String PIN = "//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup";

    }

    //PANTALLA ENVIO EXITOSA
    public static class pantalla_4_RecargaExitosa {
        public static final String TITULO_LISTO = "XPATH://android.widget.TextView[@text=\"¡Listo!\"]";
        public static final String MONTO_ENVIADO = "XPATH://android.widget.TextView[contains(@text, 'Enviaste')]";
        public static final String BOTON_VER_COMPROBANTE = "XPATH://android.widget.TextView[@text=\"Ver comprobante\"]";
        public static final String BOTON_VOLVER_INICIO = "XPATH://android.widget.TextView[@text=\"Volver al Inicio\"]";


    }

    public static class comprobante {
        public static final String TITULO= "XPATH://android.widget.TextView[@text=\"Comprobante de operación\"]";
        public static final String BOTON_COMPARTIRCOMPROBANTE = "XPATH://android.widget.TextView[@text=\"Compartir\"]";
        public static final String TIPO_OPERACION = "XPATH://android.widget.TextView[@text=\"Enviaste dinero\"]";

    }

}
