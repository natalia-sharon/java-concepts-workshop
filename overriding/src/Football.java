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


    @Override
    void getNumberOfTeamMembers() {
        System.out.println("The player's name is " + getName() + " and player's number is " + getPlayerNumber());

    }
}

