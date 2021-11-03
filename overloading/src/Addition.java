/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public int add(int n, int m) {
        return n + m;
    }

    public int add(int n, int m, int l) {
        return n + m + l;
    }

    public float add(float n, float m, float l) {
        return n + m + l;
    }

    public float add(String n, String m) {
        return Float.parseFloat(n) + Float.parseFloat(m);
    }
}

