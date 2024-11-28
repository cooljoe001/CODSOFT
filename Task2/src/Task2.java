import java.util.Scanner;


public class Task2{
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int[] marksObtained = new int[5];
        int total = 0;
        double average;
        char grade;

        // Input marks for each subject, with validation
        for (int    a = 0; a < 5; a++) {
            while (true) {
                System.out.print("Enter marks for subject " + (a + 1) + " (0-100): ");
                if (input.hasNextInt()) {

                    marksObtained[a] = input.nextInt();
                    // Check if marks are within the valid range
                    if (marksObtained[a] >= 0 && marksObtained[a] <= 100) {
                        total += marksObtained[a];
                        break;
                    } else {
                        System.out.println("Invalid input: Input a number between 0-100. Please try again.");
                    }
                } else {
                    System.out.println("Input Error : Enter numerical values only");
                    input.next();
                }
            }
        }

        // Calculate total
        average = total / 5.0;

        // Determining  the grade based on the average percentage
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }


        // Outputting the results
         System.out.println("Total marks obtained in all the subjects = \t" + total);
        System.out.println("Average Percentage: \t" + average + "%");
        System.out.println(" You had grade :\t " + grade);

        input.close();


    }
}