package Day48.ArrayAndList;

import java.util.Scanner;

public class LastItem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item = "";
        String lastItem = "";

        while (true) {
            System.out.print("Enter a random string or an empty string: ");
            item = input.nextLine();

            if (item.isEmpty()) {
                break;
            } else {
                lastItem = item;
            }
        }

        System.out.println("The last item in the list is: " + lastItem);
    }
}
