package OOPs;



class Pen{
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
} 

class Student{
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    

    

    // Student() { // This is Non-parameterised Constructor
    //     System.out.println("Constructor called");
    // }

    // Student(String name, int age) { // This is Parameterised Constructor
    //     this.name = name;
    //     this.age = age; 
    // }

    // Student(Student s2) { // This is Copy Constructor
    //     this.name = s2.name;
    //     this.age = s2.age; 
    // }

    // Student() { // This is Default Constructor

    // }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        
        Student s2 = new Student();
        s2.printInfo();

     
       
       
    }
}
