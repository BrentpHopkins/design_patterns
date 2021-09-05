package observer;
/**
 * representation of a book 
 * @author Brent Hopkins
 */
public class Book {
    private String title = "";
    private String authorFirstName = "";
    private String authorLastName = "";
    /**
     * Book constructor sets title and author variables
     * @param title title of the Book
     * @param authorFirstName authors first name
     * @param authorLastName authors last name
     */
    public Book(String title, String authorFirstName, String authorLastName){
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * gets the title of the book
     * @return returns the title of the book
     */
    public String getTitle(){
        return this.title;
    }
    /**
     * get the authors first name
     * @return returns the first name of the author
     */
    public String getAuthorFirstName(){
        return this.authorFirstName;
    }
    /**
     * gets the authors last name
     * @return returns the last name of the author
     */
    public String getAuthorLastName(){
        return this.authorLastName;
    }
    /**
     * Book toString
     * @return returns Book infromation in a string
     */
    public String toString(){
        return ("- " +this.title + " by: " + this.authorFirstName + " " + this.authorLastName);
    }
}
