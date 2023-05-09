package ConditionalStatements;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner5 = new Scanner(System.in);

        System.out.print("Enter a number greater than 212: ");
        int temperature = scanner5.nextInt();

        if (temperature >= 212) {
            System.out.println("Water is boiling!");
        }
    }
}
