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

        //return player # and sport name
        System.out.println("Each team has " + getPlayerNumber() + " players in " + this.getName());
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    //set # of players
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    //add a new player
    public void addPlayer() {
        playerNumber++;
    }

    //add a number of players
    public void addPlayer(int numberOfPlayers) {
        playerNumber += numberOfPlayers;
    }

}

