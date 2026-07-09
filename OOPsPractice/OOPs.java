package OOPsPractice;

class Gym {
    String equipment;
    String day;
    int time;

    public void fitness() {
        System.out.println(this.equipment);
        System.out.println(this.day);
        System.out.println(this.time);
        System.out.println("Let's go to gym");
    }

}

public class OOPs {
    public static void main(String[] args) {
        Gym gym1 = new Gym();
        gym1.equipment = "Dumbell";
        gym1.day = "Chest day";
        gym1.time = 6;
        gym1.fitness();
    }
}
