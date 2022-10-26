package answers;
import helpers.*;

public class EightQueens {

    public static int numSols;

    public static void solveEightQueensProblemHelper(int row) {
        if (row == Chess.chessBoard.length) {
            Chess.printChessBoard();
            numSols++;
        } else {
            for (int col = 0; col < Chess.chessBoard.length; col++) {
                if (!Chess.isInCheckAbove(row, col)) {
                    Chess.chessBoard[row][col].setQueen();
                    solveEightQueensProblemHelper(row + 1);
                    Chess.chessBoard[row][col].setEmpty();
                }
            }
        }
    }
    
    public static int solveEightQueensProblem() {
        solveEightQueensProblemHelper(0);
        return numSols;
    }

}
