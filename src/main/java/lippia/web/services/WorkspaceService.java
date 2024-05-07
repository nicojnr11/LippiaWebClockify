package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;

import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class WorkspaceService {

    public static void randomProyect() {
        String randomName = getRandomString2(10);
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME, randomName);
    }


    public static void dropDownWorkspace (){
        WebActionManager.click(WorkspaceConstants.DROP_DOWN_WORKSPACE_SELECTOR_BUTTON);
    }

}