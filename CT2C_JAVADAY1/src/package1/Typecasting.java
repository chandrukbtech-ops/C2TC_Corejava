package package1;

public class Typecasting {

	public static void main(String[] args) {
		int a = 10;
        double b = a; 
        double c = 9.78;
        int d = (int) c; 

        System.out.println("Original int value: " + a);
        System.out.println("After widening to double: " + b);
        System.out.println("Original double value: " + c);
        System.out.println("After narrowing to int: " + d);
	}

}
