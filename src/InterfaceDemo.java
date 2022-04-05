/**
 * Interface example
 * */
public class InterfaceDemo {

    public static void main(String[] args) {
        Drawable drawTriangle = new Triangle();
        drawTriangle.draw(); // Executes triangle class method

        Drawable drawSquare = new Square();
        drawSquare.draw(); // Executes square class method
    }

}

/**
 * Drawable class
 * */
interface Drawable{

    /**
     * draw method
     * */
    void draw();

}

/**
 * Triangle class
 * */
class Triangle implements Drawable{

    /**
     * To draw triangle shape
     * */
    public void draw(){System.out.println("drawing Triangle");}

}

/**
 * Square class
 * */
class Square implements Drawable{

    /**
     * To draw the square
     * */
    public void draw(){System.out.println("drawing Square");}

}
