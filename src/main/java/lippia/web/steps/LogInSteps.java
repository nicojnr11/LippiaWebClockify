package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LandingPageConstants;
import lippia.web.services.LogInService;

public class LogInSteps {

    @And("el sitio cambia a la seccion de log in")
    public void elSitioCambiaALaSeccionDeLogIn(String urlLogInPAge) {
        LogInService.logInLandingPage(urlLogInPAge);
    }

    @And("clickeo el boton (.*)$")
    public static void clickeoElBoton(String logInlandingPage) {
        LogInService.logInLandingPage(logInlandingPage);
    }

    @When("clickeo el boton (.*)$")
    public void clickeoElBoton(String logInManually) {
        LogInService.logInManuallyButton(logInManually);
    }

    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(String logInManually) {
        LogInService.logInManuallyButton(logInManually);
    }



    @And("ingreso un (.*) y un (.*)$")
    public void ingresoUnYUn(String usuario, String password) {
        LogInService.usuarioyPassword(usuario, password);
    }


    @And("clickeo el boton (.*)")
    public void clickeoElBoton(String logInFinal) {
        LogInService.logInButton(logInFinal);
    }

    @Then("soy redirigido la pagina principal de clockify")
    public void soyRedirigidoLaPaginaPrincipalDeClockify() {
      LogInService.myAccountPresent();
    }


}

