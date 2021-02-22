
public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int SNAKE = 1;
	public static final int LADDER = 2;
	public static final int WINNING_POSITION = 100;

	public static void main(String args[]) {

		int playerPosition = START_POSITION;

		while (playerPosition != WINNING_POSITION)
		{
			int diceValue = (int) (Math.random() * 6) + 1;
			int check = (int) (Math.random() * 3);

			switch (check)
			{

				case SNAKE:
					playerPosition -= diceValue;
					break;

				case LADDER:
					playerPosition += diceValue;
					break;

				default:
			}
			if (playerPosition < 0)
				playerPosition = START_POSITION;

			System.out.println("Position of player: " + playerPosition);
		}
	}
}
