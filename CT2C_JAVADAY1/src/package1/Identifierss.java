package package1;

public class Identifierss {
	int age = 25;
    String name = "Chandru";
    double salary = 50000.75;

    void displayInfo() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }


	public static void main(String[] args) {
		Identifierss obj = new Identifierss();
        obj.displayInfo();

	}

}
