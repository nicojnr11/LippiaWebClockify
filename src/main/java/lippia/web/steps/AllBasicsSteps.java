package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ClockifyLoginService;
import lippia.web.services.LogInService;

public class AllBasicsSteps {
    @Given("estoy en la landing page de clockify")
    public void estoyEnLaLandingPageDeClockify() {
        LogInService.urlBase();
    }

    @When("clickeo el boton (.*)$")
    public void clickeoElBoton(String logIn) {
        LogInService.LogInLandingPage(logIn);
    }

    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(String logIn) {
        LogInService.LogInLandingPage(logIn);
    }

    @Then("se crea un nuevo {string}")
    public void seCreaUnNuevo(String arg0) {
    }

}
