import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomato");
		produceList.add("zucchini");
		produceList.add("pepper");
		
		ArrayList<String> drinkslist = new ArrayList<String>();
		drinkslist.add("soda");
		drinkslist.add("coffee");
		
		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkslist);
		
		System.out.println(groceryList.get(0).get(0));
	}

}
