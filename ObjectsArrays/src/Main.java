
public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[10];
		char[] characters = new char[10];
		String[] strings = new String[10];
		
		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("Pizza");
		Food food2 = new Food("Hamburger");
		Food food3 = new Food("Hot Dog");
			
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0]);
	}

}
