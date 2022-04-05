import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Map example
 */
public class MapDemo {

    public static void main(String[] args) {
        MapDemo.mapDemo();
    }

    /**
     * Map use
     * */
    static void mapDemo() {
        Map<Integer, String> nameList = new HashMap<>();
        nameList.put(100, "Amit");
        nameList.put(101, "Vijay");
        nameList.put(102, "Gaurav");
        nameList.put(103, "Rahul");
        nameList.put(104, "Vikas");
        nameList.put(105, "Hiren");
        // Elements can traverse in any order
        for (Map.Entry value : nameList.entrySet()) {
            System.out.println(value.getKey() + " " + value.getValue());
        }
    }

}


