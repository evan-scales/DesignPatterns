/**
 * Create a PT
 * @author Evan Scales
 */
import java.util.ArrayList;
public class PT {
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;

    /**
     * Constructor for the PT
     * @param firstName first name of the PT
     * @param lastName last name of the PT
     * @param bio bio of the PT
     */
    PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        exercises = new Exercise[2];
    }

    /**
     * Creates an exercise and adds to exercises array
     * @param title The title of the workout
     * @param muscleGroups Arraylist of the targted muscles in this exercise
     * @param directions Arraylist of the direcions for this exercise
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        Exercise toAdd = new Exercise(title, muscleGroups, directions);
        for (int i = 0; i < exercises.length; i++) {
            if (exercises[i] == null) {
                exercises[i] = toAdd;
                break;
            } else if (exercises[i] != null && i == exercises.length - 1) {
                exercises = growArray(exercises);
                exercises[i] = toAdd;
            }
        }
    }

    /**
     * Gets the first name of the PT
     * @return String the first name of the PT
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Gets the last name of the PT
     * @return String the last name of the PT
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the bio of the PT
     * @return String the bio of the PT
     */
    public String getBio() {
        return bio;
    }

    /**
     * Doubles the size of the exercises array
     * @param exercises Array to be doubled in size
     * @return an array of exercises doubled in size
     */
    private Exercise[] growArray(Exercise[] exercises) {
        int newSize = exercises.length * 2;
        Exercise[] ret = new Exercise[newSize];
        // Copy the elements from exercise into ret
        for (int i = 0; i < exercises.length; i++) {
            ret[i] = exercises[i];
        }
        // Fill the rest of ret with null
        for (int i = exercises.length; i < newSize; i++) {
            ret[i] = null;
        }
        return ret;
    }

    /**
     * Creates an iterator for the exercises array
     * @return An iterator for the exercises array
     */
    public ExerciseIterator createIterator() {
        return new ExerciseIterator(exercises);
    }

    /**
     * Prints the attributes of this class
     * @return String The printable version of this class
     */
    public String toString() {
        String ret = "";
        String name = firstName + " " + lastName + "\n";
        ret += name + bio + "\n";
        return ret;
    }
}