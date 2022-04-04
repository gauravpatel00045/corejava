import java.util.Scanner;

/**
 * Switch case use
 * */
public class SwitchCaseUse {

    public static void main(String[] args) {
        SwitchCaseUse.getMonthNameFromNumber();
    }

    /**
     * To get month name from number
     * */
    public static void getMonthNameFromNumber() {
        String statement = "Month name is: ";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month's number: ");
        int monthNumber;
        monthNumber = in.nextInt();

        System.out.println("Entered Value is: " + monthNumber);

        switch (monthNumber) {
            case 1:
                System.out.println(statement + "January");
                break;
            case 2:
                System.out.println(statement + "February");
                break;
            case 3:
                System.out.println(statement + "March");
                break;
            case 4:
                System.out.println(statement + "April");
                break;
            case 5:
                System.out.println(statement + "May");
                break;
            case 6:
                System.out.println(statement + "June");
                break;
            case 7:
                System.out.println(statement + "July");
                break;
            case 8:
                System.out.println(statement + "August");
                break;
            case 9:
                System.out.println(statement + "September");
                break;
            case 10:
                System.out.println(statement + "October");
                break;
            case 11:
                System.out.println(statement + "November");
                break;
            case 12:
                System.out.println(statement + "December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

}


