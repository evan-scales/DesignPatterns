/**
 * Track class
 * @author Evan Scales
 */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Constructor for track 
     * @param title The track title
     * @param album The track album
     * @param firstName The artists first name
     * @param lastName The artists last name
     * @param genre The tracks genre
     */
    Track(String title, String album,
    String firstName, String lastName,
    Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Gets the title of the track
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the album of the track
     * @return The album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Gets the artists first name
     * @return The first name
     */
    public String getArtistFirstName() {
        return firstName;
    }

    /**
     * Gets the artists last name
     * @return The last name
     */
    public String getArtistLastName() {
        return lastName;
    }

    /**
     * Gets the genre
     * @return The genre
     */
    public String getGenre() {
        return genre.name();
    }


    
}