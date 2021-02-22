
public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int SNAKE = 1;
	public static final int LADDER = 2;

	public static void main(String args[]) {

		int playerPosition = START_POSITION;
		int diceValue = (int) (Math.random() * 6) + 1;
		int check = (int) (Math.random() * 3);

		switch (check)
		{

			case SNAKE:
				System.out.println("Snake");
				playerPosition -= diceValue;
				break;

			case LADDER:
				System.out.println("Ladder");
				playerPosition += diceValue;
				break;

			default:
				playerPosition = 0;
		}
		System.out.println("Position of player: " + playerPosition);
	}
}
