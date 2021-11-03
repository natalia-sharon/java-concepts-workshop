/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private final int numberOfPlayers;
    private String sportName;

    public Football(int numberOfPlayers, String sportName) {
        this.numberOfPlayers = numberOfPlayers;
        this.sportName = sportName;
    }

    @Override
    String getName() {
        return this.sportName;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has " + numberOfPlayers + " players in " + getName());
    }
}

