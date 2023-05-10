package Day48.PracticingMethods;

public class AverageMethod {

    public static void main(String[] args) {
        double average = calculateAverage(2, 5, 8);
        System.out.println("The average is " + average); //PRINT TO CONSOLE
    }
//METHOD RETURNING SUM USING THE THREE INTEGERS
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
}
//METHOD RETURNING AVERAGE(AS A DOUBLE) USING THE THREE INTEGERS
    public static double calculateAverage(int a, int b, int c) {
        int sum = calculateSum(a, b, c);
        double average = (double) sum / 3;
        return average;
    }
}

