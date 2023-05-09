package ConditionalStatements;

import java.util.Scanner;
public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner6 = new Scanner(System.in);

        System.out.print("Enter your first selected number: ");
        int firstnum = scanner6.nextInt();

        System.out.print("Enter your second selected number: ");
        int secondnum = scanner6.nextInt();

        if (firstnum == secondnum) {
            System.out.println("Your numbers are the same");
        } else if (firstnum > secondnum) {
            System.out.println("The first number was larger than the second");
        } else {
            System.out.println("The second number was larger than the first");
        }
    }
}
