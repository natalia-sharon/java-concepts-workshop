/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

public class Football extends Sports {
    private String name;
    private int numberOfPlayers = 5;


//    public Football(String name, int numberOfPlayers) {
//        this.name = name;

//   }
//   Using function overriding to get the Football class to print out the name and number of players.
    @Override
    String getName(){

        return "Generic Sports";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has" + " " + numberOfPlayers +" "+"players in " + this.getName());

    }




    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}

