package factory;
/**
 * Contermorary variation of House Plan
 * @author Brent Hopkins
 */
public class ContemporaryPlan extends HousePlan {
    /**
     * the Constructor for ContemporaryPlan calls HousePlans constructor then calls setFeatures and SetMaterials to populate the features and materials arraylists 
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setFeatures();
        setMaterials();
    }
    /**
     * populates the Materials array list with the appropriate materials for a ContemporaryPlan
     */
    protected void setMaterials() {
        this.materials.add("Ceramics");
        this.materials.add("High-Strength Alloys");
        this.materials.add("Composites");
    }
    /**
     * populates the Features array list with the appropriate features for a ContemporaryPlan
     */
    protected void setFeatures() {
        this.features.add("Oversized windows");
        this.features.add("Uncoventional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor Plan");
    }
    /**
     * adds the type of home and calls the HousePlan toString method
     * @return returns the type of home and its unique qualities in a String
     */
    public String toString(){
        return "Contemporary Home \n" + super.toString();
    }
}
