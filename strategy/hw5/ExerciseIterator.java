/**
 * Iterator class to iterate through exercises
 * @author Evan Scales
 */
public class ExerciseIterator implements Iterator {
    private Exercise[] exercises;
    private int position;

    /**
     * Constructor for class
     * @param exercises Array of exercises
     */
    ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
        position = 0;
    }

    /**
     * Returns if there is a next item in the list
     * @return Boolean True or false
     */
    public boolean hasNext() {
        return position < exercises.length && exercises[position] != null;
    }
    
    /**
     * Goes to the next position and returns that item
     * @return Exercise, the next exercise in the list
     */
    public Exercise next() {
        if (!hasNext()) return null;
        Exercise ret = exercises[position];
        position++;
        return ret;
    }
}