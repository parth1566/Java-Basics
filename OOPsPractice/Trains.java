package OOPsPractice;

class Train {
    String station;
    int time;
    public void departure() {
        System.out.println("Train will depart in 20 mins");
        System.out.println(this.station);
        System.out.println(this.time);
    }
}

class FastTrain extends Train {
   public void fastTrain(){
    System.out.println("This train runs superfast");
   }
}

class VandeBharat extends FastTrain{ 
    public void fafstestTrain() {
        System.out.println("This is the fastest train in India");
    }
}

class SlowTrain extends Train{
    public void slowTrain() {
        System.out.println("This train runs slow ");
    }
}

public class Trains{
    public static void main(String[] args) {
        Train train1 = new Train();
        train1.station = "New Delhi";
        train1.time = 8;
        train1.departure();
    }
}