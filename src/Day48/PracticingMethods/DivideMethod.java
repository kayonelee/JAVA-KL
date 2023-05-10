package Day48.PracticingMethods;

public class DivideMethod {

    public static void main(String[] args) {
        int dividend = 1;
        int divisor = 3;

        System.out.println(dividend + "/" + divisor + "=" + divide(dividend, divisor));
    }
//METHOD THAT RETURNS THE ANSWER FROM THE TWO NUMBERS-DIVIDEND AND DIVISOR
    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }
}

