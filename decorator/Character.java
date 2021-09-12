package decorator;

import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;

    public Character(){
        this.sections = new ArrayList<String>();
    }

    public void draw(){
        for (String string : this.sections){
            System.out.println(string);
        }
    }

    
}
