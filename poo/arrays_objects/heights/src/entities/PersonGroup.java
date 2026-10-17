package poo.arrays_objects.heights.src.entities;

public class PersonGroup {

    private Person[] persons;

    public PersonGroup(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive");
        }
        this.persons = new Person[size];
    }

    public void addPerson(Person person, int index) {
        if (index < 0 || index >= persons.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        persons[index] = person;
    }

    public double averageHeight() {
        double sum = 0.0;

        for (Person person : persons) {
            sum += person.getHeight();
        }

        return sum / persons.length;
    }

    public double percentageUnder16() {
        int count = 0;

        for (Person person : persons) {
            if (person.isUnder16()) {
                count++;
            }
        }

        return (double) count / persons.length * 100;

    }

    public void showUnder16() {
        System.out.println("People under 16 years old:");
        for (Person person : persons) {
            if (person.isUnder16()) {
                System.out.println(person.getName());
            }
        }
    }
    
}