/*
 * Hand class to create a Hand object that consists of Card objects
 * 
 */

public class Hand {
	//	constants
	public static final int MAX_CARDS = 52;
	
	//	private variables
	private Card[] myCards;
	public int numCards;
	
	//	Constructor
	Hand(){
		// create a Hand of MAX_CARDS
		myCards = new Card[MAX_CARDS];
		
		//	reset hand by default
		resetHand();
		
	}
	
	//	methods
	
	public void resetHand(){
		
		// loop through up to MAX CARDS and null every value
		for(int x = 0 ; x < MAX_CARDS ; x++)
		{
			myCards[x] = null;
		}
		
		//reset numCards value
		numCards = 0;
		
	}
	
	public boolean takeCard(Card card){
		//	adds a Card to the Hand
		
		//	make sure that numCards does not exceed MAX_CARDS
		if(numCards < MAX_CARDS){
			myCards[numCards] = card;
			numCards++;
			return true;
		}
		
		return false;
	}

	public Card playCard()
	{
		//	to "play" a card it is removed from the hand
		Card playingCard = myCards[numCards - 1];
		myCards[numCards - 1] = null;
		numCards--;
		return playingCard;
		
	}

	public String toString(){
		//	display hand
		//	if hand is empty, then show empty  space, otherwise show hand
		
		if(numCards == 0)
		{
			return "My Hand:\n\t[     ]";
		}
		
		String myHand = myCards[0].toString();
		
		for(int x = 1; x < numCards ; x++)
		{
			myHand += ", " + myCards[x].toString();
		}
		
		myHand = new String("My Hand:\n\t" + myHand);
		return myHand;
		
	}
	
	public int getNumCards()
	{
		return numCards;
	}
	
	public Card inspectCard(int k)
	{
		//inspect cards to check for legal values
		
		if(k >= this.numCards || k < 0)
		{
			return new Card('Z',Card.Suit.spades);
		}
		else
		{	
			return new Card(this.myCards[k]);
		}
		

	}
	
	
}//	end class

