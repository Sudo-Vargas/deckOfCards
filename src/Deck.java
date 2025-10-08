// import arraylist to use for deck

import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    // arrays to make deck with
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // methods
    // TODO make method to deal hand
    // TODO make method to deal a card

    private ArrayList<Card> deck;



    public Deck() {

        //ArrayList<Card> deck = new ArrayList<>();
        deck = new ArrayList<>();

        for (String suit : suits) {

            for (String rank : ranks) {

                Card card = new Card(rank, suit);

                deck.add(card);

                deck.remove(card);

                // card.printCard();
                // System.out.println(deck.size());
                // System.out.printf(rank , suit);
            }

        }


    }


    // getter method to allow main to access deck in the array
    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }


}
