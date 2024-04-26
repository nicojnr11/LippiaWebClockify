package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogOutService;

public class NewProjectSteps {



    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(){
        LogOutService.exitMyAccount();
    }

    @When("clickeo sobre el boton {string}")
    public void clickeoSobreElBoton(String arg0) {
        
        
    }

    @And("nombro mi proyecto {string}")
    public void nombroMiProyecto(String arg0) {
    }

    @Then("valido que se haya creado un nuevo {string}")
    public void validoQueSeHayaCreadoUnNuevo(String arg0) {
    }
}
