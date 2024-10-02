import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CardGame implements Game {
    
    private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private HashSet<String> cardsChosen=new HashSet<String>();
    private CardDeck currentDeck = new CardDeck();

    
    // creates, shuffles and views shuffled deck
    @Override
    public void initialise(){
        currentDeck.createDeck();
        currentDeck.shuffleDeck();
        Output.print(currentDeck.viewDeck());

    }
        
    // Plays card game, users picks two cards, cards and deck are displayed
    @Override
    public void play() throws IOException{
        try {
            int numberCardPicks = 2;

            // picks cards, waits for users input, displays cards
            for (int i=0; i < numberCardPicks; i++) {
                Output.print("Hit <RETURN> to choose a card");
                br.readLine();
                String currentCard = currentDeck.pickCard();
                Output.print("You chose " + currentCard);
                cardsChosen.add(currentCard);
            }

            // Display the cards chosen and remaining cards
            Output.print("Cards chosen: " + cardsChosen);
            Output.print("Remaining cards: " + currentDeck.viewDeck());
        }

        catch (IOException e) {
            Output.print("An error occurred while reading input.");
            throw e;
        }
    }

    // Declares winner if one card is an ace
    @Override
    public void declare(){
        Output.print("Cards chosen: " + cardsChosen);
        if (cardsChosen.contains("AHrts") || cardsChosen.contains("ADmnds") ||
            cardsChosen.contains("ASpds") || cardsChosen.contains("AClbs")) {
            Output.print("You won!");
        }
        else {
            Output.print("You lost!");
        }
    }
}