package OOPsPractice;

class Bird {
    void sound() {
        System.out.println("Chirp!! Chirp!!");
    }
}


class Duck extends Bird{
    @Override
    void sound() {
        System.out.println("Quack!! Quack!!");
    }
}

public class Birds{
    public static void main(String[] args) {
        Bird bird1 = new Duck();
        bird1.sound();
    }  
}
