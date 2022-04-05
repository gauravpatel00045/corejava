/**
 * Inheritance example
 */
public class Inheritance {

    public static void main(String[] args) {
        //single level inheritance
        Dog dog = new Dog();
        dog.bark();
        dog.eat(); // access Animal class method with the Dog class reference

        //multi level inheritance
        BabyDog babyDog = new BabyDog();
        babyDog.bark();
        babyDog.eat();
        babyDog.weep();
    }

}

/**
 * This class has different action method
 */
class Animal {

    /**
     * This method performs eating method
     */
    void eat() {
        System.out.println("eating...");
    }

}

/**
 * Single level Inheritance
 */
class Dog extends Animal {

    /**
     * This method will print the value
     */
    void bark() {
        System.out.println("barking...");
    }

}

/**
 * Multilevel Inheritance
 * */
class BabyDog extends Dog {

    /**
     * This method will print the value
     */
    void weep() {
        System.out.println("weeping...");
    }

}
