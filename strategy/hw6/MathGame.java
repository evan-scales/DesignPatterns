/**
 * MathGame class 
 * @author Evan Scales
 */
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MathGame {
    private static MathGame mathGame;
    private int score = 0;
    private Random rand;
    private Scanner reader;
    private String[] operands = new String[]{"+", "-", "*", "/"};
    DecimalFormat df;

    /**
     * Constructor for math game
     */
    private MathGame() { 
        reader = new Scanner(System.in);
        rand = new Random();
        System.out.println("Let's have fun with Math!");
        df = new DecimalFormat(".#");
    }

    /**
     * Creates a new instance of math game if not already initialized
     * @return MathGame the single instance of math game
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Plays the math game
     */
    public void play() {
        boolean quit = false;
        while(!quit) {
            System.out.print("(P)lay or (Q)uit: ");
            String answer = reader.nextLine();
            if (answer.equalsIgnoreCase("p")) {
                if (playRound()) score++;
            } else if (answer.equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("Sorry, you must enter p or q");
                continue;
            }
        }
        System.out.println("You won " + score + " games");
        System.out.println("Goodbye");
    }

    /**
     * Generates a random math equation and prompts user to answer it
     * @return Boolean if they answered correctly
     */
    private boolean playRound() {
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;
        int randOpIndex = rand.nextInt(4);
        String randOp = operands[randOpIndex];
        System.out.println("\nRound answer to 1 decimal place");
        System.out.print(num1 + " " + randOp + " " + num2 + " = ");
        double userAnswer = reader.nextDouble();
        reader.nextLine();
        double rightAnswer = getRightAnswer(num1, num2, randOpIndex);
        if (userAnswer == rightAnswer)
            System.out.println("You got it!");
        else
            System.out.println("The correct answer is: " + rightAnswer);
        return userAnswer == rightAnswer;

    }

    /**
     * Gets the right answer for the math equation
     * @param num1 int The first number
     * @param num2 int The second number
     * @param randOpIndex int Index of the random operand from the operand array
     * @return int The correct answer to the math equation
     */
    private double getRightAnswer(int num1, int num2, int randOpIndex) {
        double ret = 0.0;
        switch (randOpIndex) {
            // Add
            case 0:
                ret = (double)num1 + num2;
                break;
            // Sub
            case 1:
                ret = (double)num1 - num2;
                break;
            // Multiply
            case 2:
                ret = (double)num1 * num2;
                break;
            // Divide
            case 3:
                // Rounding solution found using
                // https://www.geeksforgeeks.org/java-program-to-round-a-number-to-n-decimal-places/
                double preRet = (double)num1/num2;
                ret = Double.parseDouble(df.format(preRet));
                break;
            default:
                break;
        }
        return ret;
    }

    
    
}