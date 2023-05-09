package PracticingLoops;

import java.util.Scanner;
public class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);

        int number = 0;

        while (number != 5) {
            System.out.print("Give a number: ");
            number = scanner10.nextInt();
        }

        System.out.println("You're done, you entered the number 5. Good Bye.");
    }
}


