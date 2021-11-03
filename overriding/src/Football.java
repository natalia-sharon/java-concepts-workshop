/*
 * Welcome to your method overriding workshop!
 * Please make your changes in this class.
 * Use function overriding to print out the name and number of players from the Main class.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Football extends Sports {
    int numberOfPlayers = 11;
    String name = "Ant Lions";

    @Override
    String getName() {
        return name;
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Team has "+ numberOfPlayers + " players");
    }

    void fiveASide(){
        System.out.println("Team name: "+name +" , Team number: "+numberOfPlayers);
    }
}

