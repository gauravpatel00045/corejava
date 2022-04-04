import java.util.Scanner;

/**
 * EMI calculator
 */
public class EMICalculator {

    public static void main(String[] args) {
        EMICalculator.getEMIInput();

    }

    /**
     * This method use to get input from the user
     */
    static void getEMIInput() {
        Scanner a = new Scanner(System.in);

        double principal, rate, time, emi;

        System.out.print("Enter principal: ");
        principal = a.nextFloat();

        System.out.print("Enter rate: ");
        rate = a.nextFloat();

        System.out.print("Enter time in year: ");
        time = a.nextFloat();

        rate = rate / (12 * 100);
        time = time * 12;

        emi = calculateEMI(principal, rate, time);

        System.out.println("Monthly EMI is: " + emi + "\n");
    }

    /**
     * It will calculate EMI
     *
     * @param principal This parameter use for amount
     * @param rate      This parameter use for interest rate
     * @param time      This parameter use for time duration
     */
    static double calculateEMI(double principal, double rate, double time) {
        double e = (principal * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);
        return e;
    }

}
