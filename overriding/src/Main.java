public class Main {

    /*
     * Welcome to your method overriding workshop!
     * You should make your changes in the Football class, and call those changes here.
     * Use function overriding to get the Football class to print out the name and number of players.
     */

    public static void main(String[] args) {
        Football football = new Football();

        // Call your members here
        System.out.println(football.getName());
        football.getNumberOfTeamMembers();

    }
}
