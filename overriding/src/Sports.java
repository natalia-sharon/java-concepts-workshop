/*
 * Welcome to your method overriding workshop!
 * Please don't touch this class. Make your changes in the Football class.
 * Use function overriding to get the Football class to print out the name and number of players from the Main class.
 */
public class Sports {

    private int numberOfPlayers;

    public Sports(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName());
    }
}
