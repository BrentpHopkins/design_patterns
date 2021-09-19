package factory;
/**
 * creates a HousePlan based on requested style
 * @author Brent Hopkins
 */
public class HousePlanFactory {
    /**
     * checks String input and creates then returns a HousePlan object based on requested style
     * @param typel style of HousePlan to be created
     * @return returns the requested HousePlan style, null if style is not found
     */
    public static HousePlan createHousePlan(String typel){
        if(typel.equalsIgnoreCase("Log Cabin")){
            return new LogCabinPlan();
        }else if(typel.equalsIgnoreCase("Tiny Home")){
            return new TinyHomePlan();
        }else if(typel.equalsIgnoreCase("Contemporary Home")){
            return new ContemporaryPlan();
        }
        return null;
    }
}
