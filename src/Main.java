import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		foo();
	}
	
	public static void foo() {
		
		System.out.print("Please enter a number: ");
		
		Scanner input = new Scanner(System.in);
		double number;
		
		while (!input.hasNextDouble()) { 	// Validates input to prevent an InputMismatchException
			System.out.print("Please enter a numerical value: ");
			input.next();	
		}
		
		number = input.nextDouble();
			
			if (number % 3 == 0)	// Divides evenly by 3
				System.out.println("foo");
			else if (number % 5 == 0)	// Divides evenly by 5
				System.out.println("bar");	
			else if (number % 15 == 0)	// Divides evenly by 15
				System.out.println("foobar");
			else 	// Does not divide evenly by 3,5, or 15
				System.out.println(number);
	}
}
