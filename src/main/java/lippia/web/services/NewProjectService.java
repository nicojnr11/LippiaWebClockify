package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.NewProjectConstants;
import lippia.web.constants.WorkspaceConstants;

import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class NewProjectService {

    public static void nombreDeNuevoProyecto(String NewProject){
        String randomName = getRandomString2(10);
        WebActionManager.setInput(NewProjectConstants.INPUT_PROJECT_NAME,NewProject);
        }
}
