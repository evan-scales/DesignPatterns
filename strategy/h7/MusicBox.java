import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 
 * @author Evan Scales
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructs the states and sets state to english
     */
    MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new Spanish(this);
        state = englishState;
    }

    /**
     * calls press star button on the state variable
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * calls press happy button on the state variable
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * calls press english button on the state variable
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * calls press french button on the state variable
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * calls press spanish button on the state variable
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * changes the state accordingly
     * @param state The new state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * returns the english state
     * @return The english state
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * returns the french state
     * @return The french state
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * returns the spanish state
     * @return the spanish state
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays the song
     * @param songName The song name
     * @param lyrics The song lyrics
     */
    public void playSOng(String songName, 
    ArrayList<String> lyrics) {
        for (String line : lyrics) {
            System.out.println(line);
            this.sleep(300);
        }
    }

    /**
     * 
     * @param num
     */
    private void sleep(int num) {
        try {
            TimeUnit.MILLISECONDS.sleep(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
