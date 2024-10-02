// creator subclass of GameMaker, where DiceGame object is created and implements the factory method 
public class DiceGameMaker extends GameMaker {
    @Override
    public Game CreateGame(){
        return new DiceGame();
    }
}