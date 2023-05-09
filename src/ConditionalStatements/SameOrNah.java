package ConditionalStatements;

import java.util.Scanner;
public class SameOrNah {
    public static void main(String[] args) {
        Scanner scanner8 = new Scanner(System.in);

        System.out.print("Enter your first random word: ");
        String word1 = scanner8.nextLine();

        System.out.print("Enter your second random word: ");
        String word2 = scanner8.nextLine();

        if (word1.equals(word2)) {
            System.out.println("The words are the same.");
        } else {
            System.out.println("The words are different.");
        }
    }
}
