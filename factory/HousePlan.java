package factory;

import java.util.ArrayList;
/**
 * HousePlan base class
 * @author Brent Hopkins
 */
public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    /**
     * HousePlan constructor sets numRooms, numWindows, and squareFeet then instantiates the materials and features arraylists
     * @param numRooms number of rooms in the house 
     * @param numWindows number of windows in the house
     * @param squareFeet squarefootage of the house
     */
    public HousePlan(int numrooms, int numwindows, int squarefeet){
        this.numRooms = numrooms;
        this.numWindows = numwindows;
        this.squareFeet = squarefeet;
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
    }
    /**
     * absract method to be defined in Child classes
     */
    protected abstract void setMaterials();
    /**
     * absract method to be defined in Child classes
     */
    protected abstract void setFeatures();
    /**
     * gets the materials arraylist
     * @return returns the materials arraylist
     */
    public ArrayList<String> getMaterials(){
        return this.materials;
    }
    /**
     * gets the features arraylist
     * @return returns the features arraylist
     */
    public ArrayList<String> getFeatures(){
        return this.features;
    }
    /**
     * gets the number of rooms in the HousePlan
     * @return returns the number of rooms
     */
    public int getNumRooms(){
        return this.numRooms;
    }
    /**
     * gets the number of windows in the HousePlan
     * @return returns the number of windows
     */
    public int getNumWindows(){
        return this.numWindows;
    }
    /**
     * gets the square footage of the HousePlan
     * @return returns the square footage
     */
    public int getSquareFeet(){
        return this.squareFeet;
    }
    /**
     * creates a string that contains the unique qualities of the HousePlan
     * @return returns a String with containing all the unique qualities of the HousePlan
     */
    public String toString(){
        String output = "";
        output = output + "Square feet: " + this.squareFeet +"\n";
        output = output + "Room: " + this.numRooms + "\n";
        output = output + "Windows: " + this.numWindows + "\n\n";
        output = output + "Materials: \n";

        for(String material : this.materials){
            output = output + " - " + material + "\n";
        }
        output = output + "\n Features: \n";
        for(String feature : this.features){
            output = output + " - " + feature + "\n";
        }
        return output;
    }
}
