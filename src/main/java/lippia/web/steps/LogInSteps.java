package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import lippia.web.services.LogInService;

public class LogInSteps {

    @Given("estoy en la landing page de clockify")
    public void estoyEnLaLandingPageDeClockify() {
        LogInService.urlBase();
    }


    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(String logIn) {
        LogInService.LogInLandingPage(logIn);
    }

    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(String logInManually) {
        LogInService.logInManuallyButton(logInManually);
    }

    @And("el sitio cambia a la seccion de log in")
    public void elSitioCambiaALaSeccionDeLogIn() {
    }

    @And("ingreso un (.*) y un (.*)$")
    public void ingresoUnYUn(String usuario, String password) {
        LogInService.usuarioyPassword(usuario, password);
    }
    @And("clickeo el boton (.*)")
    public static void clickeoElBoton(String logInFinal) {
        LogInService.logInButton(logInFinal);
    }

    @Then("soy redirigido la pagina principal de clockify")
    public void soyRedirigidoLaPaginaPrincipalDeClockify() {
      LogInService.myAccountPresent();
    }


}

