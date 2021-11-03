/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

import java.util.Arrays;

public class Addition {
    public double add(double... numbers){
        return Arrays.stream(numbers).sum();
    }

    public float add(int... numbers){
        return Arrays.stream(numbers).sum();
    }
}

