package Day48.ArrayAndList;

import java.util.Scanner;

public class HowLarge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String input = "";

        while (true) {
            System.out.print("Enter a random string or an empty string: ");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            count++;
        }
        System.out.println("The total amount of items in the list was " + count + " strings.");
    }
}
