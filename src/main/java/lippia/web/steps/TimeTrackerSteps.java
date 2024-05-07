package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.LogInService;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps {

    @And("clickeo sobre el boton Manual")
    public void clickeoElBotonManual(){
        TimeTrackerService.manualButton();
    }


    @And("añado una (.*)$")
    public void anadoUnaFecha(String fecha){
        TimeTrackerService.dateEntry("26/02/2024");
    }


    @Then("se crea un nuevo time entry")
    public void seCreaUnNuevoTimeEntry() {
        System.out.println("cree con exito");
    }

    @And("seteo una hora de inicio (.*)$")
    public void seteoUnaHoraDeInicio(String horaInicio) {
        TimeTrackerService.timeEntry(horaInicio);
    }

    @And("seteo una hora final (.*)$")
    public void seteoUnaHoraFinal(String horaFinal) {
        TimeTrackerService.timeEntryfinal(horaFinal);
    }
}
