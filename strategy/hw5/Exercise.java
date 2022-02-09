/**
 * Create an exercise
 * @author Evan Scales
 */
import java.util.ArrayList;
public class Exercise {
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Constructor for the object if target muscles and directions are unknown
     * @param title The title of the workout
     */
    Exercise(String title) {
        this.title = title;
        targetMuscles = new ArrayList<String>();
        directions = new ArrayList<String>();
    }

    /**
     * Constructor for the object if target muscles and directions are known
     * @param title The title of the workout
     * @param targetMuscles Arraylist of the targted muscles in this exercise
     * @param directions Arraylist of the direcions for this exercise
     */
    Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Removes a muscle from the target muscle array list
     * @param muscle The muscle to be removed
     */
    public void removeTargetMuscle(String muscle) {
        targetMuscles.remove(muscle);
    }

    /**
     * Prints the attributes of this class
     * @return String The printable version of this class
     */
    public String toString() {
        String ret = "";
        ret += "\n..." + title + "...\n";
        ret += "Muscles: ";
        for (int i = 0; i < targetMuscles.size(); i++) {
            if (i == targetMuscles.size() - 1)
                ret += targetMuscles.get(i) + "\n";
            else
                ret += targetMuscles.get(i) + ", ";
        }
        ret += "Exercises:\n";
        for (int i = 0; i < directions.size(); i++) {
            ret += "- " + directions.get(i) + "\n";
        }

        return ret;
    }
    
}