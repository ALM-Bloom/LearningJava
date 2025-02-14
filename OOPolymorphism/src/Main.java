
public class Main {

	public static void main(String[] args) {
		
		// polymorphism = The ability of a single function to operate 
		//				  on different types of classes
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bicycle, boat};
		
		for (Vehicle x : racers) {
			x.go();
		}
	}

}
