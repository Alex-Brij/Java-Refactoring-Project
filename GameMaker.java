import java.io.IOException;

// abstract creator class used to instanciate concrete creator classes
public abstract class GameMaker {

    // factory method will be implemented by the subclasses of the GameMaker class
    public abstract Game CreateGame();

    // method to create and play game- to be called in main method for each game
    public Game PlayGame() throws IOException {
        Game game = CreateGame();
        game.initialise();
        game.play();
        game.declare();

        return game;
    }

}














