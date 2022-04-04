/**
 * To use of while and do while loop
 * */
public class WhileLoopUse {

    public static void main(String[] args) {
        WhileLoopUse.whileLoopDemo();
        WhileLoopUse.doWhileLoopDemo();
    }

    /**
     *
     * In this method first condition will check and then loop will be performed.
     * */
    public static void whileLoopDemo() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * In this method first statement will be executed then condition will check.
     * */
    public static void doWhileLoopDemo() {
        int i = 11;
        do {
            System.out.println("Statement executed first");
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

}
