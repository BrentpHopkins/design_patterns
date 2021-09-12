package decorator;
/**
 * CharacterDecorator abstract base class
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;
    /**
     * CharacterDecorator constructor adds data from the Character passed to the CharacterDecorator to the CharacterDecorator sections ArrayList and calls customize
     * @param character the Character being passed to the CharacterDecorator to be customized
     */
    public CharacterDecorator(Character character){
        this.character = character;

        for (String string :character.sections){
            this.sections.add(string);
        }
        customize();
    }
    /**
     * abstract method to be implemented in classes extending CharacterDecorator
     */
    public abstract void customize();
}
