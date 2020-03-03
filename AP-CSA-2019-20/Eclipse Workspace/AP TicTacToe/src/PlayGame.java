import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {
		boolean continuegame = true;
		String continueinput;
		int turnnum, row, col;
		Scanner in = new Scanner(System.in);
		while (continuegame) { //continues until game is over :)
			turnnum = 0;
			TicTacToe gameOne = new TicTacToe(); //initializes gameOne object of TicTacToe class
			System.out.println("\n============================\nDirections to play: \n============================");
			gameOne.printRowColumnDirections();
			// while loop for each turn
			while (continuegame) { // tells whos turn it is
				if (turnnum % 2 == 0) {
					System.out.println("Player 1 (X), make your turn.\n");
				} else {
					System.out.println("Player 2 (O), make your turn.\n");
				}
				//user input
				System.out.println("Enter row: ");
				row = in.nextInt() - 1;
				if (row < 0 || row > 2) {
					//uh oh row not valid
					while (row < 0 || row > 2) {
						System.out.println("Enter a valid row number [1, 2, 3]");
						row = in.nextInt() - 1;
					}
				}
				System.out.println("Enter column: ");
				col = in.nextInt() - 1;
				if (col < 0 || col > 2) {
					//uh oh col not valid
					while (col < 0 || col > 2) {
						System.out.println("Enter a valid column number [1, 2, 3]");
						col = in.nextInt() - 1;
					}
				}
				if (gameOne.placeMark(row, col) == false) {
					System.out.println("Spot Taken. You have forfeited your turn.");
				}
				gameOne.placeMark(row, col); // the single line that actually places the x or o
				gameOne.printBoard();
				turnnum++;
				gameOne.changePlayer();
				//checks to end game
				if (gameOne.isBoardFull()) {
					System.out.println("Good Game, but there was no winner :(");
					continuegame = false;
					
				} 
				if (gameOne.checkForWin()) {
					System.out.println("Congrats, we have a winner!");
					continuegame = false;
					
				}
				
			
			}
			//continue game check
			System.out.print("Play Again? [Y/N]\n");
			continueinput = in.nextLine().trim().toLowerCase();
			continueinput = in.nextLine().trim().toLowerCase();
			if (continueinput.equals("n")) {
			continuegame = false;
			} else if (continueinput.equals("y")) {
			continuegame = true;
			}
		}
		in.close();
	}
}