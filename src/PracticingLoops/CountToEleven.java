package PracticingLoops;
import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number less than 11: ");
        int num = scanner.nextInt();

        for (int i = num; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
