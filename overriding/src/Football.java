/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private int playerNumber = 0;

    @Override
    String getName() {
        return "Football sport";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has " + getPlayerNumber() + " players in " + this.getName());
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
}

