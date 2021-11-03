/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {

    private Integer noOfPlayers;

    public Football(Integer noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    @Override
    public String getName() {
        return "Football";
    }

    public Integer getNoOfPlayers() {
        return noOfPlayers;
    }

    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has " + getNoOfPlayers() + " players in " + getName());
    }


}

