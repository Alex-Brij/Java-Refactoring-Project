import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try {
            // Ask whether to play a card game or a die game
            System.out.print("Card (c), Die (d) or Coin-Flipping (f) game? ");
            String ans = br.readLine();
            
            // instanciates a new concrete creator based on the game, then calls PlayGame() method on game object 
            // so games can implement its methods
            if (ans.equals("c")) {
                GameMaker makeCardGame = new CardGameMaker();
                makeCardGame.PlayGame();
            }

            else if (ans.equals("d")) {
                GameMaker makeDiceGame = new DiceGameMaker();
                makeDiceGame.PlayGame();
            }
            
            else if (ans.equals("f")) {
                GameMaker makeCoinGame = new CoinGameMaker();
                makeCoinGame.PlayGame();
            }
            else{
                Output.print("Input not understood");

            }
        }

        catch (IOException e) {
            Output.print("An error occurred while reading input.");
            throw e;
        }

    }
    
}
