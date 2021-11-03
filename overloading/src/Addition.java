/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public int add(int a, int b){
        return a + b;
    }

    public float add(int a, int b, float c){
        return add(a, b) + c;
    }

    public int add(String a, String b){
        return add(Integer.parseInt(a), Integer.parseInt(b));
    }
}

