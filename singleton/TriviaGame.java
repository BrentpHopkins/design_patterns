package singleton;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 * plays a trivia game with the user
 * @author Brent Hopkins
 */
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;

    /**
     * the TriviaGame constructor sets the questions ArrayList to the one returned
     * from the getTriviaQuestions method then instantiates a Random and Scanner
     * object
     */
    private TriviaGame() {
        this.questions = DataLoader.getTriviaQuestions();
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("welcome");
    }

    /**
     * creates a new instance of TrivaGame if one does not already exist
     * 
     * @return a new instance of TrivaGame if one does not already exist or the
     *         current one if it does exist
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            return new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * plays a round of trivia, tracks wins, and prompts the user to play another
     */
    public void play() {
        boolean play = true;
        int wins = 0;
        String input;

        while (play) {
            if (playRound())
                wins++;
            System.out.print("(P)lay or (Q)uit: ");
            input = reader.next();

            while (!input.equalsIgnoreCase("Q") && !input.equalsIgnoreCase("P")) {
                System.out.println("please enter a valid option");
                input = reader.next();
            }
            if (input.equalsIgnoreCase("q")) {
                play = false;
                System.out.println("You won " + wins + " Games\nGood bye!");
            }
        }
    }
    /**
     * prints the question and potential answers to the console then prompts the user to select an answer 
     * @return true if the users picks the correct answer, false if the user picks the incorrect answer 
     */
    public boolean playRound() {
        Question currentQuestion = this.questions.get(rand.nextInt(10));
        int input;

        System.out.println(currentQuestion);
        System.out.print("Enter Answer: ");

        while (!reader.hasNextInt()) {
            System.out.println("please enter a valid number");
            reader.next();
        }
        input = reader.nextInt();

        while (input > 4 || input <= 0) {
            System.out.println("Please enter a valid number");
            if (!reader.hasNextInt()) {
                reader.nextLine();
            } else
                input = reader.nextInt();
        }

        if (currentQuestion.isCorrect(input)) {
            System.out.println("You got it right!");
            return true;
        }
        System.out.println("You got it wrong!");
        return false;
    }

}
