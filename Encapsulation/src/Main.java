
public class Main {

	public static void main(String[] args) {
		
	Car myCar = new Car("Ford", "Mustang", 1969);
	
	myCar.setMake("Chevy");
	System.out.println("Make: " + myCar.getMake());
	System.out.println("Model: " + myCar.getModel());
	System.out.println("Year: " + myCar.getYear());
	
	}

}
