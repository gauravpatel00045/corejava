import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Comparator example
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        ComparatorDemo.displaySortListByName();
    }

    /**
     * To display sorted list by  name
     */
    static void displaySortListByName() {
        ArrayList<Students> studentList = new ArrayList<Students>();
        studentList.add(new Students(101, "Vijay", 23));
        studentList.add(new Students(106, "Ajay", 27));
        studentList.add(new Students(105, "Jai", 21));

        Collections.sort(studentList, new NameComparator());
        for (Students student : studentList) {
            System.out.println(student.rollNo + " " + student.name + " " + student.age);
        }
    }

}

/**
 * Comparator example
 */
class NameComparator implements Comparator<Students> {

    /**
     * It compares the string and return value
     *
     * @param s1 First string name
     * @param s2 Second string name which needs to be compares with First one
     * @return It returns integer value
     */
    public int compare(Students s1, Students s2) {
        return s1.name.compareTo(s2.name);
    }

}