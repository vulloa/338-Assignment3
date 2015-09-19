/*
 * Card class used to create an object "card" which has a number and a suit
 * 
 */

public class Card 
{
	//	enum for card suit
	public enum Suit { clubs, diamonds, hearts, spades};
	
	//	array of values
	public static char[] cardValues = {'2','3','4','5','6','7','8','9','T','J','Q','K','A'};
	
	//	variables
	private char value;
	private Suit suit;
	private boolean errorFlag;
	
	//	constructors
	Card(char value, Suit suit)
	{
		//	set user values
		this.set(value,suit);		
	}
	
	Card()
	{
		//	default value if no values are entered
		set('A', Suit.spades);
	}	
	
	//	methods
	 public String toString()
	{
		 String card = "";
		 
		if(getErrorFlag() == false)
			card = getValue() + " of " + getSuit();
		else
			card = "** illegal card entry **";
		
		return card;
		
	}
	 
	 public boolean set(char value, Suit suit)
	 {
		 //	sets the suit and value of the 'card'
		 //	take value and make upper case for comparison against array
		 char uValue = Character.toUpperCase(value);
		 
		 if(isValid(uValue) == true)
		 {
			 errorFlag = false;
			 this.value = uValue;
			 this.suit = suit;
		 }
		 else
			 errorFlag = true;
		 
		 return errorFlag;
	 
	 }
	 
	 public Suit getSuit()
	 {
		 return suit;
	 }
	 
	 public char getValue()
	 {
		 return value;
	 }
	 
	 public boolean getErrorFlag()
	 {
		 return errorFlag;
	 }
	 
//	 public boolean equals(Card card)
//	 {
		 
//	 }
	
	 private boolean isValid(char value1)
	 {
		 //	checks for valid entries to set to the Card
		 char uValue = Character.toUpperCase(value1);
		 
		 for(char x : cardValues)
		 {
			 if(uValue == x)
			 {
				 return true;
			 }
		 }
		 //	if the loop ends without a return true then it is false
		 return false;
		 
	 }//	end isValid()
	 
}
