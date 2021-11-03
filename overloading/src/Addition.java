/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public int add(int firstNum, int secondNum){
        return firstNum + secondNum;
    }

    public int add(int firstNum, int secondNum, int thirdNum){
        return firstNum + secondNum + thirdNum;
    }

    public float add(int firstNum,int secondNum, float thirdNum){
        return firstNum + secondNum + thirdNum;
    }

    public String add( String firstNum, String secondNum){
        return firstNum + secondNum;
    }

}

