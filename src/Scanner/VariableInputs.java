package Scanner;

import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner4 = new Scanner(System.in);

        System.out.print("Enter a string of text: ");
        String text = scanner4.nextLine();

        System.out.print("Enter an integer: ");
        int integer = scanner4.nextInt();
        scanner4.nextLine();

        System.out.print("Enter a double: ");
        double decimal = scanner4.nextDouble();
        scanner4.nextLine();

        System.out.print("Enter a boolean value: ");
        boolean bool = scanner4.nextBoolean();
        scanner4.nextLine();


//The following lines will be printed to the console using the inputs provided by the user:
        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + integer);
        System.out.println("Your double is " + decimal);
        System.out.println("Your boolean is " + bool);
    }
}
