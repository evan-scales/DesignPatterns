import java.util.ArrayList;

/**
 * Spanish STate
 * @author Evan Scales
 */
public class Spanish implements State{
    private MusicBox box;

    /**
     * Constructor for the object
     * @param box The music box
     */
    Spanish(MusicBox box) {
        this.box = box;
    }

    /**
     * Plays lil twinkle star
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "Twinkle Twinkle Lil Star";
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");
        lyrics.add("Por encima del mundo tan arriba");
        lyrics.add("Como un diamante en el cielo");
        lyrics.add("Brilla brilla pequeña estrella");
        lyrics.add("Cómo me pregunto lo que eres");
        box.playSOng(songName, lyrics);
    }

    /**
     * Plays happy song
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "If You're Happy and You Know It ";
        lyrics.add("Si eres feliz y lo sabes aplaude");
        lyrics.add("Si eres feliz y lo sabes aplaude");
        lyrics.add("si estás contento y lo sabes");
        lyrics.add("Y realmente quieres mostrarlo");
        lyrics.add("Si eres feliz y lo sabes aplaude");
        box.playSOng(songName, lyrics);
    }

    /**
     * switch to english mode
     */
    @Override
    public void pressEnglishButton() {
        box.setState(box.getSpanishState());
    }

    /**
     * Switch to french mode
     */
    @Override
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }

    /**
     * stay to spanish mode
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Ya estás en modo español");
    }
}
