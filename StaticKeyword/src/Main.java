
public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		// The class "owns" the static member.
		
		Friend friend1 = new Friend("John");
		Friend friend2 = new Friend("Tim");
		Friend friend3 = new Friend("Patrick");
		Friend friend4 = new Friend("Sue");
		
		Friend.displayFriends();
		
		// Math methods are static
		Math.round(1.5);
		
		System.out.println(Math.PI);
	}

}
