import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = many shapes/forms
		// dynamic = after compilation (during runtime)
		
		// ex. A corvette is a: corvette, and a car, and a vehicle, and an object
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("1 - Dog" + "\n" + "2 - Cat");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
	}

}
