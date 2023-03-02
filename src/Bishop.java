public class Bishop extends Piece{
    public Bishop(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            symbol = "\u2657 ";
        } else if(color == "black") {
            symbol = "\u265D ";
        }
    }
}
