/**
 * Runtime Polymorphism Example
 */
public class Polymorphism {

    public static void main(String[] args) {
        Bike b = new Splendor(); // upcasting
        b.run();
    }

}

/**
 * Vehicle class
 */
class Bike {

    // method for implement
    void run() {
        System.out.println("running");
    }

}

/**
 * Splendor class
 */
class Splendor extends Bike {

    // method for implement
    void run() {
        System.out.println("running safely with 60km");
    }

}
