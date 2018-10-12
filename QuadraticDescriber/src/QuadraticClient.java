/* 
 * This class will take in user input and return a description of the quadratic.
 * Edmond Zhou
 * 10/11/2018
 */
import java.util.*;
public class QuadraticClient{		
	public static void main(String args[]){
		System.out.println("Welcome to the Quadratic Describer \nProvide values for coefficients a, b, and c\n");
		Scanner userInput = new Scanner(System.in);
		for ( boolean test = false; test == false;) {
			System.out.print("a:");
			double a = userInput.nextDouble();
			System.out.print("b:");
			double b = userInput.nextDouble();
			System.out.print("c:");
			double c = userInput.nextDouble();
			System.out.println(Quadratic.quadrDescriber(a, b, c));
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			if (userInput.next() == "quit") {
				test = true;
			}
		}
		userInput.close();
	}
}