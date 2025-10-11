import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // creates a new deck object
        Deck testDeck = new Deck();

        // gets the deck arraylist from the deck getter method.
        ArrayList<Card> deck = testDeck.getDeck();

        // shuffle the deck before dealing the hand
        testDeck.shuffle();

        //deals the hand with numCards size
        Hand testHand = testDeck.dealHand(6);

        // this method prints each card in the deck. used for testing.
        /*
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        */

        // gets the hand arraylist from the hand class with the getter method.
        ArrayList<Card> hand = testHand.getHand();

        // this method prints each card in the hand
        for (Card card : hand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

}
