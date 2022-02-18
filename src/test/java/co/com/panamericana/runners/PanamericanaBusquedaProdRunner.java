package co.com.panamericana.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\co.com.panamericana.features\\PanamericanaBusquedaProd.feature",
        //tags = "@Escenario3",
        glue = "co.com.panamericana.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class PanamericanaBusquedaProdRunner {
}
