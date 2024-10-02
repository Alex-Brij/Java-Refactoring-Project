// creator subclass of GameMaker, where CoinGame object is created and implements the factory method 
public class CoinGameMaker extends GameMaker {
    
    @Override
    public Game CreateGame(){
        return new CoinGame();
    }   
}