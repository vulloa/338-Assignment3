/*
 * [   NAMES HERE   ]
 * CST 338 - Module 3
 * Deck of Cards Program:
 *       Card class
 *       Hand class
 *       Deck class
 * 
 */

//import java.io.*;
//import java.util.*;
//import java.lang.*;

public class Assignment3 {

   public static void main(String[] args)  {
      // main function - driver
      
      //   objects for testing
      Card card1 = new Card();
      Card card2 = new Card('T',Card.Suit.hearts);
      Card card3 = new Card('Q',Card.Suit.diamonds);
      Card card4 = new Card('A',Card.Suit.clubs);
      Card card5 = new Card('X', Card.Suit.hearts);	//illegal card
      
      System.out.println("\nCard Class Test:\n");
      System.out.println("\t" + card1.toString());
      System.out.println("\t" + card2.toString());
      System.out.println("\t" + card5.toString());
      
      System.out.println("\n");
      
      System.out.println("\t" + card5.toString());
      System.out.println("\t" + card4.toString());
      System.out.println("\t" + card3.toString());
      
      /*
       * **********************************************************************************
       */
      
      System.out.println("\n\nHand Class Test:");
      
      //loop with takeCard method
      //will fill with the same values all around
      
      //	fill the hand with cards by "taking" them
      Hand newHand = new Hand();
      
      newHand.takeCard(card1);
      newHand.takeCard(card2);
      newHand.takeCard(card3);
      newHand.takeCard(card4);
      
      /*	fill the rest of the hand (MAX_CARDS)
       *	takeCard() returns a true or false value based on the numCards location versus
       * 	the MAX_CARDS value. If the value is true then it keeps adding either card1 to card4 to the Hand
       * 	else it exits the loop because the max value has been reached 
       */
      
      while(true)
      {
          if(!newHand.takeCard(card1))
        	  break;
          if(!newHand.takeCard(card2))
        	  break;
          if(!newHand.takeCard(card3))
        	  break;
          if(!newHand.takeCard(card4))
        	  break;
      }
      
      System.out.println("\n\tHand full\n");	//	the loop above has completed
      
      System.out.println("\tAfter deal\n");
      
      //card inspection
      System.out.println("\n\tTesting inspectCard()");
      
      //inspect 2 cards
      System.out.println("\n\t\t" + newHand.inspectCard(0));
      System.out.println("\t\t" + newHand.inspectCard(1));
      System.out.println("\t\t" + newHand.inspectCard(2));
      System.out.println("\t\t" + newHand.inspectCard(3));
      System.out.println("\t\t" + newHand.inspectCard(4));
      System.out.println("\t\t" + newHand.inspectCard(5));
      
      //prints the "hand"
      System.out.println("\n\t" + newHand.toString() + "\n");
      
      //prints each card on a new line
      for(int x = 0 ; x < Hand.MAX_CARDS ; x++)
      {
    	  Card playedCard = newHand.playCard();
    	  System.out.println("\t" + playedCard.toString());
      }
      
      //empty hand
      System.out.println("\n\tHand after playing all cards:\n\t" + newHand.toString());
      System.out.println();
      
      /*
       * **********************************************************************************
       */
      
      System.out.println("\n\nDeck Class Test:");
      // two packs of cards
      // double deal
      // unshuffled
      // shuffled (single pack deck)
      
      Deck deckOne = new Deck(2);
      
      System.out.println("\n\t2-Pack, Unshuffled:");
      System.out.print("\t\t");
      while(deckOne.topCard() > 0)
      {
    	  System.out.print(deckOne.dealCard().toString() + " / ");
      }
      System.out.println();
      
      deckOne.init(2);
      deckOne.shuffle();

      System.out.println("\n\t2-Pack, Shuffled:");
      System.out.print("\t\t");
      while(deckOne.topCard() > 0)
      {
        System.out.print(deckOne.dealCard() + " / ");
      }


      deckOne.init(1);
      System.out.println("\n\t1-Pack, Unshuffled:");
      System.out.print("\t\t");
      while(deckOne.topCard() > 0)
      {
        System.out.print(deckOne.dealCard().toString() + " / ");
      }
      

      deckOne.init(1);
      deckOne.shuffle();
      System.out.println("\n\t1-Pack, Shuffled:");
      System.out.print("\t\t");
      while(deckOne.topCard() > 0)
      {
        System.out.print(deckOne.dealCard() + " / ");
      }
      
      /*
       * **********************************************************************************
       */
      
      
   }//	end main

}//	end class

