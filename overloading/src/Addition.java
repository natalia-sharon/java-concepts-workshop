/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    float sum = 0;
    public int add(int i, int j) {
        return i + j;
    }
    public float add(int i, int j, float k) {
        return i + j + k;
    }

    public String add(String a, String b) {
        return a + " " +  b;
    }

}
