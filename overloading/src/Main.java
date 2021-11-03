public class Main {

    /*
    * Welcome to your method overloading workshop!
    * Please don't touch this class. Make your changes in the Addition class.
    * Use function overloading to implement TWO methods which prints out the sum of the inputs.
    */

    public static void main(String[] args){
        Addition ad = new Addition();
        ad.add(1,3);
        ad.add(1,2,3);
        ad.add(1, 3, 3.5f);

        ad.add("1","2");

    }
}
