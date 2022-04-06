import java.util.Scanner;

/**
 * error Handling example
 */
public class CalculatorDemo {

    public static void main(String[] args) {
        CalculatorDemo.perform();
    }

    /**
     * Execute operation
     */
    static void perform() {
        int selectedOperation, valueA, valueB;
        // while loop to get the operation type
        while (true) {
            CalculatorDemo.showOperationMenu();
            System.out.println("Select Operation: ");
            selectedOperation = CalculatorDemo.getInputFromUser();
            if (CalculatorDemo.isOperationTypeValid(selectedOperation)) {
                break;
            } else {
                System.out.println("Invalid number, Try again");
            }
        }
        // while loop to get the valueA
        while (true) {
            System.out.println("Enter A: ");
            valueA = CalculatorDemo.getInputFromUser();
            if (CalculatorDemo.isNumberValid(valueA)) {
                break;
            } else {
                System.out.println("Invalid valueA, Try again");
            }
        }
        // while loop to get valueB
        while (true) {
            System.out.println("Enter B: ");
            valueB = CalculatorDemo.getInputFromUser();
            if (CalculatorDemo.isNumberValid(valueB)) {
                break;
            } else {
                System.out.println("Invalid valueB, Try again");
            }
        }

        CalculatorDemo.calculateValue(selectedOperation, valueA, valueB);
    }

    /**
     * to perform addition
     *
     * @param valueA integer value
     * @param valueB integer value
     * @return It returns addition value
     */
    public static int add(int valueA, int valueB) {
        return valueA + valueB;
    }

    /**
     * to perform addition
     *
     * @param valueA integer value
     * @param valueB integer value
     * @return It returns subtraction value
     */
    public static int sub(int valueA, int valueB) {
        return valueA - valueB;
    }

    /**
     * to perform multiplication
     *
     * @param valueA integer value
     * @param valueB integer value
     * @return It returns multiplication value
     */
    public static int multiply(int valueA, int valueB) {
        return valueA * valueB;
    }

    /**
     * to perform division
     *
     * @param valueA integer value
     * @param valueB integer value
     * @return It returns division value
     */
    public static int division(int valueA, int valueB) {
        return valueA / valueB;
    }

    /**
     * It shows operations
     */
    public static void showOperationMenu() {
        String operation = "Press 1 for Addition" + "\n"
                + "Press 2 for Subtraction" + "\n"
                + "Press 3 for Multiplication" + "\n"
                + "Press 4 for Division" + "\n";

        System.out.println(operation);
    }

    /**
     * This method use to get input from user and handle invalid input and shows appropriate message.
     *
     * @return It returns -1 if value doesn't match as per required.
     */
    public static int getInputFromUser() {
        Scanner input = new Scanner(System.in);
        int userInput;

        try {
            userInput = input.nextInt();
            if (userInput <= 0) {
                return userInput;
            } else {
                return userInput;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Application issue, Try again");
            input = new Scanner(System.in); // Create new object to get input from user
            userInput = -1; // if user inserted non integer value then value set to -1 to validate
        }
        return userInput;
    }

    /**
     * It checks the operation type.
     *
     * @param operationType operation type e.g. 1,2,3
     *<pre>
     *{@code
     *operationType = 1 for Addition
     *operationType = 2 for Subtraction
     *operationType = 3 for Multiplication
     *operationType = 4 for Division
     *}
     *</pre>
     */
    public static boolean isOperationTypeValid(int operationType) {
        return operationType > 0 && operationType <= 4;
    }

    /**
     * To check the integer value is greater than zero.
     *
     * @param number number that needs to validate.
     * @return it returns true if number is greater than zero
     */
    public static boolean isNumberValid(int number) {
        return number > 0;
    }

    /**
     * To perform the arithmetic operation.
     *
     * @param operationType operation type from 1 to 4
     * @param valueA        integer value
     * @param valueB        integer value
     *<pre>
     *{@code
     *operationType = 1 for Addition
     *operationType = 2 for Subtraction
     *operationType = 3 for Multiplication
     *operationType = 4 for Division
     *}
     *</pre>
     */
    static void calculateValue(int operationType, int valueA, int valueB) {
        switch (operationType) {
            case 1:
                System.out.println(valueA + " + " + valueB);
                System.out.print(CalculatorDemo.add(valueA, valueB));
                break;
            case 2:
                System.out.println(valueA + " - " + valueB);
                System.out.print(CalculatorDemo.sub(valueA, valueB));
                break;
            case 3:
                System.out.println(valueA + " * " + valueB);
                System.out.print(CalculatorDemo.multiply(valueA, valueB));
                break;
            case 4:
                System.out.println(valueA + " / " + valueB);
                System.out.print(CalculatorDemo.division(valueA, valueB));
                break;
            case 5:
                break;
            default:
                System.out.println("Sorry... Try again");
                break;
        }
    }

}
