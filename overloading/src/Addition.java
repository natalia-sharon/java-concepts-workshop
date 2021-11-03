/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

import java.util.Arrays;

public class Addition {

//    public void add(double... num){
//        var ans = Arrays.stream(num).reduce(0,(x,y) -> x + y);
//        System.out.println(ans);
//    }

    public void add(int a, int b){
        System.out.println("a + b " + a + b);
    }

    public void add(int a, int b, int c){
        System.out.println("a + b + c " + a + b + c);
    }

    public void add(int a, int b, float c){
        System.out.println("a + b + c " + a + b + c);
    }

    public void add(String a, String b) {
        var ans = Integer.getInteger(a) + Integer.getInteger(b);
        System.out.println(ans);
    }
}

