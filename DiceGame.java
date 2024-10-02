import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class DiceGame implements Game {

    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private HashSet<Integer> numbersRolled=new HashSet<Integer>();
    private Dice die = new Dice();


    @Override
    public void initialise(){        
        //empty
    }

    // Plays game, rolls dice, twice, roll results are displayed
    @Override    
    public void play() throws IOException{
        try {
            int numberDiceRolls = 2;

            // rolls dice, waits for users input, displays dice rolled
            for (int i=0; i < numberDiceRolls; i++) {
                Output.print("Hit <RETURN> to roll the die");
                br.readLine(); 
                int dieRoll= die.rollDice();
                Output.print("You rolled " + dieRoll);
                numbersRolled.add(Integer.valueOf(dieRoll));
            }
        
            // Display the numbers rolled
            Output.print("Numbers rolled: " + numbersRolled);
        } 

        catch (IOException e) {
            Output.print("An error occurred while reading input.");
            throw e;
        }
    }

    // Declares winnder if at least one of the die rolls is a 1
    @Override
    public void declare(){
        if (numbersRolled.contains(Integer.valueOf(1))) {
            Output.print("You won!");
        }
        else {
            Output.print("You lost!");
        }
    }
    
}