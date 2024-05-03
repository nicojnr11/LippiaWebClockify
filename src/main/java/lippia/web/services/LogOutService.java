package lippia.web.services;

import lippia.web.constants.MyAccountConstants;

import static com.crowdar.core.actions.ActionManager.click;

public class LogOutService {
    public static void myAccount(){
        click(MyAccountConstants.MY_ACCOUNT_BUTTON);
    }


    public static void exitMyAccount(){
      click(MyAccountConstants.LOG_OUT);
    };

   /* public static void validacion(){
        Assert.assertTrue(isVisible((LogInConstants.LOG_IN_MANUALLY_BUTTON);
}*/
}