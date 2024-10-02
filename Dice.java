// Dice object
public class Dice {
    // Rolls dice, returns result
    public int rollDice(){
        int numberSides = 6;
        int dieRoll=(int)(Math.random() * numberSides) + 1;
        return dieRoll;
    }
}
