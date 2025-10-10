import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Deck testDeck = new Deck();


        ArrayList<Card> deck = testDeck.getDeck();

        testDeck.shuffle();

        Hand testHand = testDeck.dealHand(6);


        // testDeck.dealHand(6);

        /*
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        */



        ArrayList<Card> hand = testHand.getHand();

        for (Card card : hand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

}
