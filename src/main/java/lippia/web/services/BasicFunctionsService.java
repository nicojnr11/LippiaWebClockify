package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.CommonConstants;
import lippia.web.constants.LogInConstants;
import org.testng.Assert;

import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

import static com.crowdar.core.actions.ActionManager.setInput;

public class BasicFunctionsService {


    public static String removeQuotes(String str) {

        if (str.startsWith("\"") && str.endsWith("\"")) {

            return str.substring(1, str.length() - 1);
        } else {

            return str;
        }
    }


    public static void usuarioyPassword(String usuario, String password) {

        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = BasicFunctionsService.class.getClassLoader().getResourceAsStream("config.properties");

            properties.load(input);

            usuario = properties.getProperty("clocky.user");
            password = properties.getProperty("clocky.password");

            setInput(LogInConstants.INPUT_EMAIL_NAME, usuario);
            setInput(LogInConstants.INPUT_PASSWORD_NAME, password);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public static String getRandomString2(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }


    public static void validCheck(String chek) {
        Assert.assertTrue(WebActionManager.isPresent(CommonConstants.VALID_MESSAGE_XPATH),chek);

    }
}