package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.NewProjectConstants;

public class NewProjectService {

    public static void nombreDeNuevoProyecto(String NewProject){
        WebActionManager.setInput(NewProjectConstants.INPUT_PROJECT_NAME,NewProject);
    }
}
