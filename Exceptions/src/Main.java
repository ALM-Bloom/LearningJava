import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// exceptions = events that occur during the execution of programs that disrupt
		// the normal flow of instruction
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter a whole number: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number: ");
			int y = scanner.nextInt();
		
			int z = x/y;
			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! ");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			scanner.close();
			System.out.println("This will always execute");
		}
	}
}
