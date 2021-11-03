/*
 * Welcome to your method overloading workshop!
 * Please make your changes in this class.
 * Use function overloading to implement TWO methods which prints out the sum of the inputs.
 */

public class Addition {
    public float add(float... numbers){
        float sum = 0.0f;
        for (float number : numbers){
            sum += number;
        }
        return sum;
    }

    public float add(int... numbers){
        float sum = 0.0f;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}

