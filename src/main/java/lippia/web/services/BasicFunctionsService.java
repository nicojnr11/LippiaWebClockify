package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;

import java.util.Random;

public class BasicFunctionsService {



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
