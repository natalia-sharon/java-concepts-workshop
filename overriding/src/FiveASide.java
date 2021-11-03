/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class FiveASide extends Football {
    private final int number = 5;
    String getName(){
        return "Five a side";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has " + number + " players in " + getName());
    }

}

