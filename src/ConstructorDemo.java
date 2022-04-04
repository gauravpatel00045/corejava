/**
 * Parameterised Constructor Demo
 * */
public class ConstructorDemo {

    public static void main(String[] args) {
        Addition addition = new Addition(5, 4);
        addition.addition();

    }

}

/**
 * This class implements addition related operation
 * */
class Addition {
    private int a;
    private int b;

    // parameterised constructor
    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // This method perform addition operation
    public void addition() {
        System.out.print("Sum of " + a + " and " + b + " is: ");
        System.out.print(a + b);
    }

}
