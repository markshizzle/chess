public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        this.board = new Piece[8][8];
    }

    public void initialize() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("white", 1, i);
            board[6][i] = new Pawn("black", 6, i);
        }

        board[0][0] = new Rook("white", 0, 0);
        board[0][1] = new Knight("white", 0, 1);
        board[0][2] = new Bishop("white", 0, 2);
        board[0][3] = new Queen("white", 0, 3);
        board[0][4] = new King("white", 0, 4);
        board[0][5] = new Bishop("white", 0, 5);
        board[0][6] = new Knight("white", 0, 6);
        board[0][7] = new Rook("white", 0, 7);

        board[7][0] = new Rook("black", 7, 0);
        board[7][1] = new Knight("black", 7, 1);
        board[7][2] = new Bishop("black", 7, 2);
        board[7][3] = new Queen("black", 7, 3);
        board[7][4] = new King("black", 7, 4);
        board[7][5] = new Bishop("black", 7, 5);
        board[7][6] = new Knight("black", 7, 6);
        board[7][7] = new Rook("black", 7, 7);
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        // Move a piece from its current position to a new position on the board
        return true;
    }

    public boolean isInCheck(String color) {
        // Check if a player of a particular color is in check
        return false;
    }

    public boolean isInCheckmate(String color) {
        // Check if a player of a particular color is in checkmate
        return false;
    }

    public void display() {
        // loop through each square on the board
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // if the square is empty, print a "-"
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    // otherwise, print the abbreviation for the piece on the square
                    System.out.print(board[i][j].getSymbol() + " ");
                }
            }
            // move to the next row
            System.out.println();
        }
    }
}