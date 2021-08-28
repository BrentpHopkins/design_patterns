package strategy;
/**
 * defines a Guest list and its methods 
 * @author Brent Hopkins
 */
import java.util.ArrayList;

public class GuestList {

    private String title = "";

    private ArrayList<String> people = new ArrayList<String>();


    private SearchBehavior searchBehavior = new LinearSearch();
/**
 * Guest list constructor. Sets the title of the GuestList and uses the default configuraton for search behavior 
 * @param title the title of the GuestList
 */
    public GuestList(String title) {
        this.title = title;
    }
/**
 * adds a given person to the "people" ArrayList only if they are not already present within it
 * @param person the name of the person to be added to the ArrayList
 * @return returns a boolean. returns true if the person is not already within the ArrayList and was added. returns false if the person is already present within the ArrayList and was not added
 */
    public boolean add(String person) {
        if(searchBehavior.contains(people, person)){
            return false;
        }
        return people.add(person);
    }
/**
 * removes a specified person from the list
 * @param person the name of the person to be removed
 * @return returns a boolean. returns true if the person was found and removed from the list. returns false if the person was not in the list
 */
    public boolean remove(String person) {
        if(searchBehavior.contains(people, person)){
            people.remove(person);
            return true;
        }
        return false;
    }
/**
 * gets the title of the GuestList
 * @return returns the title of the GuestList as a String
 */
    public String getTitle(){
        return this.title;
    }
/**
 * sets the SearchBehavior for the list
 * @param searchBehavior The desired search behavior object for the guest list
 */
    public void setSearchBehavior(SearchBehavior searchBehavior){
        this.searchBehavior = searchBehavior;
    }
    /**
     * gets the list of guests 
     * @return returns an ArrayList<String> with the names of those on the guest list
     */
    public ArrayList<String> getList(){
        return this.people;
    }

}