package OOPsPractice;


class Refrigerator {

    String colour;
    public String brand;
    protected int temperature;
    private String model;

    public String getData() { // getter
        return this.model;
    }

    public void setData(String model) { // setter
        this.model = model;
    }


}

public class Electronics {
    public static void main(String[] args) {
        Refrigerator ref1 = new Refrigerator();
        ref1.brand = "LG";
        ref1.colour = "Blue";
        ref1.temperature = 8;
        System.out.println(ref1.brand);
        System.out.println(ref1.temperature);
        System.out.println(ref1.colour);
        ref1.setData("LG2024");
        System.out.println(ref1.getData());
    }
}
