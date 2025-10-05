import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        // Card testCard = new Card("2", "Hearts");

        // testCard.printCard();

        Deck testDeck = new Deck();

        ArrayList<Card> cards = testDeck.getCards();

        for (Card card : cards) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }

    }


}
