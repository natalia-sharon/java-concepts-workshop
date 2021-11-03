/*
 * Welcome to your method overriding workshop!
 * Please don't touch this class. Make your changes in the Football class.
 * Use function overriding to get the Football class to print out the name and number of players from the Main class.
 */
public class Sports {

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName());
    }

}
