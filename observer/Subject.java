package observer;
/**
 * defines abstract method to be included in classes that implement Subject
 * @author Brent Hopkins
 */
public interface Subject {
    /**
     * Observer registration method to be defined in classes that implement Subject
     * @param observer the observer to be registered
     */
    public void registerObserver(Observer observer);
    /**
     * Observer removal method to be defined in classes that implement Subject
     * @param observer Observer to be removed
     */
    public void removeObserver(Observer observer);
    /**
     * Observer notification method to be defined in classes that implement Subject
     * @param book Book to notify observers of
     */
    public void notifyObservers(Book book);
}
