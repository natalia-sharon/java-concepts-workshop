/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public int add(int x, int y) {
        return x + y;
    }

    public float add(int x, int y, float z) {
        return x + y + z;
    }

    public int add(String x, String y) {
        return Integer.parseInt(x) + Integer.parseInt(y);
    }
}

