public class Deck {

    // arrays to make cards with
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

    // methods
    // TODO make method to deal hand
    // TODO make method to deal a card
    // TODO make method to shuffle deck

    public Deck() {

        for (String suit : suits) {

            for (String rank : ranks) {

                Card card = new Card(rank, suit);

                card.printCard();
            }

        }

    }


}
