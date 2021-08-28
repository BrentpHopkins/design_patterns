package strategy;
/**
 * linear search behavior for use within GuestLists
 * @author Brent Hopkins
 */
import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {
/**
 * moves through the given ArrayList squentially to find a given String
 * @param data ArrayList to be searched
 * @param item item to be searched for within the ArrayList
 * @return returns a boolean. returns true if the item is found and false if it is not.
 */
    public boolean contains(ArrayList<String> data, String item) {
        for (int i = 0; i <= data.size(); i++) {
            if (data.get(i).equalsIgnoreCase(item)) {
                return true;
            }
        }

        return false;
    }

}
