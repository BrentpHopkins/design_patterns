package observer;
/**
 * representation of a customer 
 * @author Brent Hopkins
 */
import java.util.ArrayList;

public class Customer implements Observer {

    private Subject subject = null;
    private String firstName = null;
    private String lastName = null;
    private ArrayList<Book> wishList;
/**
 * Customer constructor sets subject and name, creates an ArrayList, and registers the customer as an observer of the subject
 * @param subject the subject that the customer will be registered as an observer to
 * @param firstName customers first name
 * @param lastName customers last name
 */
    public Customer(Subject subject, String firstName, String lastName){
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        wishList = new ArrayList<Book>();
        subject.registerObserver(this);
    }
    /**
     * adds a book to the customers wishlist
     * @param book the book to be added 
     */
    public void update(Book book) {
        this.wishList.add(book);
        
    }

    /**
     * prints the customers wish list
     */
    public void display() {
        System.out.println("\n" + "Wish List:");
        for (Book book : wishList){
            System.out.println(book.toString());
        }
        
    }
    
}
