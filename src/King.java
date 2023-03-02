public class King extends Piece{
    public King(String color, int x, int y) {
        super(color, x, y);
        if(color == "white") {
            this.symbol = "\u2654 ";
        } else if(color == "black"){
            this.symbol = "\u265A ";
        }
    }
}
