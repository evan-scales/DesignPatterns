/**
 * Class that displays the percentage results of the poll
 * @author Evan Scales
 */
import java.util.HashMap;
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    /**
     * Constructor for the display
     * @param poll The poll subject being used to keep calculate percentage 
     */
    PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        numVotes = 0;
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
        votes.forEach((key,value) -> numVotes += value);
    
        System.out.println("\nCurrent Percent of Votes:");

        votes.forEach((key,value) -> System.out.println
        (key + ": " + (double)Math.round
        (((double)value/numVotes*100)*10)/10 +"%"));

    }
    
}