public class Card {

    // declare rank and suit variables
    String rank;
    String suit;

    // methods
    // TODO override toString? (method)

    // constructor method to make cards
    public Card(String rank, String suit){
        this.rank = rank;
        this.suit = suit;
    }

    public void printCard(){
        System.out.println("Hello I am a card! My rank is " + this.rank + "." + " My suit is " + this.suit + ".");
    }

}
