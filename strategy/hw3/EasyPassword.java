/**
 * Class that creates an easy password
 * @author Evan Scales
 */
import java.util.Random;
public class EasyPassword extends Password {
    /**
     * Decorate phrase into an easy password
     * @param phrase phrase to be passwordified
     */
    EasyPassword(String phrase) {
        // Change phrase to easy password "i f ga a" -> "ifgaa21"
        // Set password to this
        phrase = phrase.replace(" ", "");
        Random r = new Random();
        int num = r.nextInt(100);
        phrase += num;
        this.password = phrase;

    }

    /**
     * Returns the password
     * @return String the password
     */
    public String getPassword() {
        return password;
    }
}
