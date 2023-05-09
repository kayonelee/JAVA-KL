package Calculations;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter your second number: ");
        int num2 = Integer.valueOf(scanner.nextLine());

//------------Five lines using five arithmetic operators------------------------

        int addition = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + addition);

        int subtraction = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + subtraction);

        int multiplication = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + multiplication);

        double division  = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + division );

        int modulus  = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + modulus );

    }
}

