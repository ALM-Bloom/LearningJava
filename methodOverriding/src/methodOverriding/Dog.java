package methodOverriding;

public class Dog extends Animal {
	@Override
	void speak() {
		System.out.println("Dog is barking");
	}

	void bark() {
		speak();
	}

}
