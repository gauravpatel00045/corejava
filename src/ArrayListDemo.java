import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Array list demonstrate to restrict the duplicate value
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayListDemo.listDemo();
        ArrayListDemo.removeDuplicateFromList();
    }

    /**
     * it displays all the list items
     */
    static void listDemo() {
        List<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Grapes");
        fruitList.add("Kiwi");

        for (String fruit : fruitList) {
            System.out.println(fruit);
        }
    }

    /**
     * It keeps only unique value in the list
     */
    static void removeDuplicateFromList() {
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Grapes");
        fruitList.add("Kiwi");
        fruitList.add("Orange");
        fruitList.add("Mango");
        System.out.println("fruit list: " + fruitList.toString());

        Set<String> uniqueListSet = new LinkedHashSet<>(fruitList);

        System.out.println("unique fruit list: " + uniqueListSet);
    }

}

