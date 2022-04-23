/**
 * Song class
 * @author Evan Scales
 */
public abstract class Song {
    public abstract String getTitle();
    public abstract String getAlbum();
    public abstract String getArtistFirstName();
    public abstract String getArtistLastName();
    public abstract String getGenre();

    /**
     * Use to print songs
     * @return The string representation of song
     */
    @Override
    public String toString() {
        String ret = "";
        String title = getTitle();
        String album = getAlbum();
        String firstName = getArtistFirstName();
        String lastName = getArtistLastName();
        String name = firstName + " " + lastName;
        String genre = getGenre();

        ret += title + "\n";
        ret += "Album: " + album + "\n";
        ret += "By: " + name + "\n";
        ret += "Genre: " + genre + "\n";

        return ret;
    }
    
}