/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    int n = 12;
    @Override
    String getName() {
        return super.getName();
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println("Each team has " + n + " players in " + getName() );
    }
}

