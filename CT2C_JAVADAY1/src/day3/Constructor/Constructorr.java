package day3.Constructor;

public class Constructorr {
    public static void main(String[] args) {
        Person p1 = new Person();  
        Person p2 = new Person("Chandru");  
        Person p3 = new Person("Mahalakshmi", 22);  

        p1.display();
        p2.display();
        p3.display();
    }
}

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor (1 parameter)
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Parameterized constructor (2 parameters)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
