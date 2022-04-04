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
        String STATEMENT = "Month name is: ";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter month's number: ");
        int monthNumber;
        monthNumber = in.nextInt();

        System.out.println("Entered Value is: " + monthNumber);

        switch (monthNumber) {
            case 1:
                System.out.println(STATEMENT + "January");
                break;
            case 2:
                System.out.println(STATEMENT + "February");
                break;
            case 3:
                System.out.println(STATEMENT + "March");
                break;
            case 4:
                System.out.println(STATEMENT + "April");
                break;
            case 5:
                System.out.println(STATEMENT + "May");
                break;
            case 6:
                System.out.println(STATEMENT + "June");
                break;
            case 7:
                System.out.println(STATEMENT + "July");
                break;
            case 8:
                System.out.println(STATEMENT + "August");
                break;
            case 9:
                System.out.println(STATEMENT + "September");
                break;
            case 10:
                System.out.println(STATEMENT + "October");
                break;
            case 11:
                System.out.println(STATEMENT + "November");
                break;
            case 12:
                System.out.println(STATEMENT + "December");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }

}


