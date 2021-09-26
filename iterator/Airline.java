package iterator;
/**
 * representation of an airline
 * @author Brent Hopkins
 */
public class Airline {
    private String title;
    private Flight[] flights;
    private int size;
    /**
     * Airline constructor sets title to the given string, size to 2, and instantiates an array with the default size
     * @param title the name of the airline
     */
    public Airline(String title){
        this.title = title;
        this. size = 2;
        this.flights = new Flight[size];
    }
    /**
     * checks the flights array for an empty element and adds a new flight in its place. If the array is full growArray is called and the new flight is added to the end of the expanded Array
     * @param flightNum flight number
     * @param from flight origin
     * @param to flight destination
     * @param duration flight duration in minutes 
     * @param transfers number of transfers 
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        for(int i = 0; i < flights.length; i++){
            if(flights[i] == null){
                flights[i] = new Flight(flightNum, from, to, duration, transfers);
                return;
            }else if( i == flights.length - 1){
               this.flights = growArray(this.flights);
               this.flights[i+1] = new Flight(flightNum, from, to, duration, transfers);
               return;
            }
        }   
    }
    /**
     * gets the name of the airline
     * @return returns the name of the airline
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * creates an Array with the same data but twize the size of the Array passed to the method 
     * @param flights the array to be expanded 
     * @return returns an array with the same data but twice the size of the Array passed to the method
     */
    private Flight[] growArray(Flight[] flights){
        Flight[] output = new Flight[flights.length * 2];
        this.size = size*2;
        FlightIterator flightiterator = createIterator();
        int position = 0;
        
        while(flightiterator.hasNext()){
            output[position] = flightiterator.next();
            position++;
        }
        return output;
    }
    /**
     * creates a new FlightIterator
     * @return returns the new FlightIterator
     */
    public FlightIterator createIterator(){
        return new FlightIterator(this.flights);
    }
    
}
