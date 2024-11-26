import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int maximumAttempts = 5;
        int rounds = 3;
        int score =0;
        System.out.println("Welcome To The Number Guessing Game! Make Sure You Enter Only Numbers Or Integer values ");
        System.out.println("You only have " + maximumAttempts + " " + "attempts to guess the number in each round .");


        // FOR A USER TO GUESS A NUMBER BETWEEN THE RANGE
        for(int round =1; round <= rounds;round++){
            int theNumberToBeGuessed= rand.nextInt(100) +1;
            System.out.println("\nRound " +round + ": Guess a number between 1 and 100 .");
            boolean hasWon = false;
             for(int attempt =1; attempt <= maximumAttempts; attempt++){
                 System.out.print("Attempt " + attempt +" : Enter the guess number: ");
                 int guess = scan.nextInt();

                 if( guess < theNumberToBeGuessed){
                     System.out.println("Number guessed is too low !");
                 } else if (guess > theNumberToBeGuessed) {
                     System.out.println("Number guessed is too high!");
                 }else{
                     System.out.println("✔Correct! You guessed the right number!" + theNumberToBeGuessed);
                     score += maximumAttempts -attempt +1;
                     hasWon = true;
                     break;
                 }
             }

             if(!hasWon){
                 System.out.println("You have used all your attempts. The correct number was " + theNumberToBeGuessed + ".");
             }
        }

        System.out.println("\nGame Over!!! Your total score is :" +score);
        scan.close();

    }
}