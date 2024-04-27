package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.ActionManager.click;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LogOutService {
    public static void myAccount(){
        click(MyAccountConstants.MY_ACCOUNT_BUTTON);
    };

    public static void exitMyAccount(){
      click(MyAccountConstants.LOG_OUT);
    };

   /* public static void validacion(){
        Assert.assertTrue(isVisible((LogInConstants.LOG_IN_MANUALLY_BUTTON);
}*/
}