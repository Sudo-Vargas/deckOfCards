import java.util.ArrayList;

public class Hand {
    // TODO override toString? (method)

    private ArrayList<Card> hand;


    public Hand (){
        hand = new ArrayList<>();
    }

    // getter method to allow other classes to access hand
    public ArrayList<Card> getHand(){
        return hand;
    }

    public void addCard(Card card){
        hand.add(card);
    }

}
