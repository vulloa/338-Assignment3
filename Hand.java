import java.util.Arrays;
import java.util.Random;

/*
 * Hand class to create a Hand object that consists of Card objects
 * 
 */

public class Hand 
{
	//	constants
	public final int MAX_CARDS = 50;
	
	//	private variables
	private Card[] myCards;
	private int numCards = 3;
	
	//	Constructor
	Hand()
	{
		// create a Hand of MAX_CARDS
		myCards = new Card[MAX_CARDS];
		
		//	only fill the first x amount of spots
		myCards[0] = new Card('2',Card.Suit.hearts);
		myCards[1] = new Card('3',Card.Suit.hearts);
		myCards[2] = new Card('4',Card.Suit.hearts);
		
	}
	
	//	methods
	
	public void resetHand()
	{
		
	}
	
	public boolean takeCard(Card card)
	{
		//	adds a Card to the Hand
		
		//	make sure that numCards does not exceed MAX_CARDS
		if(numCards <= MAX_CARDS)
		{
			myCards[numCards++] = card;
			return true;
		}
		
		return false;
	}
/*
	public Card playCard()
	{
		//	removes a Card from the Hand
		
		//	check to make sure the Hand is not 0
				
		if(numCards > 0)
		{
			
			myCards[numCards] = null;
			numCards--;
		}
	}
*/		

	public String toString()
	{
		//	display hand
		String myHand = "My Hand:\n\t" + Arrays.toString(myCards);
		return myHand;
	}
/*	
	private int getNumCards()
	{
		return numCards;
	}
	
	public Card inspectCard(int k)
	{
		//	accessor for individual card
	}
	*/
}
