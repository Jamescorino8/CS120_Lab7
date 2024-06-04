import java.util.ArrayList;
import java.util.Random;


/**
 * This class represents a standard deck of playing cards.
 * 
 * @author JAMES CORINO
 * @version 3/7/22
 */
public class Deck
{
    public static final int MAX_SIZE = 52;
    private ArrayList<Card> cards;
    private ArrayList<Card> shuffleList;

    /**
     * Construct a new standard deck of playing cards 
     * rank ordered with suits in the order spades, 
     * hearts, diamonds, and clubs.
     */
    public Deck()
    {
        cards = new ArrayList<Card>(); //construct the ArrayList
        addSuit("SPADES");
        addSuit("HEARTS");
        addSuit("DIAMONDS");
        addSuit("CLUBS");
        //Add the remaining three suits in the order indicated.
        
    }

    /**
     * Adds 13 cards of the given suit to the cards ArrayList.
     * 
     * @param suit The input suit.
     */ 
    private void addSuit(String suit)
    {
        //Commplete this method using a for loop.
        for (int i = 1; i <= 13; i++){
          Card card = new Card(suit, i);
          cards.add(card);
        }
    }

    /**
     * Returns the names of the cards in the deck, when printed,
     * are one per line.
     * 
     * @return The names of the cards in the deck, when printed,
     * are one per line.
     */
    @Override
    public String toString(){
      String ret = "";
      for(Card i: cards){
        ret = ret + i.getRankName() + " of " + i.getSuit() + "\n";
      }
        return ret; 
    }

    /**
     * Deal a single card from the top of the deck (end of the ArrayList).
     * 
     * @return The dealt card.  If there are no cards left in the deck, returns null.
     */
    public Card deal()
    {  
      
      if(cards.isEmpty()){
        return null;
        }
      Card ret = cards.get(cards.size() - 1);
      cards.remove(cards.size() - 1);
      return ret;
    }

    /**
     * Returns the number of cards remaining in the deck (not dealt).
     * 
     * @return The number of cards remaining in the deck.
     */
    public int numCardsNotDealt()
    {
        return cards.size();
    }

    /**
     * Shuffle the cards in the deck using the following algorithm:
     * 
     * 1. Create a temporary ArrayList of Card objects.
     * 2. While the cards ArrayList still has cards
     *       remove a random card from the cards ArrayList
     *       and add it to the temporary ArrayList
     * 3. Assign the temporary ArrayList to the cards ArrayList
     */
    public void shuffle()
    {
        //Complete this method using the algorithm described.
      shuffleList = new  ArrayList<Card>();
      for(int i = 0; i < 52; i ++){
        Random rand = new Random();
        int int_random = rand.nextInt(MAX_SIZE - i);
        shuffleList.add(i, cards.get(int_random));
        cards.remove(int_random);
      }
        cards = shuffleList;

      
    }
   
}