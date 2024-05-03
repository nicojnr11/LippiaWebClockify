package lippia.web.services;

import com.crowdar.core.PropertyManager;
import gherkin.deps.net.iharder.Base64;
import io.lippia.api.lowcode.variables.PropertiesManager;
import lippia.web.constants.LogInConstants;

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

            // Cargar el archivo de propiedades
            properties.load(input);

            usuario = properties.getProperty("clocky.user");
            password = properties.getProperty("clocky.password");

            setInput(LogInConstants.INPUT_EMAIL_NAME,usuario);
            setInput(LogInConstants.INPUT_PASSWORD_NAME,password);

        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones según tus necesidades
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

    public static String getRandomString(int length) {
        Random RANDOM = new Random();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Genera un carácter aleatorio entre 'a' y 'z'
            char c = (char) (RANDOM.nextInt(26) + 'a');
            sb.append(c);
        }
        return sb.toString();
    }
}


