package observer;
/**
 * store best selling books and notifys observers when a book is added
 * @author Brent Hopkins
 */
import java.util.ArrayList;

public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
     * BestSeller constructor creates an ArrayList of observers and Books
     */
    public BestSellers(){
        observers = new ArrayList<Observer>();
        bestSellers = new ArrayList<Book>();
    }
    /**
     * adds a new observer to the observer ArrayList
     * @param observer the observer to be added to the ArrayList
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
        
    }

    /**
     * removes an observer from the ArrayList
     * @param observer the observer to be removed from the ArrayList
     */
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
        
    }

    /**
     * noitfys observers of a book being added to the ArrayList
     * @param book the book that observers will be notifyed of
     */
    public void notifyObservers(Book book) {
        for(Observer observer : observers ){
            observer.update(book);
        }    
    }
    /**
     * adds a book to the best Sellers ArrayList and calls notifyobservers
     * @param book the book to be added to the best Sellers ArrayList
     */
    public void addBook(Book book){
            bestSellers.add(book);
            notifyObservers(book);
        }
    
}
