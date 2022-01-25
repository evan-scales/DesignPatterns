/**
 * Password decorator 
 * @author Evan Scales
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBegininning;

    /**
     * Constructor for password decorator
     * @param passwordBegininning The password being decorated
     */
    PasswordDecorator(Password passwordBegininning) {
        this.passwordBegininning = passwordBegininning;
    }
}
