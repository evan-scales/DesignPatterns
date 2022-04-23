/**
 * Oldie
 * @author Evan Scale
 */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Constructor for tunes
     * @param artistName The artist name
     * @param songTitle The title
     * @param recordTitle The record title
     * @param category The category
     */
    Oldie(String artistName, String songTitle,
    String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Gets the artist name
     * @return The artists name
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Gets the title 
     * @return The title
     */
    public String getDisplayTitle() {
        return songTitle + ":" + recordTitle;
    }

    /**
     * Gets the category
     * @return The category
     */
    public String getCategory() {
        return category;
    }
}