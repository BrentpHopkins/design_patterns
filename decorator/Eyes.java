package decorator;
/**
 * adds eyes to the character
 * @author Brent Hopkins
 */
public class Eyes extends CharacterDecorator {
    /**
     * Eyes constructor calls the CharacterDecorator constructor
     * @param character the character to be decorated 
     */
    public Eyes(Character character){
        super(character);
    }
    /**
     * adds eyes by changing a string stored in the sections ArrayList
     */
    public void customize() {
        sections.set(3, " |  o  o  | ");
        
    }
    
}
