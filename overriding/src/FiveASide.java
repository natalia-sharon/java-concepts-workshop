import java.util.List;

public class FiveASide extends Football{

    private List<Football> players;

    public List<Football> getPlayers() {
        return players;
    }

    @Override
    void getNumberOfTeamMembers() {
        var count = this.players.stream().map(Football::getPlayerName).count();
        System.out.println("Number of players = " + count + " and sport name is " + getName());
    }
}
