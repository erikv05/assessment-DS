package helpers;

public class Chess {

    public static Piece[][] chessBoard = new Piece[8][8];

    public static void init() {
        for (int row = 0; row < chessBoard.length; row++) {
            for (int col = 0; col < chessBoard.length; col++) {
                chessBoard[row][col] = new Piece();
            }
        }
    }

    /**
         * 
         * @param row Row of piece to check
         * @param col Col of piece to check
         * @return True if piece is in check from a piece that is at row row - 1, false otherwise
         */
        public static boolean isInCheckAbove(int row, int col) {

            if (row > 7 || col > 7 || row < 0 || col < 0) { //base case (outside)
                throw new IllegalArgumentException("Piece not in bounds at row " + 
                row + " and col " + col +"!");
            }
            int maxRows = chessBoard.length;
            int maxCols = maxRows;
            for (int i = row - 1; i >= 0; i--) { //up
                if (!chessBoard[i][col].isEmpty()) return true;
            } for (int i = 1; (row - i >= 0) && (col + i < maxCols); i++) { //up right
                if (!chessBoard[row - i][col + i].isEmpty()) return true;
            } for (int i = 1; (row - i >= 0) && (col - i >= 0); i++) { //up left
                if (!chessBoard[row - i][col - i].isEmpty()) return true;
            }
        
            //if none of those found a queen, return false
            return false;
        }


    /**
     * @brief Helper method to neatly print the board.
     */
    public static void printChessBoard() {
        //printing piecies
        for (int row = 0; row < chessBoard.length; row++) {
        //printing column nums
            System.out.print(8 - row + " ");
            for (int col = 0; col < chessBoard.length; col++){
                System.out.print(chessBoard[row][col] + " ");
            }
            System.out.println();
        }
        System.out.print(" ");;
        //printing row chars
        for (int ch = 97; ch < 105; ch++) {
            System.out.print((char) ch + " ");;
        }
        System.out.println();
    }
}