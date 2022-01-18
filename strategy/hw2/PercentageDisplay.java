/**
 * written by Evan Scales
 */
import java.util.HashMap;
public class PercentageDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    PercentageDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        numVotes = 0;
        votes = new HashMap<String, Integer>();
    }
    public void update(HashMap<String, Integer> votes) {
        this.votes.putAll(votes);
        display();
    }
    private void display() {
        votes.forEach((key,value) -> numVotes += value);
    
        System.out.println("\nCurrent Percent of Votes:");
        votes.forEach((key,value) -> System.out.println(key + ": " + (double)Math.round(((double)value/numVotes*100)*10)/10 +"%"));

    }
    
}