import java.io.IOException;

//  Game (product) inteface with methods needed for any game, implemented by the specfic games (concrete product)
public interface Game {
    void initialise();
    void play() throws IOException;
    void declare();
}