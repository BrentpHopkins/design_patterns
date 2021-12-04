
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MedicalRecordAdapter implements MedicalRecord {
    private HealthRecord record;
    /**
     * Medical RecordAdapters constructor sets recor to the HealthRecord passed to the constructor
     * @param record the HealthRecord being adapted
     */
    public MedicalRecordAdapter(HealthRecord record){
        this.record = record;
    }
    /**
     * gets the first name from the HealthRecord
     * @return returns the patients first name
     */
    public String getFirstName() {
        
        return record.getName().split(" ")[0];
    }
    /**
     * gets the last name from the HealthRecord
     * @return returns the patients last name
     */
    public String getLastName() {
        return record.getName().split(" ")[1];
    }
     /**
     * gets the birthday from the HealthRecord
     * @return returns the patients birthday
     */
    public Date getBirthday() {
        return record.getBirthdate();
    }
     /**
     * gets the gender from the HealthRecord
     * @return returns the patients gender
     */
    public Gender getGender() {
        if(record.getGender() == "Male"){
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    /**
     * adds a visit to the HealthRecord
     * @param date the date of the visit
     * @param well true if it is a well visit false if not
     * @param description description of the visit
     */
    public void addVisit(Date date, boolean well, String description) {
        record.addHistory(date, well, description);
        
    }
    /**
     * converts HealthRecords visit history to MedicalRecords visit history
     * @return returns an arraylist of the patients visit history
     */
    public ArrayList<Visit> getVisitHistory() {
        ArrayList<String> his = record.getHistory();
        ArrayList<Visit> newHis = new ArrayList<>();
        DateFormat dateNew = new SimpleDateFormat("MM/dd/yyyy");
        for(String i: his){
            Date visitdate = null;
            boolean well;
            String description;
        

            try {
                visitdate = dateNew.parse(i.substring(11, i.length()).replaceAll(" ", "").replaceAll(",", "/"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            if(i.substring(36, 40).equalsIgnoreCase("True")){
                well = true;
            }else{
                well = false;
            }
            description = i.split("Comments: ")[1];
            newHis.add(new Visit(visitdate, well, description));
        }
        return newHis;
    }
    /**
     * creates a string containing the patients info and visit history
     * @return returns a string representation of the patients info and visit history
     */
    public String toString(){
        DateFormat dateNew = new SimpleDateFormat("MM/dd/yyyy");
        String result = "***** " + this.getFirstName() + " " + this.getLastName() + " *****\n";
        result += "Birthday: " + dateNew.format(this.getBirthday()) + "\n";
        result += "Gender: " + this.getGender()+ "\n";
        result += "Medical Visit History: \n";

        if(this.getVisitHistory().size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : this.getVisitHistory()){
                result += visit.toString() + "\n";
            }
        }
        return result;
    }
    
}
