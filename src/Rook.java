public class Rook extends Piece {
    public Rook(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            symbol = "\u2656 ";
        } else if(color == "black") {
            symbol = "\u265C ";
        }
    }
}
