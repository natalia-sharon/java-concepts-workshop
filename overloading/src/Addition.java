/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public float add(int num1, int num2, float num3){
        return num1 + num2 + num3;
    }

    public int add(String num1, String num2){
        return Integer.parseInt(num1) + Integer.parseInt(num2);
    }
}

