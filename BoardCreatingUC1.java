
public class BoardCreatingUC1 {
	static int[][] BOARD=new int[3][3];
	static void initBoard() {
		System.out.println("TicTacToeGame");
		for(int i=0;i<BOARD.length;i++) {
			for(int j=0;j<BOARD[i].length;j++) {
				BOARD[i][j]=10;
			}
		}
		System.out.println("Board is this");
		initBoard();
	}

}
