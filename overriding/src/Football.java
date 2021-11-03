/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    public int number;

    @Override
    String getName() {
        return "Football";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has " + number + " players in " + getName());
    }
}

