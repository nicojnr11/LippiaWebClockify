package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;
import lippia.web.services.LogOutService;
import lippia.web.services.NewProjectService;

public class NewProjectSteps {

    @And("nombro mi proyecto {string}")
    public void nombroMiProyecto(String NuevoProyecto) {
        NewProjectService.nombreDeNuevoProyecto(NuevoProyecto);
    }

    @Then("se crea un nuevo {string}")
    public void seCreaUnNuevo(String arg0) {
    }
}
