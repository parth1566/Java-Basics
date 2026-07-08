package OOPs;

// THIS IS CALLED INHERITANCE !!

class Shape { // Base Class
    String color;
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape { // Sub-Class
    public void area(int l, int h) {
        System.out.println(1/2*l*h); // single level inheritance
    }
}

class EquilateralTraingle extends Triangle{
    public void area(int l, int h) {
        System.out.println(1/2*l*h); // Multi-level inheritance
}

class Circle extends Shape{
    public void area(int r) {
        System.out.println((3.14)*r*r); // Hierarchical Inheritance
    }
}

class OOPS{
public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "red";

        }
    }
}
