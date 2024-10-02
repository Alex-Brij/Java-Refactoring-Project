import java.util.ArrayList;
import java.util.Collections;

// Card deck object for use in card based games
public class CardDeck {
    
    private String[] suits = {"Hrts", "Dmnds", "Clbs", "Spds"};
    private String[] cardValues = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private ArrayList<String> cardDeck = new ArrayList<String>();

    // creates a deck by filling cardeck arraylist with cards
    public void createDeck() {
        for (int i = 0; i < suits.length; i++){
            for (int j = 0; j < cardValues.length; j++) {
                String card = cardValues[j] + suits[i];
                cardDeck.add(card); 
            }
        }  
    }


    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
    }

    // picks random card from deck and returns it, removes it from deck
    public String pickCard(){
        int randomNumber =((int) (Math.random() * cardDeck.size()));
        String selectedCard = cardDeck.get(randomNumber);
        cardDeck.remove(randomNumber);

        return selectedCard;
    }

    // view current deck
    public String viewDeck() {
        String result = "[" + String.join(", ", cardDeck) + "]";
        return result;
    }

} 