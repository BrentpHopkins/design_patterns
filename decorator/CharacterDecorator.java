package decorator;

public abstract class CharacterDecorator extends Character {
    protected Character character;
    
    public CharacterDecorator(Character character){
        this.character = character;

        for (String string :character.sections){
            this.sections.add(string);
        }
        customize();
    }
    public abstract void customize();
}
