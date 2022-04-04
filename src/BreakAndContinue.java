import java.util.Random;

/**
 * This class demonstrate the use of break and continue statement
 */
public class BreakAndContinue {

    public static void main(String[] args) {
        BreakAndContinue.breakDemo();
        System.out.println();
        BreakAndContinue.continueDemo();
    }

    /**
     * This method use to print number until  7
     */
    static void breakDemo() {
        int breakNumber = 7;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            if (i == breakNumber) {
                break;
            }
        }
    }

    /**
     * This method use to print number continuously after desire number skip
     */
    static void continueDemo() {
        int skipNumber = 5;
        for (int i = 1; i <= 10; i++) {
            if (i == skipNumber) {
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }

}
