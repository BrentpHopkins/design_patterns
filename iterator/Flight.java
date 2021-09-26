package iterator;
/**
 * A flight and all of its relevant information
 * @author Brent Hopkins
 */
public class Flight {
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;
/**
 * Flight constructor sets all fields
 * @param flightNum the flight number
 * @param from flight origin 
 * @param to flight destination
 * @param duration flight duration in minutes
 * @param transfers number of transfers 
 */
    public Flight(String flightNum, String from, String to, int duration, int transfers){
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }
    /**
     * gets flight origin
     * @return returns flight origin
     */
    public String getFrom(){
        return this.from;
    }
    /**
     * gets flight destination
     * @return returns flight destination
     */
    public String getTo(){
        return this.to;
    }
    /**
     * get flight duration
     * @return returns flight duration in minutes
     */
    public int getDuration(){
        return this.duration;
    }
    /**
     * get number of transfers 
     * @return returns the number of transfers 
     */
    public int getTransfers(){
        return this.transfers;
    }
    /**
     * creates and returns a string containing all of the flights information
     *  @return returns a string containing the flights information
     */
    public String toString(){
        String output = "";
        output = "Flight Number: " + this.flightNum;
        output = output + "\nFrom: " + this.from;
        output = output + "\nTo: " + this.to;
        output =output + "\nDuration: " + this.duration/60 + " hours and "  + (this.duration%60) + " minutes";

        if(this.transfers == 1){
            output = output + "\n" + this.transfers + " Transfer";
        }else if(this.transfers >=2){
            output = output + "\n" + this.transfers + " Transfers";    
        }else{
            output = output + "\ndirect flight";
        }
        return output;
    }
}
