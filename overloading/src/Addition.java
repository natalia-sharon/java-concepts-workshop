/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public void add(int i, int i1) {
        int add = i+i1;
        System.out.println(add);
    }

    public void add(int i, int i1, int i2) {
        int add = i+i1+i2;
        System.out.println(add);
    }

    public void add(int i, int i1, float i2){
        float add = i+i1+i2;
        System.out.println(add);
    }

    public void add(String s, String s1) {
        String add = s+s1;
        System.out.println(add);
    }
}

