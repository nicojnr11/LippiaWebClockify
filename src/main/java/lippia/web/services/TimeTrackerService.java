package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrackerConstants;

public class TimeTrackerService {

    public static void timeEntry(String beggining, String ending){
        WebActionManager.setInput(TimeTrackerConstants.INPUT_BEGGINIG_TIME,"0500");
        WebActionManager.setInput(TimeTrackerConstants.INPUT_ENDING_TIME,"1200");
    }

    public static void dateEntry(String fecha){
        WebActionManager.setInput(TimeTrackerConstants.CALENDAR,"26/02/2024");
    }

}
