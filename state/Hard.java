package state;

import java.util.Random;
/**
 * the hard difficulty state for arithemetic game
 * @author Brent Hopkins
 */
public class Hard implements State  {
    private ArithemeticGame game;
    /**
     * the Hard constructor sets game to the arithemetic game object passed to it 
     * @param game the arithemetic game object to be used 
     */
    public Hard(ArithemeticGame game){
        this.game = game;
    }
    /**
     * generates a random int between 1 and 100
     * @return an int between 1 and 100
     */
    @Override
    public int getNum() {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }
    /**
     * picks an operator at random from a preset array
     * @return operator
     */
    @Override
    public String getOperatString() {
        String[] signs = {"+","-","*","/"};
        Random r = new Random();
        return signs[r.nextInt(4)];
    }
     /**
     * prints a message for the user and changes arithemetic game to the next difficulty state
     */
    @Override
    public void levelUp() {
        System.out.println("You are doing so well!!!");
        
    }
     /**
     * prints a message for the user and changes arithemetic game to the previous difficulty state
     */
    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        this.game.setState(this.game.getMediumState());
        
    }
    
}
