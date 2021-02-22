
public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static void main(String args[]) {

		int playerPosition = START_POSITION;
		int diceValue = (int) (Math.random() * 6) + 1;
		playerPosition = diceValue;
		System.out.println("Position of player: " + playerPosition);
	}
}
