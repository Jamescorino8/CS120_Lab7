/**
 * This class contains code for the Card class
 * 
 * @author Nicholas Gati JAMES CORINO
 * @version 3/8/2022
 */
public class Card {
  private String suit;
  private int rank;
  public Card(String suit1, int rank1){
    this.suit = suit1;
    this.rank = rank1;
  }
  public int getRank(){
    return rank;
    
  }
  public String getSuit() {
    return suit;
    
  }
  public String getRankName(){
    String newSuit;
    
    if (rank == 1) {
      newSuit = "ACE";
   }
    else if (rank == 2) {
      newSuit = "2";
    }
    else if (rank == 3) {
      newSuit = "3";
    }
    else if (rank == 4) {
      newSuit = "4";
    }
    else if (rank == 5) {
      newSuit = "5";
    }
    else if (rank == 6) {
      newSuit = "6";
    }
    else if (rank == 7) {
      newSuit = "7";
    }
    else if (rank == 8) {
      newSuit = "8";
    }
    else if (rank == 9) {
      newSuit = "9";
    }
    else if (rank == 10) {
      newSuit = "10";
    }
    else if (rank == 11) {
      newSuit = "JACK";
    }
    else if (rank == 12) {
      newSuit = "QUEEN";
    }
    else if (rank == 13) {
      newSuit = "KING";
    }
    else {
      newSuit = "0";
    }
    
    return newSuit;
    
    }
  public String toString() {
    return (getRankName() + " of " + suit);
    
  }
}