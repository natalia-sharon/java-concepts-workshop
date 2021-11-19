/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {

    public Football() {
        super(11);
    }

    public Football(int numbers) {
        super(numbers);
    }

    @Override
    String getName() {
        return "Football Sport";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println( "Each team has " + getNumberOfPlayers() + " players in " + getName());
    }
}

