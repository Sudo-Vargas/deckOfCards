import java.util.ArrayList;

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

    public int addScore(){
        int score = 0;

        for (Card card : hand) {

        }


        return score;

    }
}
