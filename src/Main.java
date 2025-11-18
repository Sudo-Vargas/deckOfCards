import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to Blackjack!");

        boolean playGame = true;

        while (playGame) {

            // creates a new deck object
            Deck deck = new Deck();

            // creates a new scanner object
            Scanner scanner = new Scanner(System.in);

            // shuffle the deck before dealing the hand
            deck.shuffle();

            // deals the players hand with handSize size
            Hand playerHand = deck.dealHand(2);
            int playerScore = playerHand.addScore(deck);

            // deals the dealers hand with handSize size
            Hand dealerHand = deck.dealHand(2);
            int dealerScore = dealerHand.addScore(deck);

            // gets the hand arraylist from the hand class with the getter method.
            ArrayList<Card> phand = playerHand.getHand();
            ArrayList<Card> dhand = dealerHand.getHand();

            // print player hand
            System.out.println("Your hand is:");
            for (Card card : phand) {
                System.out.println(card.getRank() + " of " + card.getSuit());
            }

            // print player score
            System.out.println("the player's score is: " + playerScore);

            // logic to print dealer hand
            System.out.println("The dealer's hand is:");
            for (Card card : dhand) {
                System.out.println(card.getRank() + " of " + card.getSuit());
            }

            // print dealer score
            System.out.println("the dealer's score is: " + dealerScore);


            // players turn logic

            // go straight to a game
            boolean playerTurn = true;

            boolean dealerTurn = false;

            //players turn logic
            while (playerTurn) {

                // asks to hit or stand
                System.out.println("Do you hit or do you stand? (h/s)");

                // gets user response as a string
                String response = scanner.nextLine();

                // if loop to handle hits and update score
                if (response.equals("h")) {

                    // gets a card from the deck
                    Card card = deck.dealHand(1).getHand().getFirst();

                    // adds the card we just got
                    playerHand.addCard(card);

                    // updates the players score
                    playerScore = playerHand.addScore(deck);

                    System.out.println("The dealer gives you a card");

                    System.out.println(card.getRank() + " of " + card.getSuit());

                    // print the new score for the player
                    System.out.println("Your new score is: " + playerScore);

                    // stops the player at 21 if they happen to already be there
                    if (playerScore == 21) {

                        System.out.println("Your score is " + playerScore + " You stand.");

                        playerTurn = false;

                        dealerTurn = true;
                    }

                    // check for bust
                    if (playerScore > 21) {

                        System.out.println("Bust!");

                        playerTurn = false;

                    }

                }

                // logic to handle stand response
                if (response.equals("s")) {

                    System.out.println("You Stand with a score of: " + playerScore);

                    playerTurn = false;

                    dealerTurn = true;
                }

            }

            // dealers turn
            while (dealerTurn) {

                // draws a card if score is less than 17
                if (dealerScore < 17) {

                    System.out.println("The dealer draws a card");

                    Card card = deck.dealHand(1).getHand().getFirst();

                    dealerHand.addCard(card);

                    dealerScore = dealerHand.addScore(deck);

                    // print drawn card
                    System.out.println(card.getRank() + " of " + card.getSuit());


                }

                // check for bust
                else if (dealerScore > 21) {

                    System.out.println("The dealer busts");

                    dealerTurn = false;

                }

                // stand if 17 or greater
                else if (dealerScore >= 17 ) {

                    System.out.println("The dealer stands");

                    dealerTurn = false;

                }

            }

            // bust conditions (again)
            if (playerScore > 21) {

                System.out.println("Dealer wins");

            }

            else if (dealerScore > 21) {

                System.out.println("Player wins");

            }

            // compare score after checking for bust
            else if (playerScore > dealerScore) {

                System.out.println("Player wins");

            }

            else if (playerScore < dealerScore) {

                System.out.println("Dealer wins");

            }

            else if (playerScore == dealerScore) {

                System.out.println("Tie");

            }


            // ask to play again
            System.out.println("Would you like to play again? (y/n)");

            String response = scanner.nextLine();

            if (response.equals("n")) {

                System.out.println("Goodbye");

                playGame = false;

            }
        }

    }

}
