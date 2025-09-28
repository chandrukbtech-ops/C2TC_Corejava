package day3;

public class Customer {
    private int id;
    private String name;
    private String email;

    public Customer() {
        this.id = 0;
        this.name = "Unknown";
        this.email = "Not Provided";
    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.email = "Not Provided";
    }

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println();
    }
}
