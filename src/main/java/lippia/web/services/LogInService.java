package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogInConstants;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static com.crowdar.core.actions.ActionManager.isVisible;

public class LogInService extends ActionManager {
    public static void urlBase() {
        WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void LogInLandingPage(String logIn) {
        WebActionManager.navigateTo("https://app.clockify.me/en/login");
    }

    public static void logInManuallyButton(String logInManually) {
        WebActionManager.click(LogInConstants.LOG_IN_MANUALLY_BUTTON);
    }

    public static void usuarioyPassword(String usuario, String password) {
        WebActionManager.setInput(LogInConstants.INPUT_EMAIL_NAME, usuario);
        WebActionManager.navigateTo(PropertyManager.getProperty("clocky.user"));

        WebActionManager.setInput(LogInConstants.INPUT_PASSWORD_NAME, password);
        WebActionManager.navigateTo(PropertyManager.getProperty("clocky.password"));

    }

    public static void logInButton(String logInFinal) {
        WebActionManager.click(LogInConstants.BUTTON_LOGIN_XPATH);
    }

    public static void myAccountPresent() {

        String myaccount = (MyAccountConstants.MY_ACCOUNT_BUTTON);
        Assert.assertTrue(isVisible(myaccount));
    }

}