import java.util.Collections;
import java.util.Arrays;

public class Deck{
	public final int MAX_CARDS;
	private static Card[] masterPack;
	private Card[] cards;
	private int topCard;

	public Deck(int numPacks) {
		MAX_CARDS = 6*52;
		masterPack = new Card[52];
		topCard = 0;
		cards = new Card[52*numPacks];
		allocateMasterPack();
		init(numPacks);
	}

	public Deck() {
		//one pack
		this(1);
	}

	public void init(int numPacks){
		int counter = 0;
		for (Card card : cards) {
			if (counter >= 52)
				counter = 0;
			card = masterPack[counter];
			counter++;
		topCard = 52*numPacks-1;
		}
	}


	public void shuffle() {
		// shuffle cards
		Collections.shuffle(Arrays.asList(cards));
	}


	public Card dealCard() {
		//returns and removes the card in the top occupied position of cards[].
		Card card = cards[topCard];
		cards[topCard] = null;
		topCard--;
		return card.clone();
	}


	public Card inspectCard(int k) {
		// Accessor for an individual card.  Returns a card with errorFlag = true if k is bad.
		if (cards[k] == null)
			return new Card('M',Card.Suit.hearts);
		return cards[k].clone();
	}

	public int topCard() { return topCard; }

 
	public static void allocateMasterPack() {
		if (masterPack.length != 0)
			return;
		int counter = -1;
		for (Card.Suit s : Card.Suit.values())
			for (char v : Card.cardValues) {
				masterPack[counter++] = new Card(v,s);
			}
	}


}