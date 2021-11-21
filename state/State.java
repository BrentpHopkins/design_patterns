package state;
/**
 * difficulty state interface for arithemetic game
 * @author Brent Hopkins
 */
public interface State {
    /**
     * gets a random int. to be defined in classes implementing State
     * @return a random int
     */
    public int getNum();
    /**
     * gets a random operator. to be defined in classes implementing State
     * @return
     */
    public String getOperatString();
    /**
     * increases the difficulty of the game, to be defined in classes implementing State
     */
    public void levelUp();
    /**
     * decreases the difficulty of the game, to be defined in classes implementing State
     */
    public void levelDown();
    
}
