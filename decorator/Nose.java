package decorator;
/**
 * adds a nose to the character
 * @author Brent Hopkins
 */
public class Nose extends CharacterDecorator {
    /**
     * Nose constructor calls the CharacterDecorator constructor
     * @param character the character to be decorated
     */
    public Nose(Character character) {
        super(character);
    }

    /**
     * adds a nose to the character by changing a string in the sections ArrayList
     */
    public void customize() {
        sections.set(4," |   >    | ");
        
    }
    
}
