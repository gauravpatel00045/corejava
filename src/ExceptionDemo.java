/**
 * Exception handling class
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo.tryCatchDemo();
        // ExceptionDemo.tryCatchFinally();
        ExceptionDemo.throwDemo();
    }

    /**
     * try catch example
     */
    static void tryCatchDemo() {
        try {
            int value = 40 / 0;
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
        }
        System.out.println("rest code executed");
        int sum = 5 + 4;
        System.out.println("5 + 4 = " + sum);
    }

    /**
     * Try Catch Finally demo
     */
    static void tryCatchFinally() {
        try {
            int value = 40 / 0;
        } catch (NullPointerException exception) {
            System.out.println(exception);
        }
        // executes regardless of exception occurred or not
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code..."); // This code will not execute
    }

    /**
     * Throw demo
     * It will terminate code after throwing exception and rest of the code will not execute
     */
    static void throwDemo() {
        int age = 13;
        int adultAge = 18;
        if (age < adultAge) {
            throw new ArithmeticException("you are not an adult");
        } else {
            System.out.println("You are an adult");
        }
    }

}



