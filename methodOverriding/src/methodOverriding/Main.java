package methodOverriding;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.speak();
		Animal animal = new Animal();
		dog.speak();
	}

}
