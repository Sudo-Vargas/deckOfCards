import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creates a new deck object
        Deck deck = new Deck();

        // create a new scanner
        Scanner scanner = new Scanner(System.in);

        // shuffle the deck before dealing the hand
        deck.shuffle();

        //deals the players hand with handSize size
        Hand playerHand = deck.dealHand(2);
        int totalScore = playerHand.addScore(deck);

        // test method to verify score logic is working
        // System.out.println(totalScore);

        //deals the dealers hand with handSize size
        Hand dealerHand = deck.dealHand(2);

        // this method prints each card in the deck. used for testing.
        /*
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
        */

        // gets the hand arraylist from the hand class with the getter method.
        ArrayList<Card> phand = playerHand.getHand();
        ArrayList<Card> dhand = dealerHand.getHand();

        // logic to print player hand
        System.out.println("Your hand is:");
        for (Card card : phand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }

        // logic to print dealer hand
        System.out.println("The dealer's hand is:");
        for (Card card : dhand) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }


        // test method to print the cardValue hashmap
        // deck.printValue();
    }

}
