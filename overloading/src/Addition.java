/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public float add(int x, int y){
        return x + y;
    }

    public float add(int  x, int y, float z){
        return x + y + z;
    }

    public float add(String x, String y){
        return Float.parseFloat(x) + Float.parseFloat(y);
    }

}

