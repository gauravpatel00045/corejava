/**
 * This class use to implement different String methods.
 * */
public class StringMethodDemo {

    public static void main(String[] args) {
        StringMethodDemo.stringMethodUse();
    }

    /**
     * This method implements different String methods
     * */
    static void stringMethodUse() {

        String name = "Gaurav";
        System.out.println(name.charAt(0)); //G
        System.out.println(name.charAt(3)); //r

        String familyName = "Patel";

        System.out.println(name.concat(familyName)); //GauravPatel

        if (name.equals(familyName)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are different");
        }
    }

}
