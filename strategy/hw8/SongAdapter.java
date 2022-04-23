/**
 * Song Adapter 
 * @author Evan Scales
 */
public class SongAdapter extends Song {
    private Tune tune;

    /**
     * Constructor for the song adapter
     * @param tune The tune to be set
     */
    SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * Gets the title
     * @return The title
     */
    public String getTitle() {
        String title = tune.getDisplayTitle();
        title = title.split(":")[0];
        return title;
    }

    /**
     * Gets the album name
     * @return The album name
     */
    public String getAlbum() {
        String album = tune.getDisplayTitle();
        album = album.split(":")[1];
        return album;
    }

    /**
     * Gets the artist first name
     * @return The first name
     */
    public String getArtistFirstName() {
        String firstName = tune.getArtistName();
        firstName = firstName.split(" ")[0];
        return firstName;
    }

    /**
     * Gets the artist last name
     * @return The last name
     */
    public String getArtistLastName() {
        String lastName = tune.getArtistName();
        lastName = lastName.split(" ")[1];
        return lastName;
    }

    /**
     * Gets the genre
     * @return The genre
     */
    public String getGenre() {
        return tune.getCategory();
    }


}
