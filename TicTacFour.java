import java.util.Scanner;

public class TicTacFour {

public static void main(String[] args) throws InterruptedException { //LACORTE
		Scanner in = new Scanner(System.in);

		char[][] board = new char [7][7];

		//initialize array
		for (int row = 0; row < board.length; row++){
			for (int col = 0; col < board[0].length; col++){
				board[row][col] = ' ';
			}
		}

		int turns = 1;
		char player = 'X';
		boolean winner = false;

		//Greet players (GLORIA)
		System.out.println("^-^ .........................................^-^ ");
		System.out.println("    Welcome to TicTacFour by Group2-Ferreres!  ");
		System.out.println("^-^ .........................................^-^ ");
		Thread.sleep(3000);

		//play a turn (LACORTE)
		while (winner == false && turns <= 49){
			boolean gamePlay;
			int play;
			do {
				display(board);

				System.out.print("Player " + player + ", choose a column: ");
				play = in.nextInt();

				//validate play (LACORTE)
				gamePlay = validate(play,board);

			}while (gamePlay == false);

			//drop the checker (LACORTE)
			for (int row = board.length-1; row >= 0; row--){
				if(board[row][play] == ' '){
					board[row][play] = player;
					break;
				}
			}

			//determine if there is a winner
			winner = isWinner(player,board);

			//switch players
			if (player == 'X'){
				player = 'O';
			}else{
				player = 'X';
			}

			turns++;
		}
		display(board);

		if (winner){
			if (player=='X'){ //CHICA
				System.out.println("Player O won! Congratulations!");
			}else{
				System.out.println("Player X won! Congratulations!");
			}
		}else{
			System.out.println("TIED! Nice Game!");
		}
		in.close();
	}

	//SARILLO AND MEGRINO
	public static void display(char[][] board){
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println("---------------");
		for (int row = 0; row < board.length; row++){
			System.out.print("|");
			for (int col = 0; col < board[0].length; col++){
				System.out.print(board[row][col]);
				System.out.print("|");
			}
			System.out.println();
			System.out.println("---------------");
		}
		System.out.println(" 0 1 2 3 4 5 6");
		System.out.println();
	}

	//SACO
	public static boolean validate(int column, char[][] board){
		//valid column?
		if (column < 0 || column > board[0].length){
			return false;
		}

		//full column?
		if (board[0][column] != ' '){
			return false;
		}

		return true;
	}
	//MISUAREZ AND BANTILAN
	public static boolean isWinner(char player, char[][] board){
		//check for 4 across
		for(int row = 0; row<board.length; row++){
			for (int col = 0;col < board[0].length - 3;col++){
				if (board[row][col] == player   &&
					board[row][col+1] == player &&
					board[row][col+2] == player &&
					board[row][col+3] == player){
					return true;
				}
			}
		}
		//check for 4 up and down
		for(int row = 0; row < board.length - 3; row++){
			for(int col = 0; col < board[0].length; col++){
				if (board[row][col] == player   &&
					board[row+1][col] == player &&
					board[row+2][col] == player &&
					board[row+3][col] == player){
					return true;
				}
			}
		}
		//check upward diagonal
		for(int row = 3; row < board.length; row++){
			for(int col = 0; col < board[0].length - 3; col++){
				if (board[row][col] == player   &&
					board[row-1][col+1] == player &&
					board[row-2][col+2] == player &&
					board[row-3][col+3] == player){
					return true;
				}
			}
		}
		//check downward diagonal
		for(int row = 0; row < board.length - 3; row++){
			for(int col = 0; col < board[0].length - 3; col++){
				if (board[row][col] == player   &&
					board[row+1][col+1] == player &&
					board[row+2][col+2] == player &&
					board[row+3][col+3] == player){
					return true;
				}
			}
		}
		return false;
	}
}