import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CoinGame implements Game {

    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private int headsCount;
    private int tailsCount;
    private Coin c = new Coin();

    // stores number of heads and tails gotten
    @Override
    public void initialise() {
        headsCount=0;
        tailsCount=0;
    }


    @Override
    public void play() throws IOException{
        try  {

            int numberCoinFlips = 4;

            // flips coin, waits for users input, displays coinside up
            for (int i=0; i < numberCoinFlips; i++) {
                Output.print("Hit <RETURN> to flip the coin");
                br.readLine();
                String coinState = c.flip();

                if (coinState == "Head") {
                    headsCount++;
                }
                else {
                    tailsCount++;
                }
                
                // Display the result of flipping the coin
                Output.print("Your coin landed with " + coinState + " facing up");
            }
        }
        
        catch (IOException e) {
            Output.print("An error occurred while reading input.");
            throw e;
        }
    }
    
    // Declares winner If the coin landed heads up at least three times, else declares loser
    @Override
    public void declare(){
        Output.print("You got " + headsCount + " heads and " + tailsCount + " tails");

        if (headsCount >= 3) {
            Output.print("You won, because you had three heads or more");
        }
        else {
            Output.print("You lost, because you had fewer than three heads");
        }
    }
    
}
