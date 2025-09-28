package day3;

public class ConstructorDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer(101, "Chandru");
        Customer c3 = new Customer(102, "Mahalakshmi", "maha@example.com");

        c1.display();
        c2.display();
        c3.display();
    }
}
