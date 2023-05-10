package Day48.ArrayAndList;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter an integer or enter 0 to stop:");

        int input;
        do {
            input = scanner.nextInt();
            list.add(input);
        } while (input != 0);

        int sum = getSum(list);
        System.out.println(list.toString() + " were the items in the list. The sum of that list is: " + sum);
    }

    public static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
