package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import lippia.web.services.ClockifyLoginService;
import lippia.web.services.LogOutService;

public class LogOutSteps {

    @Given("me encuentro el en home de usuarios logueado con una cuenta valida")
    public void meEncuentroElEnHomeDeUsuariosLogueadoConUnaCuentaValida() {
    }

    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(){
        LogOutService.myAccount();
    }

    @And("clickeo el boton (.*)$")
    public void clickeoElBoton(){
        LogOutService.exitMyAccount();
    }

}
