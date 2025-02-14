
public class Main {

	public static void main(String[] args) {
		
		// overload method = methods that share the same name 
		//  				 but have different parameters
		double x = add(1.5, 2, 3.2, 4.5);
		System.out.println(x);
	}

	static int add(int x, int y) {
		System.out.println("This is a test");
		return x + y;
	}
	
	static int add(int x, int y, int z) {
		System.out.println("This is a test 2");
		return x + y + z;
	}
	
	static int add(int x, int y, int z, int w) {
		System.out.println("This is a test 3");
		return x + y + z + w;
	}
	
	static double add(double a, double b) {
		System.out.println("This is a test 4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("This is a test 5");
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		System.out.println("This is a test 6");
		return a + b + c + d;
	}
}
