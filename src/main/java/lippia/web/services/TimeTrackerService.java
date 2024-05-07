package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrackerConstants;

import java.util.Random;

import static lippia.web.services.BasicFunctionsService.getRandomString2;

public class TimeTrackerService {

    public static void manualButton(){
        WebActionManager.click(TimeTrackerConstants.MANUAL_REGISTER_DATE_BUTTON);
    }

    public static void proyectName() {
        String randomName = getRandomString2(10);
        WebActionManager.setInput(TimeTrackerConstants.INPUT_PROJECT_NAME,randomName);

    }

    public static void timeEntry(String beggining){
        WebActionManager.setInput(TimeTrackerConstants.INPUT_BEGGINIG_TIME,beggining);
    }

    public static void timeEntryfinal(String ending){
       // WebActionManager.setInput(TimeTrackerConstants.INPUT_ENDING_TIME,ending);
    }
    public static void dateEntry(String fecha){
        WebActionManager.setInput(TimeTrackerConstants.CALENDAR,"26/02/2024",fecha);
    }

}
