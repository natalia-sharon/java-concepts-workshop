/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {

    public void add(int i, int i1) {
        System.out.println("The sum of " + i + " and "+ i1 + " is " + (i+i1));
    }

    public void add(int i, int i1, int i2) {
        System.out.println("The sum of "+ i + "," + i1 +" and "+ i2 + " is " + (i + i1 + i2));
    }

    public void add(int i, int i1, float i2) {
        System.out.println("The sum of "+ i + "," + i1 +" and "+ i2 + " is " + (i + i1 + i2));
    }
}

