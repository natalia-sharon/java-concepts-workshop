/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {

    private Integer numberOfPlayers = 20;

    @Override
    String getName() {
        return "Football Sports";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has " + numberOfPlayers + " players in " + getName());
    }
}

