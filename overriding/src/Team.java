import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> players = new ArrayList<>();

    public Team(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
