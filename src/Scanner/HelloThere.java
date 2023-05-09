package Scanner;

import java.util.Scanner;
        public class HelloThere {
            public static void main(String[] args) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Hello there! How are you doing today?");
                String firstInput = scanner2.nextLine();
                System.out.println("Wow - Interesting! Tell me more!");
                String secondInput = scanner2.nextLine();
                System.out.println("Nice chatting with you! Goodbye!");
                scanner2.close();

//If printed ------------------
//                System.out.println("Here's the conversation:");
//                System.out.println("Hello there! How are you doing today?");
//                System.out.println(firstInput);
//                System.out.println("Wow - Interesting! Tell me more!");
//                System.out.println(secondInput);
//                System.out.println("Nice chatting with you! Goodbye!");
    }
}
