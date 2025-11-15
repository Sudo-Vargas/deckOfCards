import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        boolean playGame = true;

        while (playGame) {

            // creates a new deck object
            Deck deck = new Deck();

            // shuffle the deck before dealing the hand
            deck.shuffle();

            //deals the players hand with handSize size
            Hand playerHand = deck.dealHand(2);
            int playerScore = playerHand.addScore(deck);

            //deals the dealers hand with handSize size
            Hand dealerHand = deck.dealHand(2);
            int dealerScore = dealerHand.addScore(deck);

            // gets the hand arraylist from the hand class with the getter method.
            ArrayList<Card> phand = playerHand.getHand();
            ArrayList<Card> dhand = dealerHand.getHand();

            // logic to print player hand
            System.out.println("Your hand is:");
            for (Card card : phand) {
                System.out.println(card.getRank() + " of " + card.getSuit());
            }

            System.out.println("the player's score is: " + playerScore);

            // logic to print dealer hand
            System.out.println("The dealer's hand is:");
            for (Card card : dhand) {
                System.out.println(card.getRank() + " of " + card.getSuit());
            }

            System.out.println("the dealer's score is: " + dealerScore);



        }

    }

}
