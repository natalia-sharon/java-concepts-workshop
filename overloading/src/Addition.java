/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

import java.util.Arrays;

public class Addition {
    public void add(int ...a) {
        System.out.println(Arrays.stream(a).sum());
    }


    public void add(int a, int b, float c) {
        System.out.println(a + b + c);
    }
}

