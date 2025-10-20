// import arraylist to use for deck
import java.util.ArrayList;

// import collections for the shuffle method
import java.util.Collections;


public class Deck {

    // arrays to construct deck
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};


    private ArrayList<Card> deck;

    // constructor method to make a deck
    public Deck() {

        //ArrayList<Card> deck = new ArrayList<>();
        deck = new ArrayList<>();

        for (String suit : suits) {

            for (String rank : ranks) {

                Card card = new Card(rank, suit);

                deck.add(card);

            }

        }

    }

    // method to deal a hand of numCards size
    public Hand dealHand(int numCards) {

        Hand hand = new Hand();

        for (int i = 0; i < numCards; i++) {
            Card card = deck.removeFirst();

            hand.addCard(card);


        }

        return hand;
    }

    /*
    // getter method to allow main to access deck in the array
    public ArrayList<Card> getDeck() {
        return deck;
    }
    */

    // method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

}
