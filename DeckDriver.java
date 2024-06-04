
/**
 * This class may be used to test the Card and Deck classes.
 *
 * @author Prof. White
 * @version Spring 2021
 */
public class DeckDriver
{
    public static void main(String[] args)
    {
      testBasics();
      testDeal();
      testNumCardsNotDealt();
      testShuffle();
    }

    public static void testBasics()
    {
       int score = 0;
       int maxScore = 0;
       String newDeck = "ACE of SPADES\n2 of SPADES\n3 of SPADES\n4 of SPADES" +
        "\n5 of SPADES\n6 of SPADES\n7 of SPADES\n8 of SPADES\n9 of SPADES\n10 of SPADES" +
        "\nJACK of SPADES\nQUEEN of SPADES\nKING of SPADES\nACE of HEARTS\n2 of HEARTS" +
        "\n3 of HEARTS\n4 of HEARTS\n5 of HEARTS\n6 of HEARTS\n7 of HEARTS\n8 of HEARTS" +
        "\n9 of HEARTS\n10 of HEARTS\nJACK of HEARTS\nQUEEN of HEARTS\nKING of HEARTS" + 
        "\nACE of DIAMONDS\n2 of DIAMONDS\n3 of DIAMONDS\n4 of DIAMONDS\n5 of DIAMONDS" +
        "\n6 of DIAMONDS\n7 of DIAMONDS\n8 of DIAMONDS\n9 of DIAMONDS\n10 of DIAMONDS" +
        "\nJACK of DIAMONDS\nQUEEN of DIAMONDS\nKING of DIAMONDS\nACE of CLUBS\n2 of CLUBS" +
        "\n3 of CLUBS\n4 of CLUBS\n5 of CLUBS\n6 of CLUBS\n7 of CLUBS\n8 of CLUBS\n9 of CLUBS" +
        "\n10 of CLUBS\nJACK of CLUBS\nQUEEN of CLUBS\nKING of CLUBS\n";
        
        Deck deck = new Deck();
        if(deck.toString().equals(newDeck.toString())) score++;
        maxScore++;

      
        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the basic tests!");
        } else {
            System.out.println("You have more work to do on the basics.  You can do it!");
        }
    }

    public static void testDeal()
    {
        int score = 0;
        int maxScore = 0;
      
        Deck deck = new Deck();
        Card c = deck.deal();
        if (c.getSuit().equals("CLUBS") && c.getRank() == 13) {
          score++;
        }
        c = deck.deal();
        if (c.getSuit().equals("CLUBS") && c.getRank() == 12) {
          score++;
        }
        maxScore += 2;
        
        for (int i = 0; i < 15; i++)
           deck.deal();
        
        c = deck.deal();
        if (c.getSuit().equals("DIAMONDS") && c.getRank() == 9) {
          score++;
        }
        maxScore += 1;

        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the deal tests!");
        } else {
            System.out.println("You have more work to do on the deal method.  You can do it!");
        }
    }

    public static void testNumCardsNotDealt()
    {
        int score = 0;
        int maxScore = 0;

        Deck deck = new Deck();
        if(deck.numCardsNotDealt() == 52) score++;
        maxScore += 1;
        
        deck.deal();
        deck.deal();
        deck.deal();
        deck.deal();

        if(deck.numCardsNotDealt() == 48) score++;
        maxScore += 1;

        deck.deal();
        deck.deal();

        if(deck.numCardsNotDealt() == 46) score++;
        maxScore += 1; 

        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the numCardsNotDealt tests!");
        } else {
            System.out.println("You have more work to do on numCardsNotDealt.  You can do it!");
        }
    }

    public static void testShuffle()
    {
       int score = 0;
       int maxScore = 0;

       String newDeck = "ACE of SPADES\n2 of SPADES\n3 of SPADES\n4 of SPADES" +
        "\n5 of SPADES\n6 of SPADES\n7 of SPADES\n8 of SPADES\n9 of SPADES\n10 of SPADES" +
        "\nJACK of SPADES\nQUEEN of SPADES\nKING of SPADES\nACE of HEARTS\n2 of HEARTS" +
        "\n3 of HEARTS\n4 of HEARTS\n5 of HEARTS\n6 of HEARTS\n7 of HEARTS\n8 of HEARTS" +
        "\n9 of HEARTS\n10 of HEARTS\nJACK of HEARTS\nQUEEN of HEARTS\nKING of HEARTS" + 
        "\nACE of DIAMONDS\n2 of DIAMONDS\n3 of DIAMONDS\n4 of DIAMONDS\n5 of DIAMONDS" +
        "\n6 of DIAMONDS\n7 of DIAMONDS\n8 of DIAMONDS\n9 of DIAMONDS\n10 of DIAMONDS" +
        "\nJACK of DIAMONDS\nQUEEN of DIAMONDS\nKING of DIAMONDS\nACE of CLUBS\n2 of CLUBS" +
        "\n3 of CLUBS\n4 of CLUBS\n5 of CLUBS\n6 of CLUBS\n7 of CLUBS\n8 of CLUBS\n9 of CLUBS" +
        "\n10 of CLUBS\nJACK of CLUBS\nQUEEN of CLUBS\nKING of CLUBS\n";
        
        Deck deck = new Deck();
        deck.shuffle();
        if(deck.numCardsNotDealt() == 52) score++;
        maxScore += 1;
        
        int start = 0;
        int nextIndexOfNewLine = newDeck.indexOf("\n");
        String shuffledDeck = deck.toString();
        while(nextIndexOfNewLine != -1){
            if(shuffledDeck.contains(newDeck.substring(start, nextIndexOfNewLine))){
                score++;
            }
            start = nextIndexOfNewLine + 1;
            nextIndexOfNewLine = newDeck.indexOf("\n", start);      
        }
        maxScore += 52;
        
        Card dealt = deck.deal();
        if(deck.numCardsNotDealt() == 51) score++;
        shuffledDeck = shuffledDeck.substring(0, shuffledDeck.length() - 1);
        if((dealt.toString()).equals(shuffledDeck.substring(shuffledDeck.lastIndexOf("\n") + 1))) {
            score++;
        }
        maxScore += 2;
        
        for(int i = 0; i < 50; i++){
            deck.deal();
        }
        if(deck.numCardsNotDealt() == 1) score++;
        shuffledDeck = shuffledDeck.substring(0, shuffledDeck.indexOf("\n") + 1);
        if((deck.toString()).equals(shuffledDeck)) score++;
        maxScore += 2;             

        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the shuffle tests!");
        } else {
            System.out.println("You have more work to do on shuffle.  You can do it!");
        }
    }
}
