package OOPs;

                    // Abstarction
                    
abstract class Animal {
    abstract void walk();
    Animal() { // constructor
        System.out.println("You are creating a new animal");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() { // constructor
        System.out.println("Created a horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Animals {
    public static void main(String[] args) {
        Horse horse = new Horse();
        // horse.walk();
        // horse.eat();

    }
}
