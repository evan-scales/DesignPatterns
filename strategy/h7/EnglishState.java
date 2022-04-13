import java.util.ArrayList;

/**
 * English state
 * @author Evan Scales
 */
public class EnglishState implements State {
    private MusicBox box;

    /**
     * Constructor for the object
     * @param box The music box
     */
    EnglishState(MusicBox box) {
        this.box = box;
    }

    /**
     * Plays lil twinkle star
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "Twinkle Twinkle Lil Star";
        lyrics.add("Twinkle, twinkle, little star");
        lyrics.add("How I wonder what you are");
        lyrics.add("Up above the world so high");
        lyrics.add("Like a diamond in the sky");
        lyrics.add("Twinkle, twinkle, little star");
        lyrics.add("How I wonder what you are");
        box.playSOng(songName, lyrics);
    }

    /**
     * Plays happy song
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "If You're Happy and You Know It ";
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it clap your hands");
        box.playSOng(songName, lyrics);
    }

    /**
     * Stay in english mode
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    /**
     * Switch to french mode
     */
    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }

    /**
     * Switch to spanish mode
     */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
