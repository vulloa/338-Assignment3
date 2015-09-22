/*
 * [   NAMES HERE   ]
 * CST 338 - Module 3
 * Deck of Cards Program:
 *       Card class
 *       Hand class
 *       Deck class
 * 
 */

import java.io.*;
import java.util.*;
import java.lang.*;

public class Assignment3 {

   public static void main(String[] args)  {
      // main function
      
      //   testing Card class
      Card card1 = new Card();
      Card card2 = new Card('2',Card.Suit.hearts);
      Card card3 = new Card('T',Card.Suit.spades);
      Card card4 = new Card('L',Card.Suit.clubs);
            
      System.out.println("Card Class Test:");
      System.out.println(card1.toString());
      System.out.println(card2.toString());
      System.out.println(card3.toString());
      System.out.println(card4.toString());
      
      Hand newHand = new Hand();
      System.out.println("Hand Class Test:");
      System.out.println(newHand.toString());
      newHand.takeCard(card1);
      System.out.println(newHand.toString());
      newHand.takeCard(card2);
      System.out.println(newHand.toString());
      newHand.takeCard(card3);
      System.out.println(newHand.toString());

   }

}
