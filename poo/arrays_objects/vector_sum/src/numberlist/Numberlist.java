package poo.arrays_objects.vector_sum.src.numberlist;

import java.util.Arrays;

public class Numberlist {

    private double[] numbers;

    public Numberlist(int capacity) {
        numbers = new double[(int) capacity];
    }

    public void setNumber(int position, double value) {
        numbers[position] = value;
    }

    public double sum() {
        double sum = 0.0;

        for (double number : numbers) {
            sum += number;
        }

        return sum;
    }

    public double average() {
        return sum() / numbers.length;
    }

    public int size() {
        return numbers.length;
    }

    public String toString() {
        return Arrays.toString(numbers);

    }
}
