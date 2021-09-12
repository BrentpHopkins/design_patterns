package decorator;
/**
 * representation of a Mr.PotatoeHead
 * @author Brent Hopkins
 */
public class PotatoeHead extends Character {
    /**
     * PotatoeHead constructor creates a blank PotatoeHead in the sections ArrayList
     */
    public PotatoeHead(){
        sections.add("        ");
        sections.add("    ____");
        sections.add("  /      \\ ");
        sections.add(" |        | ");
        sections.add(" |        | ");
        sections.add("  \\      / ");
        sections.add("   \\____/ ");

    }
}
