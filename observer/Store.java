package observer;
/**
 * representation of a store 
 * @author Brent Hopkins
 */
import java.util.LinkedList;
import java.util.Queue;

public class Store implements Observer {

    private Subject subject = null;
    private String title =null;
    private Queue<Book> bestSellers;
    /**
     * Store constructor sets subject variable, registers the Store with the subject, and creates a Queue for Books
     * @param subject the subject the store is registered with
     */
    public Store(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
        bestSellers = new LinkedList<Book>();
    }
    /**
     * checks to see if bestSellers contains 5 Books. if so it removes the oldest Book and adds the new one, and if not adds the new Book without removing another
     * @param book the book to be added to the Queue
     */
    public void update(Book book) {
        if (bestSellers.size() == 5){
            bestSellers.remove();
            bestSellers.add(book);
        }else{
            bestSellers.add(book);
        }
        
    }

    /**
     * displays the 5 Books in the bestSellers Queue
     */
    public void display() {
        System.out.println("Top 5 Best Sellers: ");
        for (Book book : bestSellers){
            System.out.println(book);
        }
        
    }
    
}
