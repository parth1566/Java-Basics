package OOPs;

                // Static keyword

class Player {
    String name;
    static String team;

    public static void changeTeam() {
        team = "RCB";
    }

}
public class IndianCricket {
    public static void main(String[] args) {
        Player.team = "India";
        Player player1 = new Player();
        player1.name = "Virat";
        System.out.println(player1.team);
    }
}