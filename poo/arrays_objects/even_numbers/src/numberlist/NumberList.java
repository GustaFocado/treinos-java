package poo.arrays_objects.even_numbers.src.numberlist;

public class NumberList {

    private int[] numbers;

    

    public NumberList(int[] numbers) {
        this.numbers = numbers;
    }

public NumberList(int size) {
        numbers = new int[size];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public void setNumber(int position, int value){
        numbers[position] = value;  
    }

    public void showEvenNumbers() {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public void countEvenNumbers() {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers: " + count);
    }

  
}
