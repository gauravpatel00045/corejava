/**
 * Abstract class and method demo
 */
public class AbstractDemo {

    public static void main(String[] args) {
        Shape shapeCircle = new Circle(); // During runtime draw() method of Circle1 will be executed
        shapeCircle.draw();
    }

}

/**
 * Abstract class
 */
abstract class Shape {

    /**
     * This method has nobody.
     */
    abstract void draw();

}

/**
 * this class implements rectangle method
 */
class Rectangle extends Shape {

    /**
     * It prints the value
     * */
    void draw() {
        System.out.println("drawing rectangle");
    }

}

/**
 * This class implements Circle method
 */
class Circle extends Shape {

    /**
     * This method  print the value
     */
    void draw() {
        System.out.println("drawing circle");
    }

}
