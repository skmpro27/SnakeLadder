
public class SnakeLadder {
	public static final int START_POSITION = 0;
	public static final int SNAKE = 1;
	public static final int LADDER = 2;
	public static final int WINNING_POSITION = 100;

	public static void main(String args[]) {

		int playerPosition[] = new int[2];
		int countDice = 0;
		int turn = 0;
		while (playerPosition[0] != WINNING_POSITION && playerPosition[1] != WINNING_POSITION)
		{
			int diceValue = (int) (Math.random() * 6) + 1;  //dice roll
			countDice++;
			int check = (int) (Math.random() * 3);  //snake or ladder or no play
			switch (check)
			{

				case SNAKE:
					playerPosition[turn] -= diceValue;
					System.out.println("Snake");
					break;

				case LADDER:
					playerPosition[turn] += diceValue;
					System.out.println("Ladder");
					break;

				default:
					System.out.println("No Play");
			}
			if (playerPosition[turn] < START_POSITION)      //position less than 0
				playerPosition[turn] = START_POSITION;
			if (playerPosition[turn] > WINNING_POSITION)    //position more than 100
				playerPosition[turn] -= diceValue;

			System.out.println("Position of player" + (turn + 1) + ": " + playerPosition[turn]);
			System.out.println();

			if (check == LADDER);  //to change turn
				//turn = turn;
			else if (turn == 0)
				turn = 1;
			else
				turn = 0;
		}

		System.out.println("Player" + (turn + 1) + " Wins");			//winner
		System.out.println("Number of time dice rolled: " + countDice);		//number time dice roll
	}
}
