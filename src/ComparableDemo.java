import java.util.ArrayList;
import java.util.Collections;

/**
 * Comparable Demo
 */
public class ComparableDemo {

    public static void main(String[] args) {
        ComparableDemo.displaySortList();
    }

    /**
     * To display sorted list
     */
    static void displaySortList() {
        ArrayList<Students> studentList = new ArrayList<Students>();
        studentList.add(new Students(101, "Vijay", 23));
        studentList.add(new Students(106, "Ajay", 27));
        studentList.add(new Students(105, "Jai", 21));

        Collections.sort(studentList);
        for (Students student : studentList) {
            System.out.println(student.rollNo + " " + student.name + " " + student.age);
        }
    }

}

/**
 * Getter and Setter class
 */
class Students implements Comparable<Students> {

    int rollNo;
    String name;
    int age;

    Students(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    /**
     * To compare age
     *
     * @param studentDetails Students object
     *
     */
    @Override
    public int compareTo(Students studentDetails) {
        if (age == studentDetails.age)
            return 0;
        else if (age > studentDetails.age)
            return 1;
        else
            return -1;
    }

}
