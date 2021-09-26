package iterator;
/**
 * Iterator for Arrays of Flights
 * @author Brent Hopkins
 */
import java.util.Iterator;

public class FlightIterator implements Iterator<Flight> {
    private Flight Flights[];
    private int position;
    /**
     * FlightIterators constructor sets Flights[] to point to the array passed in and sets position to zero
     * @param flights the Array being Iterated through 
     */
    public FlightIterator(Flight[] flights){
        this.Flights = flights;
        this.position = 0;
    }
    /**
     * determines if there is another element after the current position in the array
     * @return returns true if there is another element or false if there is not another element  
     */
    public boolean hasNext() {
        return(position < (this.Flights.length ) && this.Flights[position] != null);
    }
    /**
     * gets the next element in the array if it exists
     * @return returns the next element in the array if it exists or null if the element does not exist 
     */
    public Flight next() {
        if(hasNext()){
            return this.Flights[position++];
        }
        return null;
    }
}
