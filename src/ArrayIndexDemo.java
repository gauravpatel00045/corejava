/**
 * To find the array index
 */
public class ArrayIndexDemo {

    public static void main(String[] args) {
        int[] numberList = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // declaration and instantiation
        System.out.println("Index of 50 is: " + ArrayIndexDemo.displayArrayIndex(numberList, 50));
    }

    /**
     * It finds the index of an array element
     *
     * @param array      number array
     * @param arrayValue value from an array which we need to find the index
     * @return int It returns the index of desired array value
     */
    static int displayArrayIndex(int[] array, int arrayValue) {
        // if array is not Null
        if (array != null && array.length > 0) {
            // find length of array
            int arrayLength = array.length;
            int index = 0;

            // traverse in the array
            while (index < arrayLength) {
                // if the index element is findIndex
                // then return the index
                if (array[index] == arrayValue) {
                    return index;
                } else {
                    index += 1;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

}


