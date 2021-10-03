package singleton;

/**
 * representation of a trivia question that contains the question, answer set,
 * and the index of the correct answer
 * @author Brent Hopkins
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctanswer;

    /**
     * the Question constructor sets the question and correctAnswer fields to the
     * strings given and then instantiates an array and populates it with the
     * Questions potential answers
     * 
     * @param question      the trivia question
     * @param ans1          potential answer to the question
     * @param ans2          potential answer to the question
     * @param ans3          potential answer to the question
     * @param ans4          potential answer to the question
     * @param correctAnswer the correct answer to the question
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctanswer = correctAnswer;
        this.answers = new String[4];
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
    }

    /**
     * creates a string with the question the potential answers
     * 
     * @return a string containing the question and the potential answers
     */
    public String toString() {
        String output;
        output = question + "\n";

        for (int i = 0; i < 4; i++) {
            output = output + (i + 1) + ". " + this.answers[i] + "\n";
        }
        return output;
    }

    /**
     * checks the given answer to see if it is equal to the correct answer
     * 
     * @param userAnswer the answer to be checked in the form of an int
     * @return true if the answer is correct, false if the answer is incorrect
     */
    public boolean isCorrect(int userAnswer) {
        return (userAnswer - 1) == this.correctanswer;
    }

    /**
     * gets the correct answer string
     * 
     * @return the correct answer in the form of a string
     */
    public String getCorrectanswer() {
        return this.answers[this.correctanswer];
    }
}
