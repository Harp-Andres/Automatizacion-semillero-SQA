package co.com.panamericana.stepdefinitions;

import co.com.panamericana.driver.SeleniumWebDriver;
import co.com.panamericana.steps.PanamericanaBusquedaProdStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class PanamericanaBusquedaProdStepDefinitions {

    @Steps
    PanamericanaBusquedaProdStep busquedaProdStep = new PanamericanaBusquedaProdStep();

    @Given("^que ingreso a la pagina principal de panamericana$")
    public void queIngresoALaPaginaPrincipalDePanamericana() {
        SeleniumWebDriver.chromeDriver("https://www.panamericana.com.co/");
    }


    @When("^realizo la busqueda por medio de la barra de busqueda de la pagina$")
    public void realizoLaBusquedaPorMedioDeLaBarraDeBusquedaDeLaPagina() {
        busquedaProdStep.busquedaPorTextbox();
    }

    @Then("^valido que se muestre en pantalla la busqueda realizada$")
    public void validoQueSeMuestreEnPantallaLaBusquedaRealizada() {
        busquedaProdStep.validarBusqueda();

    }

    @When("^realizo la busqueda de un producto por medio de la seleccion de categoria LIBROS$")
    public void realizoLaBusquedaDeUnProductoPorMedioDeLaSeleccionDeCategoriaLIBROS() {
        busquedaProdStep.busquedaPorCategoria();

    }


    @Then("^al seleccionar un producto en especifico por medio de categorias LIBROS valido el producto seleccionado (.*)$")
    public void alSeleccionarUnProductoEnEspecificoPorMedioDeCategoriasLIBROSValidoElProductoSeleccionado(String producto) {
    busquedaProdStep.validarBusquedaPorCategoria(producto);

    }

    @When("^realizo la busqueda por la opcion menu hasta seleccionar un portatil$")
    public void realizoLaBusquedaPorLaOpcionMenuHastaSeleccionarUnPortatil() {
        busquedaProdStep.busquedaOpcionMenu();


    }


    @Then("^valido que el portatil seleccionado sea (.*)$")
    public void validoQueElPortatilSeleccionadoSeaNEGRO(String portatil) {
        busquedaProdStep.validarBusquedaOpcionMenu(portatil);


    }

}
