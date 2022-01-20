/**
 * Interface for the poll subject
 * @author Evan Scales
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
