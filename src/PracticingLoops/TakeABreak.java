package PracticingLoops;

import java.util.Scanner;
public class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner9 = new Scanner(System.in);

        String response = "";

        while (!response.equals("yes")) {
            System.out.print("Do you want to take a break? ");
            response = scanner9.nextLine();
        }

        System.out.println("Ok! Let's take a 10 minute break.");
    }
}
