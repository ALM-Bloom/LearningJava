
public class Main {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		String name = "John";
		int age = 30;
		sayHello(name, age);
		
		int x = 3;
		int y = 4;
		System.out.println(add(x, y));
	}
	
	static void sayHello(String title, int age) {
		System.out.println("Hello " + title + ", you are " + age + " years old!");
	}
	
	static int add(int x, int y) {
		return x + y;
	}
}
