import java.util.Random;

public class DiceRoller {
	Random random;
	int rollResult;
	
	DiceRoller() {
		random = new Random();
		rollResult = 0;
		roll();
	}
	
	void roll() {
		rollResult = random.nextInt(6) + 1;
		System.out.println("You rolled a " + rollResult);
	}
}
