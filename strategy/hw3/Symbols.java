/**
 * Decorates the password with symbols
 * @author Evan Scales
 */
import java.util.HashMap;
public class Symbols extends PasswordDecorator {
    private HashMap<Character, Character> symbolsMap;
    /**
     * Constructor for password decorator
     * @param passwordBegininning The password being decorated
     */
    Symbols (Password passwordBegininning) {
        super(passwordBegininning);
        symbolsMap = new HashMap<Character, Character>();
        symbolsMap.put('a', '@');
        symbolsMap.put('b', '8');
        symbolsMap.put('e', '3');
        symbolsMap.put('g', '9');
        symbolsMap.put('i', '!');
        symbolsMap.put('o', '0');
        symbolsMap.put('s', '$');
        symbolsMap.put('t', '7');

    }

    /**
     *  Decorates the password with symbols and returns it
     * @return String The password
     */
    public String getPassword() {
        String newPassword = "";
        String password = passwordBegininning.getPassword();
        for (int i = 0; i < password.length(); i++) {
            if (symbolsMap.containsKey(password.charAt(i))) {
                newPassword += symbolsMap.get(password.charAt(i));
            } else {
                newPassword += password.charAt(i);
            }
        }
       
        return newPassword;
    }
}
