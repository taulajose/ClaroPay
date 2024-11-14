package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.MovimientosConstants;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class MovimientosService {

    public static void clickBotonFiltros(){
        MobileActionManager.click(MovimientosConstants.BOTON_FILTROS);
        //MobileActionManager.isVisible(MovimientosConstants.TITULO_PANTALLA);
    }

    public static void seleccionarFiltro(String filtro){
        //Se Obtienen los titulos de los filtros en el carrusel
        MobileActionManager.waitVisibility(MovimientosConstants.CARRUSEL_FILTROS);
        List<WebElement> elementos = MobileActionManager.getElement(MovimientosConstants.CARRUSEL_FILTROS).findElements(By.xpath(MovimientosConstants.CARRUSEL_FILTROS_TAGS));

        int cantidad = elementos.size();

        for (int i=0; i<cantidad; i++){
            WebElement elemento = elementos.get(i);
            String titulo = elemento.getText();

            if (Objects.equals(titulo, filtro)){
                String colorAntes = MobileActionManager.getAttribute(MovimientosConstants.TITULO_MOVIMIENTO_XPATH, "class");
                System.out.println("COLOR ANTESSSSSSSSSS " + colorAntes);
                elemento.click();
                //String colorDespues = MobileActionManager.getElement(MovimientosConstants.TITULO_MOVIMIENTO_XPATH).getCssValue("color");
                //System.out.println("COLOR DESPUESSSSSSSSSS " + colorDespues);

            }
            System.out.println("tituloooooooooo "+ titulo);
        }
    }

    public static void tituloMovimiento(String tituloMovimiento) {
        MobileActionManager.click(MovimientosConstants.BOTON_FILTROS);
        MobileActionManager.waitVisibility(MovimientosConstants.COMPONENTE_MOVIMIENTO);
        List<WebElement> elementos = MobileActionManager.getElements(MovimientosConstants.COMPONENTE_MOVIMIENTO);

        int cantidad = elementos.size();
        System.out.println("cantiddaaaad "+ cantidad);
        for (int i=4; i<cantidad; i++){

            String titulo = elementos.get(i).findElement(By.xpath(MovimientosConstants.TITULO_MOVIMIENTO)).getText();
            Assert.assertEquals(titulo,tituloMovimiento);
            System.out.println("tituloooooooooo "+ titulo);
        }


    }
    public static void filtrar(){

        //MobileActionManager.click(HomeConstants.BOTON_MOVIMIENTOS_NAVBAR);
        //MobileActionManager.waitVisibility(MovimientosConstants.TITULO_MOVIMIENTO);
        //MobileActionManager.click(MovimientosConstants.BOTON_FILTROS);

        //MobileElement botonFiltroSube = (MobileElement) MobileActionManager.getElement(MovimientosConstants.BOTON_FILTRO_SUBE);
        //int startX = botonFiltroSube.getLocation().getX();
        //int startY = botonFiltroSube.getLocation().getY();
        //int width = botonFiltroSube.getSize().getWidth();
        //int height = botonFiltroSube.getSize().getHeight();

        // Calcula los puntos de inicio y fin del swipe
        //int swipeStartX = startX + width - 10; // Comienza cerca del borde derecho del elemento
        //int swipeEndX = startX + 10; // Termina cerca del borde izquierdo del elemento
        //int swipeY = startY + height / 2; // A la mitad vertical del elemento

        PerformsTouchActions touchActionsDriver = (PerformsTouchActions) DriverManager.getDriverInstance();
        TouchAction touchAction = new TouchAction(touchActionsDriver );
        touchAction.press(PointOption.point(200, 600)) // Start point
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(200,200)) // End point
                .release()
                .perform();

       // driver.quit();

    }

    public static void filtrarPor(String filtro){
        List movimientos = MobileActionManager.getElements(MovimientosConstants.MOVIMIENTO_DIV);


    }

}
