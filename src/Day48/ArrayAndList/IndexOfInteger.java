package Day48.ArrayAndList;
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int input;
        do {
            System.out.print("Enter an integer or enter 0 to finish: ");
            input = scanner.nextInt();
            if (input != 0) {
                numbers.add(input);
            }
        } while (input != 0);
        System.out.println("Done entering integers into the list");

        System.out.print("What number are you looking for in the list? ");
        int searchNumber = scanner.nextInt();

        if (numbers.contains(searchNumber)) {
            int index = numbers.indexOf(searchNumber);
            System.out.println(searchNumber + " is at index " + index);
        } else {
            System.out.println("Invalid number-not in the list.");
        }
        scanner.close();
    }
}
