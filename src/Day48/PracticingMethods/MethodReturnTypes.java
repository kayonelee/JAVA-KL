package Day48.PracticingMethods;

public class MethodReturnTypes {

    public static void main(String[] args) {
        System.out.println(getString());
        System.out.println(getInteger());
        System.out.println(getBoolean());
    }

//    METHOD RETURNING STRING, INTEGER, AND BOOLEAN LITERAL ------------------------
    public static String getString() {
        return "String of text";
    }

    public static int getInteger() {
        return 22;
    }

    public static boolean getBoolean() {
        return true;
    }
}
