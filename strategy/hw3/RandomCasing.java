/**
 * Decorates the password with random casing
 * @author Evan Scales
 */
import java.util.Random;
public class RandomCasing extends PasswordDecorator {
     /**
     * Constructor for password decorator
     * @param passwordBegininning The password being decorated
     */
    RandomCasing(Password passwordBegininning) {
        super(passwordBegininning);
    }

    /**
     *  Decorates the password with random casing and returns it
     * @return String The password
     */
    public String getPassword() {
        Random r = new Random();
        String newPassword = "";
        String password = passwordBegininning.getPassword();
        for (int i = 0; i < password.length(); i++) {
            int num = r.nextInt();
            char c = password.charAt(i);
            char add;
            if (num % 2 == 0) {
                // Make sure c is uppercase
                add = Character.toUpperCase(c);
            } else {
                // Make sure c is lowercase
                add = Character.toLowerCase(c);

            }
            newPassword += add;
        }

        return newPassword;
    }
}
