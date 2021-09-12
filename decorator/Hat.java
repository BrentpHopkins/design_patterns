package decorator;
/**
 * adds a hat to the character
 * @author Brent Hopkins
 */
public class Hat extends CharacterDecorator {
    /**
     * Hat constructor calls the CharacterDecorator constructor
     * @param character the Character to be decorated
     */
    public Hat(Character character) {
        super(character);
    }
    /**
     * adds a hat to the character by changing a string stored in the sections ArrayList
     */
    public void customize() {
        sections.set(0, "    ____");
        sections.set(1, " __|____|____");
        
    }
    
}
