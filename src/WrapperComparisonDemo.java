/**
 * Wrapper class variable comparison
 *
 */
public class WrapperComparisonDemo {

    public static void main(String[] args) {
        WrapperComparisonDemo.compareVariable();
    }

    /**
     * It compares wrapper class variable.
     */
    static void compareVariable() {
        Integer a = 10;
        Integer b = new Integer("10");
        if (a == b) {
            System.out.println("Both  numbers are equal");
        } else {
            System.out.println("Both  numbers are not equal");
        }
    }

}
