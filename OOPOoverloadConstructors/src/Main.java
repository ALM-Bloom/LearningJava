
public class Main {

	public static void main(String[] args) {
		
		// overloaded constructor = multiple constructors with different parameters
		Pizza pizza = new Pizza();
		System.out.println("Here are the ingredients of your pizza:");
		System.out.println("Bread: " + pizza.bread);
		System.out.println("Sauce: " + pizza.sauce);
		System.out.println("Cheese: " + pizza.cheese);
		System.out.println("Topping: " + pizza.topping);
	}

}
