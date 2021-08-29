package strategy;
/**
 * binary search behavior for use within GuestLists 
 * @author Brent Hopkins 
 */
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch implements SearchBehavior {
/**
 * searches an ArrayList for a specified string using a binary search algorithm
 * refrenced section 3.4 of "Data Structures Using Java" by Duncan A. Buell for the algorithm 
 * @param data the ArrayList to be searched 
 * @param item the item being searched for within the ArrayList
 * @return returns a boolean. returns true if the ArrayList contains the String, False if it does not
 */
    public boolean contains(ArrayList<String> data, String item) {
        int left = 0;
        int right = data.size() - 1;
        int mid = 0;
        Collections.sort(data);
        while (left <= right) {
            mid = (right+left)/2;

            if (data.get(mid).equalsIgnoreCase(item)) {
                return true;
            } else if (data.get(mid).compareToIgnoreCase(item) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

}