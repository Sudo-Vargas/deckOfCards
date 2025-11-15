import java.util.ArrayList;
import java.util.HashMap;

public class Hand {

    private final ArrayList<Card> hand;

    // constructor method to make a hand
    public Hand() {
        hand = new ArrayList<>();
    }

    // getter method to allow other classes to access hand
    public ArrayList<Card> getHand() {
        return hand;
    }

    // method to add a card to the hand. used in the deal hand method
    public void addCard(Card card) {
        hand.add(card);
    }

    public int addScore(Deck deck) {
        int score = 0;
        int aceCount = 0;
        HashMap<String, Integer> cardValues = deck.getCardValues();

        for (Card card : hand) {

            if (card.getRank().equals("Ace")) {
                aceCount++;
            }

            score += cardValues.get(card.getRank());

        }


        while (score > 21 && aceCount > 0) {
            aceCount--;
            score = score - 10;
        }


        return score;

    }
}
