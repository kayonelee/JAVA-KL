package ConditionalStatements;

import java.util.Scanner;
public class TestScores {
    public static void main(String[] args) {
        Scanner scanner7 = new Scanner(System.in);

        System.out.print("Enter a test score between 0 and 100: ");
        int score = scanner7.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is an A.");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Your grade is a B.");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Your grade is a C.");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Your grade is a D.");
        } else {
            System.out.println("Your grade is an F.");
        }
    }
}
