// import arraylist to use for deck

import java.util.ArrayList;

// import hashmap to use to map card ranks to values
import java.util.HashMap;

// import collections for the shuffle method
import java.util.Collections;

public class Deck {

    // arrays to construct deck
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // create hashmap for card values
    private final HashMap<String, Integer> cardValues = new HashMap<>();

    private final ArrayList<Card> deck;

    // constructor method to make a deck
    public Deck() {

        // ArrayList<Card> deck = new ArrayList<>();
        deck = new ArrayList<>();

        // assign value integer to each rank string
        cardValues.put("Ace", 11);
        cardValues.put("2", 2);
        cardValues.put("3", 3);
        cardValues.put("4", 4);
        cardValues.put("5", 5);
        cardValues.put("6", 6);
        cardValues.put("7", 7);
        cardValues.put("8", 8);
        cardValues.put("9", 9);
        cardValues.put("10", 10);
        cardValues.put("Jack", 10);
        cardValues.put("Queen", 10);
        cardValues.put("King", 10);

        // loop through to construct deck
        for (String suit : suits) {

            for (String rank : ranks) {

                Card card = new Card(rank, suit);

                deck.add(card);

            }

        }

    }

    // method to deal a hand of handSize size
    public Hand dealHand(int handSize) {

        Hand hand = new Hand();

        for (int i = 0; i < handSize; i++) {
            Card card = deck.removeFirst();

            hand.addCard(card);


        }

        return hand;
    }

    // test method to print cardValues hashmap
    public void printValue() {
        System.out.println(cardValues);
    }

    // method to shuffle the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    // getter method for HashMap
    public HashMap<String, Integer> getCardValues(){
        return cardValues;
    }

}
