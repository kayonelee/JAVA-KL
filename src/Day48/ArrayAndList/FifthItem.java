package Day48.ArrayAndList;

import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a random string: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings[i] = input;
            count++;
        }

        // CHECKING TO MAKE SURE USER INPUT AT LEAST FIVE STRINGS IF NOT PROMPT MSG
        if (count >= 5) {
            System.out.println("The fifth item in the list is " + strings[4]);
        } else {
            System.out.println("Add more strings, not enough");
        }
    }
}
