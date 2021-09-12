package decorator;

import java.util.ArrayList;
/**
 * Abstract base class for PotatoeHead
 * @author Brent Hopkins
 */
public abstract class Character {
    protected ArrayList<String> sections;
    /**
     * Character constructor instantiates a new arraylist
     */
    public Character(){
        this.sections = new ArrayList<String>();
    }
    /**
     * prints the sections ArrayList to terminal 
     */
    public void draw(){
        for (String string : this.sections){
            System.out.println(string);
        }
    }

    
}
