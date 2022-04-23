import java.util.HashMap;

/**
 * JukeBox class to play songs/tunes
 * @author Evan Scales
 */
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * Constructor for the jukebox
     */
    JukeBox() {
        songs = new HashMap<>();
    }

    /**
     * Adds song to hashmap
     * @param song The song to add
     */
    public void addSong(Song song) {
        String title = song.getTitle();
        songs.put(title, song);
    }

    /**
     * Play the song
     * @param songName The song to be played
     */
    public void play(String songName) {
        Song song = songs.get(songName);
        if (song != null)
            System.out.println(song);
        else
            System.out.println("Sorry, song not found!");
    }
    
}