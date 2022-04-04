public class IfElseConcept {

    public static void main(String[] args) {
        IfElseConcept.checkAge();
    }

    /*
     * To check the age above 18.
     *
     * */
    static void checkAge() {
        int age = 30;

        int adultAge = 18;

        if (age >= adultAge) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are not an adult");
        }
    }

}
