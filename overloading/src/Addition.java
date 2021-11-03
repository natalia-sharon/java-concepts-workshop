/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }

    public int add(int numOne, int numTwo, int numThree) {
        return numOne + numTwo + numThree;
    }

    public float add(int numOne, int numTwo, float numThree) {
        return (float) (numOne + numTwo + numThree);
    }

    public int add(String numOne, String numTwo) {
        return Integer.parseInt(numOne) + Integer.parseInt(numTwo);
    }

}

