public class Card {

    // declare rank and suit variables
    String rank;
    String suit;

    // TODO override toString? (method)

    // constructor method to make cards
    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // test method
    public void printCard() {
        System.out.println("Hello I am a card! My rank is " + this.rank + "." + " My suit is " + this.suit + ".");
    }

    // getter methods for suit and rank
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

}
