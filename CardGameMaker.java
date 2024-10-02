// creator subclass of GameMaker, where CardGame object is created and implements the factory method 
public class CardGameMaker extends GameMaker {
    @Override
    public Game CreateGame(){
        return new CardGame();
    }       
}