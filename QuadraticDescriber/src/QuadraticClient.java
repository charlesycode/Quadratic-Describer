// part 5
import java.util.Scanner;

public class QuadraticClient extends Quadratic {
	public static void main(String[] args) {
		Scanner charles = new Scanner(System.in);
		String maybe = " ";
		while (!maybe.equals("quit")) {
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for coefficients a, b, and c");
			Double num1 = charles.nextDouble();
			System.out.println("a: " + num1);
			Double num2 = charles.nextDouble();
			System.out.println("b: " + num2);
			Double num3 = charles.nextDouble();
			System.out.println("c: " + num3);
			System.out.println(" ");
			quadrDescriber(num1,num2,num3);
			System.out.println("Do you want to keep going? (Type \"yes\" to keep going or \"quit\" to quit)"); // awdokqwd
			maybe = charles.next();
		}
		charles.close();
	}	
}
