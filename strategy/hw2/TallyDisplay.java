/**
 * Class that displays the tally results of the poll
 * @author Evan Scales
 */
import java.util.*;
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;

    /**
     * Constructor for the display
     * @param poll The poll subject being used to keep tally
     */
    TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        votes = new HashMap<String, Integer>();
    }

    /**
     * Updates the canidates and their number of votes
     * @param votes The hashmap containing the canidates and their votes
     */
    public void update(HashMap<String, Integer> votes) {
        this.votes.putAll(votes);
        display();
    }

    /**
     * Displays the poll results as tallys
     */
    private void display() {
        System.out.println("Current Tallies:");
        votes.forEach((key,value) -> System.out.println(key + ": " + value));
    }
}
