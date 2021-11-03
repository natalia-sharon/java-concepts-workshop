public class FiveASide extends Football {

    int numberOfPlayers = 5;

    @Override
    String getName() {
        return super.getName();
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.printf("This form of football has %s players per team%n", numberOfPlayers);;
    }
}
