package strategy;
/**
 * Interface for diffrent types of search behavior
 * @author Brent Hopkins
 */
import java.util.ArrayList;

public interface SearchBehavior{
    /**
     * method to be implemented within the varrying types of search behavior
     * @param data Arraylist to be searched
     * @param item item being searched for within the ArrayList
     * @return classes that implement SearchBehavior will return true if the item is found within the list and false if it is not 
     */
    public boolean contains(ArrayList<String> data, String item);
}
