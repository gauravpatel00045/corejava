/**
 * Hierarchical Inheritance Example
 */
public class HierarchicalInheritance {

    public static void main(String[] args) {
        SBI sbiBank = new SBI();
        sbiBank.sbiRate();
        sbiBank.interestRate(5); // access InterestRate method through SBI class instance

        HDFC hdfcBank = new HDFC();
        hdfcBank.hdfcRate();
        hdfcBank.interestRate(5); // access InterestRate method through HDFC class instance
    }

}

/**
 * Interest rate class
 */
class InterestRate {

    /**
     * It displays the interest rate
     *
     * @param interestRate integer value between 0 to 10
     */
    void interestRate(int interestRate) {
        System.out.println("Interest rate: " + interestRate);
    }

}

/**
 * SBI bank class
 */
class SBI extends InterestRate {

    /**
     * It shows the sbi rate
     */
    void sbiRate() {
        System.out.println("SBI rate");
    }

}

/**
 * HDFC class
 */
class HDFC extends InterestRate {

    /**
     * it shows the hdfc rate
     */
    void hdfcRate() {
        System.out.println("HDFC rate");
    }

}