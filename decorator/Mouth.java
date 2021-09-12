package decorator;
/**
 * adds a mouth to the character
 * @author Brent Hopkins
 */
public class Mouth extends CharacterDecorator {
    /**
     * Mouth constructor calls the CharacterDecorator constructor
     * @param character the Character to be decorated 
     */
    public Mouth(Character character) {
        super(character);
    }
    /**
     * adds a mouth to the character by changing a string in the sections ArrayList
     */
    public void customize() {
        sections.set(5, "  \\ ---- / ");
        
    }
    
}
