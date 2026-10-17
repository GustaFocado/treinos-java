package poo.arrays_objects.heights.src.entities;

public class Person {

    private String name;
    private double height;
    private int age;

   public Person(String name, double height, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }

        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public boolean isUnder16() {
        return age < 16;
    }

}
