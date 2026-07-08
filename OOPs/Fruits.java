package OOPs;

                    // Interfaces

interface Fruit {
    void sweet();
}

class Apple implements Fruit {
    public void sweet() {
        System.out.println("Apple is sweet");
    }
}
public class Fruits {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.sweet();
    }
}
