/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private int playerNumber;
    private String playerName;

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Football(int playerNumber, String playerName) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
    }

    @Override
    String getName() {
        return this.playerName;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has n players in " + getName())  ;
    }
}

