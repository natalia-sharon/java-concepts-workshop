/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public Addition() {
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void add(int a, int b, float c) {
        System.out.println(a + b + (int)c);
    }

    public void add(String a, String b) {
        System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
    }
}

