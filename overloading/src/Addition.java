/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

import java.util.Arrays;
import java.util.List;

public class Addition {
    public void add(int... numbers) {
        System.out.println(Arrays.stream(numbers).sum());
    }

    public void add(double... numbers) {
        System.out.println(Arrays.stream(numbers).sum());
    }
}

