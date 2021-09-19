package factory;
/**
 * LogCabin style HousePlan
 * @author Brent Hopkins
 */
public class LogCabinPlan extends HousePlan {
    /**
     *the Constructor for LogCabinPlan calls HousePlans constructor then calls setFeatures and SetMaterials to populate the features and materials arraylists 
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
        setFeatures();
        setMaterials();
    }
    /**
     * populates the materials array list with the appropriate materials for a LogCabinPlan
     */
    protected void setMaterials() {
        this.materials.add("Log Siding");
        this.materials.add("Board and Batten Siding");
        this.materials.add("White Pine");
        
    }
    /**
     * populates the features array list with the appropriate features for a LogCabinPlan
     */
    protected void setFeatures() {
        this.features.add("Timbered Roof");
        this.features.add("High Insulation");
        this.features.add("Rustic Effect");
        
    }
    /**
     * adds the type of home and calls the HousePlan toString method
     * @return returns the type of home and its unique qualities in a String
     */
    public String toString(){
        return "Log Cabin \n" + super.toString();
    }
}
