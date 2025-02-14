
public class Main {

	public static void main(String[] args) {
		
		Human human1 = new Human("Rick", 65, 180.5);
		Human human2 = new Human("Morty", 16, 50.0);
		
		System.out.println("Name: " + human2.name);
		human1.eat();
		human2.drink();
	}

}
