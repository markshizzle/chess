public class Pawn extends Piece{

    public Pawn(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            symbol = "\u2659 ";
        } else if(color == "black") {
            symbol = "\u265F ";
        }
    }
}
