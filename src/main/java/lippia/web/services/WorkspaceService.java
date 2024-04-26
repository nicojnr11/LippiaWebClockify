package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;

public class WorkspaceService {

    public static void randomWorkspaceName(String WorkspaceName){
        WebActionManager.setInput(WorkspaceConstants.SET_INPUT_WORKSPACE_NAME,WorkspaceName);
        BasicFunctionsService.getRandomString(10);
        WebActionManager.click(WorkspaceConstants.CREATE_BUTTON);
    }

}
