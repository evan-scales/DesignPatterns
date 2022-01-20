/**
 * Class that creates the poll and its observers
 * @author Evan Scales
 */
import java.util.HashMap;
import java.util.ArrayList;
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    /**
     * Creates the poll
     * @param school Name of the school
     */
    StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        numUpdates = 0;
    }

    /**
     * Adds an observer to the poll
     * @param observer Observer to be added
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the poll
     * @param observer Observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Tells the observer new data
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(votes);
        }
    }

    /**
     * Adds canidate to voting pool
     * @param president name of president
     */
    public void addCandidate(String president) {
        votes.putIfAbsent(president, 0);
    }

    /**
     * Enters votes into the system
     * @param president name of president receiving votes
     * @param num number of votes
     */
    public void enterVotes(String president, int num) {
        votes.put(president, votes.get(president) + num);
        if (++numUpdates % 4 == 0) {
            notifyObservers();
        }
    }

    /**
     * Returns the name of the school
     * @return the school name
     */
    public String getSchool() {
        return school;
    }
}
