public class Queen extends Piece {
    public Queen(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            this.symbol = "\u2655 ";
        } else if(color == "black") {
            this.symbol = "\u265B ";
        }
    }
}
