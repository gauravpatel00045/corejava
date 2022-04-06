import java.util.Scanner;

/**
 * Input handling example
 */
public class InputHandlingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandlingDemo.displayIntegerHandling(scanner);
        // InputHandlingDemo.getStringInput();
    }

    /**
     * This method use to handle invalid input from user.
     * It only accepts number value
     *
     * @param inputFromUser Scanner object
     */
    static void displayIntegerHandling(Scanner inputFromUser) {
        int userInput;
        while (true) {
            try {
                System.out.println("Enter value: ");
                userInput = inputFromUser.nextInt();
                if (userInput <= 0) {
                    System.out.println("Invalid number, Try again"); // userInput is negative and execute loop again
                } else {
                    break;
                }
            } catch (Exception e) {
                //e.printStackTrace();
                System.out.println("Application issue, Try again");
                inputFromUser = new Scanner(System.in); // Create new object to get input from user
            }
        }
        System.out.println("Entered Value is: " + userInput);
    }

    /**
     * To get string value from user
     *
     * @param userInput Scanner instance
     */
    static void getStringInput(Scanner userInput) {
        System.out.println("enter value: ");
        String string = userInput.nextLine();
        System.out.println("a+b = " + string);
    }

}


