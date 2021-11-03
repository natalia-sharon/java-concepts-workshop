public class FiveASide extends Football{
    public void printInfo(){
        System.out.printf(
                "No of Team Members: %d \n Sport Name: %s",
                teams.stream().flatMap(t -> t.getPlayers().stream()).count(),
                super.getClass().getName()
        );
    }
}
