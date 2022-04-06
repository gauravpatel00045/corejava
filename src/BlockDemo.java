/**
 * Block use.
 * Block executes each time when class object is created
 *
 * <b>Alert:</b> Given wrong answer during the interview
 */
public class BlockDemo {
    int speed;

    public BlockDemo() {
        System.out.println("constructor is invoked");
        System.out.println("Speed variable value is: " + speed);
    }

    {
        System.out.println("instance initializer block invoked");
        speed = 60;
    }

    public static void main(String[] args) {
        BlockDemo blockDemo = new BlockDemo();
        BlockDemo blockDemo2 = new BlockDemo();
    }

}
