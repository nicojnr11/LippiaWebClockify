package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LogInService;

public class CommonSteps {
    @Given("estoy en la landing page de clockify")
    public void estoyEnLaLandingPageDeClockify() {
        LogInService.urlBase();
    }

    @Given("me encuentro el en home de usuarios logueado con una cuenta valida")
    public void meEncuentroElEnHomeDeUsuariosLogueadoConUnaCuentaValida() {
    }


    @Then("se crea un nuevo {string}")
    public void seCreaUnNuevo(String arg0) {
    }

}
