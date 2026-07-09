package OOPsPractice;

public class Gyms {
    String equipment;
    int weight;

    public void schedule(String equipment) {
        System.out.println(equipment);
    }

    public void schedule(int weight) {
        System.out.println(weight);
    }

    public void schedule(String equipment, int weight) {
        System.out.println(equipment + " " + weight);
    }

    public static void main(String[] args) {
        Gyms gym1 = new Gyms();
        gym1.equipment = "Leg extension";
        gym1.weight = 40;

        gym1.schedule(gym1.equipment, gym1.weight);
    }
}


