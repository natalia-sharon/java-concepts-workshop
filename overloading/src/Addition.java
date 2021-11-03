/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, float c ){
        System.out.println(a+b+c);
    }

    public void stretch( String a, String b){
        int num1 =Integer.parseInt(a);
        int num2 =Integer.parseInt(b);

        System.out.println(num1+num2);
    }

}

