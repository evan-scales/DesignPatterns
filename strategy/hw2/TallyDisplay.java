/**
 * Written by Evan Scales
 */
import java.util.*;
public class TallyDisplay implements Observer {
    private Subject poll;
    private HashMap<String, Integer> votes;

    TallyDisplay(Subject poll) {
        this.poll = poll;
        poll.registerObserver(this);
        votes = new HashMap<String, Integer>();
    }
    public void update(HashMap<String, Integer> votes) {
        this.votes.putAll(votes);
        display();
    }
    private void display() {
        System.out.println("Current Tallies:");
        votes.forEach((key,value) -> System.out.println(key + ": " + value));
    }

}
