package toString;

public class Car {

	String make = "Toyota";
	String model = "Camry";
	String color = "White";
	int year = 2018;
	
	public String toString() { // Same as overload << in C++ but here it is overriding the toString() method of Object class
		return make + " " + model + " " + color + " " + year;
	}
}
