/**
 * Encapsulation example
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        Student studentDetails = new Student();

        // bind all the data in one object
        studentDetails.setRollNo(1);
        studentDetails.setName("Gaurav");
        studentDetails.setFamilyName("Patel");
        studentDetails.setCity("Ahmedabad");

        System.out.println(studentDetails.getRollNo() + "\n"
                + studentDetails.getName() + "\n"
                + studentDetails.getFamilyName() + "\n"
                + studentDetails.getCity());

    }

}

/**
 * Model class
 */
class Student {

    private int rollNo;
    private String name;
    private String familyName;
    private String city;

    // constructor
    public Student() {

    }

    /**
     * @return It returns roll number
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     * @param rollNo To set the rollNo value
     */
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    /**
     * @return It returns the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name To set the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return It returns the Family name
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @param familyName To set the Family name
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @return It return the city name
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city To set the city name
     */
    public void setCity(String city) {
        this.city = city;
    }

}


