package state;

import java.util.Random;
/**
 * the easy difficulty state for arithemetic game
 * @author Brent Hopkins
 */
public class Easy implements State {
    private ArithemeticGame game;
    /**
     * the Easy constructor sets game to the arithemetic game object passed to it 
     * @param game the arithemetic game object to be used 
     */
    public Easy(ArithemeticGame game){
        this.game = game;
    }
    /**
     * generates a random int between 1 and 10
     * @return an int between 1 and 10
     */
    @Override
    public int getNum() {
        Random r = new Random();
        return r.nextInt(10) + 1;
    }
    /**
     * gets a random operator. + or -
     * @return operator
     */
    @Override
    public String getOperatString() {
        Double rand = Math.random();
        
        if(rand <= .49){
            return "+";
        }
        return "-";
    }
    /**
     * prints a message for the user and changes arithemetic game to the next difficulty state
     */
    @Override
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        this.game.setState(this.game.getMediumState());
        
    }
    /**
     * belittles the user
     */
    @Override
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study");
        
    }
    
}
