package observer;
     /**
      * defines abstract methods that all classes implementing Observer must include
      * @author Brent Hopkins
      */
public interface Observer {
     /**
      * update method for classes implementing Observer
      * @param book the Book to be pased to the observers update method
      */
     public void update(Book book);
     /**
      * display method to be defined in classes implementing Observer
      */
     public void display();

}
