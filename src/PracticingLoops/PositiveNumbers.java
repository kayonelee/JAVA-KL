package PracticingLoops;

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 1;

        while (number != 0) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Number must be positive.");
            } else if (number > 0) {
                System.out.println("Your number is positive: " + number);
            }
        }

        System.out.println("You entered zero. Goodbye.");
    }
}

