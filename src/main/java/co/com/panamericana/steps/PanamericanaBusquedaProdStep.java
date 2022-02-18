package co.com.panamericana.steps;


import co.com.panamericana.driver.SeleniumWebDriver;
import co.com.panamericana.pageobjects.PanamericanaBusquedaProdPage;
import co.com.panamericana.utils.ExcelData;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class PanamericanaBusquedaProdStep {

    public void escribirMasEnter(By elemento,String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto, Keys.ENTER);
    }

    public void limpiarTxt(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).clear();
    }
    private void darClick(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String,String>>();
    @Step
    public void busquedaPorTextbox() {
        try{
            leerExcel = ExcelData.leerXlsx("DataExcel.xlsx","TerminosBusqueda");

        }catch (IOException e){
            e.printStackTrace();
        }
        for(int i = 0; i < leerExcel.size(); i++){
            escribirMasEnter(PanamericanaBusquedaProdPage.getTxtBarraBusqueda(),leerExcel.get(i).get("Busquedas"));

            /* codigo para manejar exepciones de Robot
            try{
                Robot robot=new Robot();
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

            }catch (AWTException e){
                e.printStackTrace();
            } */
            //limpiarTxt(AlkostoBusquedaProdPage.getTxtBarraBusqueda());
            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            darClick(PanamericanaBusquedaProdPage.getUrlSmartWatch());
        }
    }

    public String obtenerTexto(By elemento){
        return SeleniumWebDriver.driver.findElement(elemento).getText();

    }
    public void validar(By elemento,String texto){
        assertEquals(obtenerTexto(elemento),texto);
    }

    @Step
    public void validarBusqueda() {
        try {
            leerExcel = ExcelData.leerXlsx("DataExcel.xlsx", "TerminosBusqueda");
        } catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i<leerExcel.size(); i++){
            validar(PanamericanaBusquedaProdPage.getLblSmartWatch(),leerExcel.get(i).get("Validar"));
        }
    }

    @Step
    public void busquedaPorCategoria(){
        darClick(PanamericanaBusquedaProdPage.getImgCategoriaLibros());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        darClick(PanamericanaBusquedaProdPage.getImgCategoriaLiteratura());
        try{
            Thread.sleep(7000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        darClick(PanamericanaBusquedaProdPage.getBtnCargasMasProductos());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        darClick(PanamericanaBusquedaProdPage.getUrlLibroSeleccionado());
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Step
    public void validarBusquedaPorCategoria(String producto){
        validar(PanamericanaBusquedaProdPage.getLblLibroSeleccionado(),producto );

    }

@Step
    public void busquedaOpcionMenu(){
        darClick(PanamericanaBusquedaProdPage.getBtnMenu());
        darClick(PanamericanaBusquedaProdPage.getLinkTecnologia());
    try{
        Thread.sleep(3000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        darClick(PanamericanaBusquedaProdPage.getLinkPortatiles());
    try{
        Thread.sleep(4000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
        darClick(PanamericanaBusquedaProdPage.getUrlPortatilSeleccionado());
    try{
        Thread.sleep(3000);
    }catch (InterruptedException e) {
        e.printStackTrace();
    }
}

@Step
    public void validarBusquedaOpcionMenu(String portatil){
        validar(PanamericanaBusquedaProdPage.getLblPortatilSeleccionado(),portatil);

}





}
