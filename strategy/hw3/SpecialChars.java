/**
 * Decorates the password with special chars
 * @author Evan Scales
 */
import java.util.Random;
public class SpecialChars extends PasswordDecorator {
     /**
     * Constructor for password decorator
     * @param passwordBegininning The password being decorated
     */
    SpecialChars (Password passwordBegininning) {
        super(passwordBegininning);
    }

    /**
     *  Decorates the password with special chars and returns it
     * @return String The password
     */
    public String getPassword() {
        char[] specialChars = new char[] {'*', '!', '%', '+', '.', '{', '}'};
        Random r = new Random();
        String newPassword = "";
        String password = passwordBegininning.getPassword();
        for (int i = 0; i < password.length(); i++) {
            newPassword += password.charAt(i);
            int num = r.nextInt(10);
            if (num == 0 || num == 1 || num == 2) {
                int pos = r.nextInt(7);
                newPassword += specialChars[pos];
            }
        }

        return newPassword;
    }
}
