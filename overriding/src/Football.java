/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private String teamName;
    private int numberOfPlayers;

    public Football(String teamName, int numberOfPlayers) {
        this.teamName = teamName;
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    String getName() {
        System.out.println(this.teamName);
        return this.teamName;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println(numberOfPlayers);
    }
}

