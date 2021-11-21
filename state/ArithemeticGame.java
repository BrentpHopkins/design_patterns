package state;

import java.util.Scanner;
/**
 *  Basic arithemetic game
 * @author Brent Hopkins
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumsState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;

    /**
     * the ArithemeticGame consturctor instantiates all game states and a scanner, sets the current state to easy, and sets score to 0
     */
    public ArithemeticGame(){
        easyState = new Easy(this);
        mediumsState = new Medium(this);
        hardState = new Hard(this);
        state = easyState;
        score = 0;
        reader = new Scanner(System.in);
    }
    /**
     * generates a question using the current state then checks the users answer and updates score/state
     */
    public void pressQuestionButton(){
        int left = this.state.getNum();
        int right = this.state.getNum();
        String operator = this.state.getOperatString();
        int answer = 0;
        int userAnswer = 0;

        switch(operator){

            case "+":
            answer = left + right;
            break;

            case "-":
            answer = left - right;
            break;

            case "*":
            answer = left * right;
            break;

            case "/":
            answer = left / right; 
        }

        System.out.print(left + " " + operator + " " + right + ":");
        userAnswer = this.reader.nextInt();
        this.reader.nextLine();
        
        if(userAnswer == answer){
            System.out.println("Correct");
            this.score++;
        }else{
            System.out.println("Incorrect");
            this.score--;
        }

        if(this.score >= 3){
            this.score = 0;
            this.state.levelUp();
        }else if(this.score <= -3){
            this.score = 0;
            this.state.levelDown();
        }
    }
    /**
     * sets the state of arithemetic game
     * @param State the new state of arithemetic game
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * gets the easy State object
     * @return the Easy State object
     */
    public State getEasyState(){
        return this.easyState;
    }
    /**
     * gets the Medium State object
     * @return the Medium State object
     */
    public State getMediumState(){
        return this.mediumsState;
    }
    /**
     * gets the Hard State object
     * @return the Hard State Object
     */
    public State getHardState(){
        return this.hardState;
    }
}
