/**
 * This class contains testing code for the Card class
 * 
 * @author Solution 
 * @version 3/8/2022
 */
public class CardDriver
{
    public static void main(String[] args)
    {
        testAccessors();
        testGetRankName();
        testToString();
    }

    public static void testAccessors()
    {
        int maxScore = 0;
        int score = 0;
        
        Card card = new Card("HEARTS", 1);
        if(card.getRank() == 1) score++;
        if(card.getSuit().equals("HEARTS")) score++;
        maxScore += 2;

        card = new Card("CLUBS", 2);
        if(card.getRank() == 2) score++;
        if(card.getSuit().equals("CLUBS")) score++;
        maxScore += 2;

        card = new Card("DIAMONDS", 10);
        if(card.getRank() == 10) score++;
        if(card.getSuit().equals("DIAMONDS")) score++;
        maxScore += 2;

        card = new Card("SPADES", 11);
        if(card.getRank() == 11) score++;
        if(card.getSuit().equals("SPADES")) score++;
        maxScore += 2;

        card = new Card("SPADES", 12);
        if(card.getRank() == 12) score++;
        if(card.getSuit().equals("SPADES")) score++;
        maxScore += 2;

        card = new Card("SPADES", 13);
        if(card.getRank() == 13) score++;
        if(card.getSuit().equals("SPADES")) score++;
        maxScore += 2;
        
        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the accessors tests!");
        } else {
            System.out.println("You have more work to do on the getter methods.  You can do it!");
        }
    }
    
    
    public static void testGetRankName()
    {
      
        int maxScore = 0;
        int score = 0;
        
        Card card = new Card("HEARTS", 1);
        if(card.getRankName().equals("ACE")) score++;
        maxScore += 1;

        card = new Card("CLUBS", 2);
        if(card.getRankName().equals("2")) score++;
        maxScore += 1;

        card = new Card("DIAMONDS", 10);
        if(card.getRankName().equals("10")) score++;
        maxScore += 1;

        card = new Card("SPADES", 11);
        if(card.getRankName().equals("JACK")) score++;
        maxScore += 1;

        card = new Card("SPADES", 12);       
        if(card.getRankName().equals("QUEEN")) score++;
        maxScore += 1;

        card = new Card("SPADES", 13);
        if(card.getRankName().equals("KING")) score++;
        maxScore += 1;
        System.out.println(maxScore);
        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the getRankName tests!");
        } else {
            System.out.println("You have more work to do on getRankName.  You can do it!");
        }     
       
    }
    


    
    public static void testToString()
    {
        int maxScore = 0;
        int score = 0;
        
        Card card = new Card("HEARTS", 1);
        
        if(card.toString().equals("ACE of HEARTS")) score++;
        maxScore += 1;
        card = new Card("CLUBS", 2);
       
        if(card.toString().equals("2 of CLUBS")) score++;
        maxScore += 1;
        card = new Card("DIAMONDS", 10);
        
        if(card.toString().equals("10 of DIAMONDS")) score++;
        maxScore += 1;
        card = new Card("SPADES", 11);
        
        if(card.toString().equals("JACK of SPADES")) score++;
        maxScore += 1;
        card = new Card("SPADES", 12);
        
        if(card.toString().equals("QUEEN of SPADES")) score++;
        maxScore += 1;
        card = new Card("SPADES", 13);
       
        if(card.toString().equals("KING of SPADES")) score++;
        maxScore += 1;
        System.out.println(maxScore);
        System.out.println(score);
        if(score == maxScore){
            System.out.println("Congratulations, you have passed all of the toString tests!");
        } else {
            System.out.println("You have more work to do on toString.  You can do it!");
        }
      
    }
    
}
