/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

import java.util.ArrayList;
import java.util.List;

public class Football extends Sports {
    protected List<Team> teams = new ArrayList<>();

    public void addTeam(Team team){
        teams.add(team);
    }

    public void printPlayersDetails(){
        teams.forEach(
                t -> t.getPlayers().forEach( p ->
                        System.out.printf("No.: %d Name: %s\n", p.getNumber(), p.getName()
                        )
                )
        );
    }
}

