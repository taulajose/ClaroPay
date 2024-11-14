package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EnviarDineroConstants;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.MovimientosConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;


public class EnviarDineroService {

    public static void clickBotonAliasCBU() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.TITULO);
        MobileActionManager.click(EnviarDineroConstants.BOTON_CON_ALIAS_CBU);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_1_AunaCuenta.TITULO);
    }

    public static void clickBotonTelefono() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.TITULO);
        MobileActionManager.click(EnviarDineroConstants.BOTON_CON_NUMERO_TELEFONO);
        MobileActionManager.waitVisibility(EnviarDineroConstants.TITULO_CON_NUMERO_TELEFONO);
    }

    public static void clickCuentaUsuario() {
        MobileActionManager.click(EnviarDineroConstants.pantalla_1_AunaCuenta.CUENTA);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_2_EnviarDinero.TITULO);
    }

    public static void clickAgregarContacto() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.BOTON_NUEVO_CONTACTO);
        MobileActionManager.click(EnviarDineroConstants.BOTON_NUEVO_CONTACTO);
    }

    public static void clickAgregarContactoSiguiente() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.BOTON_SIGUIENTE_NUEVO_CONTACTO);
        MobileActionManager.click(EnviarDineroConstants.BOTON_SIGUIENTE_NUEVO_CONTACTO);

    }

    public static void ingresoNuevoContactoTelefonico(String telefono) {
        MobileActionManager.waitVisibility(EnviarDineroConstants.INPUT_NUEVO_CONTACTO);
        MobileActionManager.setInput(EnviarDineroConstants.INPUT_NUEVO_CONTACTO, telefono);
    }

    public static void ingresoNombreNuevoContactoTelefonico() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.INPUT_NOMBRE_NUEVO_CONTACTO);
        MobileActionManager.setInput(EnviarDineroConstants.INPUT_NOMBRE_NUEVO_CONTACTO, "Jorge Perez");
    }

    public static void clickMontoAenviar() {
        MobileActionManager.click(EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_5000);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_A_ENVIAR);
    }

    public static void clickBotonContinuar() {
        MobileActionManager.click(EnviarDineroConstants.pantalla_2_EnviarDinero.BOTON_CONTINUAR);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.BOTON_ENVIAR);
    }

    public static void clickBotonEnviar() {
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.BOTON_ENVIAR);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.TITULO_MODAL_PIN);
    }


    public static void realizarEnvioDinero() {
        MobileActionManager.click(HomeConstants.BOTON_ENVIAR_DINERO);
        MobileActionManager.waitVisibility(EnviarDineroConstants.TITULO);
        MobileActionManager.click(EnviarDineroConstants.BOTON_CON_ALIAS_CBU);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_1_AunaCuenta.TITULO);
        MobileActionManager.click(EnviarDineroConstants.pantalla_1_AunaCuenta.CUENTA);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_2_EnviarDinero.TITULO);
        MobileActionManager.click(EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_5000);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_A_ENVIAR);
        MobileActionManager.click(EnviarDineroConstants.pantalla_2_EnviarDinero.BOTON_CONTINUAR);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.TITULO);
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.BOTON_ENVIAR);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.TITULO_MODAL_PIN);
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_1);
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_3);
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_5);
        MobileActionManager.click(EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_7);


        //Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.CHANGE_LANGUAGE_BUTTON_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }


    public static void ingresarPIN(int pin) {

        String[] a = {EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_0,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_1,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_2,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_3,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_4,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_5,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_6,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_7,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_8,
                EnviarDineroConstants.pantalla_3_ConfirmacionEnvio.PIN_9 };

        String numberStr = String.valueOf(pin);

        // Crea un array para almacenar los dígitos
        int[] digits = new int[numberStr.length()];

        // Extrae cada carácter y conviértelo a un entero
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i); // Obtiene el carácter en la posición i
            digits[i] = Character.getNumericValue(digitChar); // Convierte el carácter a un número entero
        }

        for (int digit : digits) {
            MobileActionManager.click(a[digit]);;
        }

    }


    public static void IngresarMontoPersonalizado(int monto) {

        String[] a = {EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_0,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_1,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_2,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_3,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_4,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_5,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_6,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_7,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_8,
                EnviarDineroConstants.pantalla_2_EnviarDinero.MONTO_TECLADO_NUMERICO_9,
                };

        String numberStr = String.valueOf(monto);

        // Crea un array para almacenar los dígitos
        int[] digits = new int[numberStr.length()];

        // Extrae cada carácter y conviértelo a un entero
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i); // Obtiene el carácter en la posición i
            digits[i] = Character.getNumericValue(digitChar); // Convierte el carácter a un número entero
        }

        for (int digit : digits) {
            MobileActionManager.click(a[digit]);;
        }

    }

    public static void ingresarPin(String PIN) {
        List<WebElement> elementos = MobileActionManager.getElement(EnviarDineroConstants.MODAL_INGRESAR_PIN).findElements(By.xpath(EnviarDineroConstants.PIN_COMPONENTE));
        int cantidad = elementos.size();
        System.out.println("cantidad: " + cantidad);

        // Itera sobre cada carácter del PIN
        for (char digitChar : PIN.toCharArray()) {
            String digitStr = String.valueOf(digitChar); // Convierte el carácter a String

            boolean encontrado = false; // Flag para verificar si se encontró el dígito
            for (int i = 0; i < cantidad; i++) {
                WebElement elemento = elementos.get(i);
                String pin = elemento.getText(); // Obtiene el texto del elemento

                System.out.println("Elemento: " + pin);

                // Usa .equals() para comparar las cadenas
                if (pin.equals(digitStr)) {
                    elemento.click(); // Clica en el elemento si coincide
                    encontrado = true; // Marca que el dígito fue encontrado
                    break; // Sale del bucle interno ya que ya se hizo clic
                }
            }

            if (!encontrado) {
                System.out.println("Dígito " + digitStr + " no encontrado en el teclado.");
            }
        }
    }


    public static void validacionComprobante() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.comprobante.TITULO);
        MobileActionManager.waitVisibility(EnviarDineroConstants.comprobante.BOTON_COMPARTIRCOMPROBANTE);
    }

    public static void clickVerComprobante() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_4_RecargaExitosa.BOTON_VER_COMPROBANTE);
        MobileActionManager.click(EnviarDineroConstants.pantalla_4_RecargaExitosa.BOTON_VER_COMPROBANTE);
    }

    public static void validarPantallaExitosa() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_4_RecargaExitosa.BOTON_VER_COMPROBANTE);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_4_RecargaExitosa.TITULO_LISTO);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_4_RecargaExitosa.BOTON_VOLVER_INICIO);
        MobileActionManager.waitVisibility(EnviarDineroConstants.pantalla_4_RecargaExitosa.MONTO_ENVIADO);
    }

    public static void validarErrorPin() {
        MobileActionManager.waitVisibility(EnviarDineroConstants.PIN_ERROR_MENSAJE);
        String valor = MobileActionManager.getText(EnviarDineroConstants.PIN_ERROR_MENSAJE);
        Assert.assertEquals(valor, "El PIN ingresado es incorrecto" );

    }

}