import java.util.Scanner;

/**
 * This class use to print right side star pattern
 * */
public class StarPattern {
    public static void main(String[] args) {
        StarPattern.DrawPattern();
    }

    /**
     * This method use to display right side star pattern
     * */
    static void DrawPattern() {
        int i, j, row = 5;

        for (i = 0; i < row; i++) {
            //inner loop for columns
            for (j = 0; j <= i; j++) {
                //prints stars
                System.out.print("* ");
            }
            //throws the cursor in a new line after printing each line
            System.out.println();
        }

    }

}
