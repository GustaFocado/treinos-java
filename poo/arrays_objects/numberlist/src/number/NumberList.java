package poo.arrays_objects.numberlist.src.number;

public class NumberList {

    private int[] numbers;
    public int size;

    public NumberList(int[] numbers, int size) {
        this.numbers = numbers;
        this.size = size;
    }

    public NumberList(int capacity) {
        numbers = new int[capacity];
        size = 0;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setNumber(int position, int value){
        numbers[position] = value;  
    }

    public void showNegativeNumbers() {
    for (int number : numbers) {
        if (number < 0) {
            System.out.println(number);
        }
    }
}


}
