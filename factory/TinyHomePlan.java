package factory;

public class TinyHomePlan extends HousePlan {
    /**
     *the Constructor for TinyHomePlan calls HousePlans constructor then calls setFeatures and SetMaterials to populate the features and materials arraylists 
     */
    public TinyHomePlan() {
        super(1, 5, 200);
        setFeatures();
        setMaterials();
        
    }
    /**
     * populates the materials array list with the appropriate materials for TinyHomePlan
     */
    protected void setMaterials() {
        this.materials.add("Lumber");
        this.materials.add("Insulation");
        this.materials.add("Metal Roofing");
        this.materials.add("Hardware");
    }
    /**
     * populates the features array list with the appropriate features for TinyHomePlan
     */
    protected void setFeatures() {
        this.features.add("Natural Light");
        this.features.add("Creative Storage");
        this.features.add("Mutipurpose areas");
        this.features.add("Multi-use applications");    
    }
    /**
     * adds the type of home and calls the HousePlan toString method
     * @return returns the type of home and its unique qualities in a String
     */
    public String toString(){
        return "Tiny House \n" + super.toString();
    }
}
