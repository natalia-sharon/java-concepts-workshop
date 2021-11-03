/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

import java.util.Arrays;

public class Addition {


    public float add(float...arg) {
        float total = 0;
        for (float a : arg){
            total += a;
        }
        return total;
    }

    public float add(String...arg) {
        float total = 0;
        for (String a : arg){
            total += Float.parseFloat(a);
        }
        return total;
    }

}

