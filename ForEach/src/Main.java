import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//for-each = traversing technique to iterate through the 
		//			elements in an array/collection 
		//			(no need to mention the size of an array)
		
		//String[] cars = {"BMW", "Audi", "Honda", "Toyota"};
		ArrayList<String> carList = new ArrayList<String>();
		
		carList.add("BMW");
		carList.add("Audi");
		carList.add("Honda");
		carList.add("Toyota");
		
		for (String i : carList) {
			System.out.println(i);
		}

	}

}
