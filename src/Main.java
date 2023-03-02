import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        ChessBoard board = new ChessBoard();
        board.initialize();
        // Enter data using BufferReader
        System.out.println("Name of player 1: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        Player player1 = new Player(reader.readLine(),"white");
        System.out.println("Name of player 2: ");
        BufferedReader reader2 = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        Player player2 = new Player(reader.readLine(),"black");
        System.out.println(player1.name + " (" + player1.color + ") vs "  + player2.name + " ("+ player2.color + ")");
        board.display();
    }
}