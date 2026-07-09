package OOPsPractice;

abstract class Phone {
    abstract void features();
    Phone() {
        System.out.println("Use me to communicate");
    }
    static void camera() {
        System.out.println("Click pictures");
    }
}

class Samsung extends Phone{
    Samsung() {
        System.out.println("Samsung phone");
    }
    
    public void features() {
        System.out.println("I have best performance");
    }
}

class Apple extends Phone{
    public void features() {
        System.out.println("I have best camera");
    }
}

public class Phones {
    public static void main(String[] args) {
        Samsung s1 = new Samsung();
        s1.features();
        s1.camera();
        Apple a1 = new Apple();
        a1.features();
    }
    

}
