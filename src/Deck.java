// import arraylist to use for deck

import java.util.ArrayList;
import java.util.Collections;


public class Deck {

    // arrays to make cards with
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // methods
    // TODO make method to deal hand
    // TODO make method to deal a card
    // TODO make method to shuffle deck

    private ArrayList<Card> cards;


    public Deck() {

        //ArrayList<Card> cards = new ArrayList<>();
        cards = new ArrayList<>();

        for (String suit : suits) {

            for (String rank : ranks) {

                Card card = new Card(rank, suit);

                cards.add(card);


                // card.printCard();
                // System.out.println(cards.size());
                // System.out.printf(rank , suit);
            }

        }
    }

    // getter method to allow main to access cards in the array
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }

}
