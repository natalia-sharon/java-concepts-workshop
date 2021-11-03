import java.util.List;

public class Main {

    /*
     * Welcome to your method overriding workshop!
     * You should make your changes in the Football class, and call those changes here.
     * Use function overriding to get the Football class to print out the name and number of players.
     */

    public static void main(String[] args) {
        Football football = new Football();

        Player player1 = new Player(23, "John Doe");
        Player player2 = new Player(67, "Jane Doe");
        Player player3 = new Player(7, "Ama Attah");
        Player player4 = new Player(15, "Kofi Mensah");

        Team team1 = new Team(List.of(player1, player2));
        Team team2 = new Team(List.of(player3, player4));

        football.addTeam(team1);
        football.addTeam(team2);
        football.printPlayersDetails();
    }
}
