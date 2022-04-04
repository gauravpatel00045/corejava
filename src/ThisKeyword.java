/**
 * To clear the concept of use of this keyword.
 * this keyword points to a reference to the current class
 */
public class ThisKeyword {

    public static void main(String[] args) {
        StudentWithoutThis studentWithoutThis = new StudentWithoutThis(1, "Gaurav", 500);
        StudentWithThis studentWithThis = new StudentWithThis(1, "Gaurav", 500);

        studentWithoutThis.display();
        studentWithThis.display();
    }

}

/**
 * In this class this keyword is not used.
 */
class StudentWithoutThis {

    int rollNo;
    String name;
    float fee;

    StudentWithoutThis(int rollNo, String name, float fee) {
        rollNo = rollNo;
        name = name;
        fee = fee;
    }

    /**
     * This method display result
     */
    void display() {
        System.out.println("StudentWithoutThis method called");
        System.out.println(rollNo + " " + name + " " + fee);
    }

}

/**
 * In this class this keyword used that reference the current class variable
 */
class StudentWithThis {

    int rollNo;
    String name;
    float fee;

    StudentWithThis(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }

    /**
     * method displays the result
     */
    void display() {
        System.out.println("StudentWithThis method called");
        System.out.println(rollNo + " " + name + " " + fee);
    }

}
