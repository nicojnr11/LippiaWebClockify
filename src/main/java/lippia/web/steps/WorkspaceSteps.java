package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lippia.web.services.BasicFunctionsService;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps {
    


    @And("nombro mi nuevo workspace (.*)$")
    public void nombroMiNuevoWorkspace(String workspace) {
        WorkspaceService.randomProyect();
    }

    @Then("se crea un nuevo workspace")
    public void seCreaUnNuevoWorkspace(String check) {
        BasicFunctionsService.validCheck(check);
    }

    @And("clickeo el dropdown de workspaces")
    public void clickeoElDropdownDeWorkspaces() {
        WorkspaceService.dropDownWorkspace();
    }
}
