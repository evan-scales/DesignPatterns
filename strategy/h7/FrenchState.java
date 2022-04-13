import java.util.ArrayList;

/**
 * French State
 * @author Evan Scales
 */
public class FrenchState implements State {
    private MusicBox box;

    /**
     * Constructor for the object
     * @param box Sets the box
     */
    FrenchState(MusicBox box) {
        this.box = box;
    }


    /**
     * Plays twinle lttle star
     */
    @Override
    public void pressStarButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "Twinkle Twinkle Lil Star";
        lyrics.add("Scintille, scintille, petite étoile");
        lyrics.add("Comment je me demande ce que vous êtes");
        lyrics.add("Au-dessus du monde si haut");
        lyrics.add("Comme un diamant dans le ciel");
        lyrics.add("Scintille, scintille, petite étoile");
        lyrics.add("Comment je me demande ce que vous êtes");
        box.playSOng(songName, lyrics);
    }

    /**
     * Plays if youre happy and you know it
     */
    @Override
    public void pressHappyButton() {
        ArrayList<String> lyrics = new ArrayList<>();
        String songName = "If You're Happy and You Know It ";
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        lyrics.add("Si tu es content et que tu le sais");
        lyrics.add("Et tu veux vraiment le montrer");
        lyrics.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        box.playSOng(songName, lyrics);
    }

    /**
     * go to english mode
     */
    @Override
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }

    /**
     * stay in french state
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Vous êtes déjà en mode français");
    }

    /**
     * Go to spanish mode
     */
    @Override
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
