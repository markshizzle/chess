public class Knight extends Piece{
    public Knight(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            this.symbol = "\u2658 ";
        } else if(color == "black") {
            this.symbol = "\u265E ";
        }
    }
}
