/**
 * Written by Evan Scales
 */
import java.util.HashMap;
import java.util.ArrayList;
public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    StudentGovPoll(String school) {
        this.school = school;
        observers = new ArrayList<Observer>();
        votes = new HashMap<String, Integer>();
        numUpdates = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(votes);
        }
    }

    public void addCandidate(String president) {
        votes.putIfAbsent(president, 0);
    }

    public void enterVotes(String president, int num) {
        votes.put(president, votes.get(president) + num);
        if (++numUpdates % 4 == 0) {
            notifyObservers();
        }
    }

    public String getSchool() {
        return school;
    }
}
