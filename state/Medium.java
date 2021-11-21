package state;

import java.util.Random;
/**
 * the Medium difficulty state for arithemetic game
 * @author Brent Hopkins
 */
public class Medium implements State{
    private ArithemeticGame game;
     /**
     * the Medium constructor sets game to the arithemetic game object passed to it 
     * @param game the arithemetic game object to be used 
     */
    public Medium(ArithemeticGame game){
        this.game = game;
    }

    /**
     * generates a random int between 1 and 50
     * @return a random int between 1 and 50
     */
    @Override
    public int getNum() {
        Random r = new Random();
        return r.nextInt(50) + 1;
        
    }
     /**
     * picks an operator at random from a preset array
     * @return operator
     */
    @Override
    public String getOperatString() {
        String[] signs = {"+","-","*"};
        Random r = new Random();
        return signs[r.nextInt(3)];
    }
     /**
     * prints a message for the user and changes arithemetic game to the next difficulty state
     */
    @Override
    public void levelUp() {
        System.out.println("you've been advanced to the hardest mode.");
        this.game.setState(this.game.getHardState());
        
    }
    /**
     * prints a message for the user and changes arithemetic game to the previous difficulty state
     */
    @Override
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        this.game.setState(this.game.getEasyState());
        
    }
    
}
