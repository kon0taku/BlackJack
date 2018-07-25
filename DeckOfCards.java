import java.util.ArrayList;
public class DeckOfCards
{
	ArrayList<Cards> cards = new ArrayList<Cards>();

	public DeckOfCards()
	{
		newDeck();
	}

	public void newDeck()
	{
		cards.clear();
		Cards aceOfSpades = new Cards("Ace Of Spades", 1, true);
		cards.add(aceOfSpades);
		Cards twoOfSpades = new Cards("Two Of Spades", 2, true);
		cards.add(twoOfSpades);
		Cards threeOfSpades = new Cards("Three Of Spades", 3, true);
		cards.add(threeOfSpades);
		Cards fourOfSpades = new Cards("Four Of Spades", 4, true);
		cards.add(fourOfSpades);
		Cards fiveOfSpades = new Cards("Five Of Spades", 5, true);
		cards.add(fiveOfSpades);
		Cards sixOfSpades = new Cards("Six Of Spades", 6, true);
		cards.add(sixOfSpades);
		Cards sevenOfSpades = new Cards("Seven Of Spades", 7, true);
		cards.add(sevenOfSpades);
		Cards eightOfSpades = new Cards("Eight Of Spades", 8, true);
		cards.add(eightOfSpades);
		Cards nineOfSpades = new Cards("Nine Of Spades", 9, true);
		cards.add(nineOfSpades);
		Cards tenOfSpades = new Cards("Ten Of Spades", 10, true);
		cards.add(tenOfSpades);
		Cards jackOfSpades = new Cards("Jack Of Spades", 10, true);
		cards.add(jackOfSpades);
		Cards queenOfSpades = new Cards("Queen Of Spades", 10, true);
		cards.add(queenOfSpades);
		Cards kingOfSpades = new Cards("King Of Spades", 10, true);
		cards.add(kingOfSpades);
		Cards aceOfHearts = new Cards("Ace Of Hearts", 1, true);
		cards.add(aceOfHearts);
		Cards twoOfHearts = new Cards("Two Of Hearts", 2, true);
		cards.add(twoOfHearts);
		Cards threeOfHearts = new Cards("Three Of Hearts", 3, true);
		cards.add(threeOfHearts);
		Cards fourOfHearts = new Cards("Four Of Hearts", 4, true);
		cards.add(fourOfHearts);
		Cards fiveOfHearts = new Cards("Five Of Hearts", 5, true);
		cards.add(fiveOfHearts);
		Cards sixOfHearts = new Cards("Six Of Hearts", 6, true);
		cards.add(sixOfHearts);
		Cards sevenOfHearts = new Cards("Seven Of Hearts", 7, true);
		cards.add(sevenOfHearts);
		Cards eightOfHearts = new Cards("Eight Of Hearts", 8, true);
		cards.add(eightOfHearts);
		Cards nineOfHearts = new Cards("Nine Of Hearts", 9, true);
		cards.add(nineOfHearts);
		Cards tenOfHearts = new Cards("Ten Of Hearts", 10, true);
		cards.add(tenOfHearts);
		Cards jackOfHearts = new Cards("Jack Of Hearts", 10, true);
		cards.add(jackOfHearts);
		Cards queenOfHearts = new Cards("Queen Of Hearts", 10, true);
		cards.add(queenOfHearts);
		Cards kingOfHearts = new Cards("King Of Hearts", 10, true);
		cards.add(kingOfHearts);
		Cards aceOfClubs = new Cards("Ace Of Clubs", 1, true);
		cards.add(aceOfClubs);
		Cards twoOfClubs = new Cards("Two Of Clubs", 2, true);
		cards.add(twoOfClubs);
		Cards threeOfClubs = new Cards("Three Of Clubs", 3, true);
		cards.add(threeOfClubs);
		Cards fourOfClubs = new Cards("Four Of Clubs", 4, true);
		cards.add(fourOfClubs);
		Cards fiveOfClubs = new Cards("Five Of Clubs", 5, true);
		cards.add(fiveOfClubs);
		Cards sixOfClubs = new Cards("Six Of Clubs", 6, true);
		cards.add(sixOfClubs);
		Cards sevenOfClubs = new Cards("Seven Of Clubs", 7, true);
		cards.add(sevenOfClubs);
		Cards eightOfClubs = new Cards("Eight Of Clubs", 8, true);
		cards.add(eightOfClubs);
		Cards nineOfClubs = new Cards("Nine Of Clubs", 9, true);
		cards.add(nineOfClubs);
		Cards tenOfClubs = new Cards("Ten Of Clubs", 10, true);
		cards.add(tenOfClubs);
		Cards jackOfClubs = new Cards("Jack Of Clubs", 10, true);
		cards.add(jackOfClubs);
		Cards queenOfClubs = new Cards("Queen Of Clubs", 10, true);
		cards.add(queenOfClubs);
		Cards kingOfClubs = new Cards("King Of Clubs", 10, true);
		cards.add(kingOfClubs);
		Cards aceOfDiamonds = new Cards("Ace Of Diamonds", 1, true);
		cards.add(aceOfDiamonds);
		Cards twoOfDiamonds = new Cards("Two Of Diamonds", 2, true);
		cards.add(twoOfDiamonds);
		Cards threeOfDiamonds = new Cards("Three Of Diamonds", 3, true);
		cards.add(threeOfDiamonds);
		Cards fourOfDiamonds = new Cards("Four Of Diamonds", 4, true);
		cards.add(fourOfDiamonds);
		Cards fiveOfDiamonds = new Cards("Five Of Diamonds", 5, true);
		cards.add(fiveOfDiamonds);
		Cards sixOfDiamonds = new Cards("Six Of Diamonds", 6, true);
		cards.add(sixOfDiamonds);
		Cards sevenOfDiamonds = new Cards("Seven Of Diamonds", 7, true);
		cards.add(sevenOfDiamonds);
		Cards eightOfDiamonds = new Cards("Eight Of Diamonds", 8, true);
		cards.add(eightOfDiamonds);
		Cards nineOfDiamonds = new Cards("Nine Of Diamonds", 9, true);
		cards.add(nineOfDiamonds);
		Cards tenOfDiamonds = new Cards("Ten Of Diamonds", 10, true);
		cards.add(tenOfDiamonds);
		Cards jackOfDiamonds = new Cards("Jack Of Diamonds", 10, true);
		cards.add(jackOfDiamonds);
		Cards queenOfDiamonds = new Cards("Queen Of Diamonds", 10, true);
		cards.add(queenOfDiamonds);
		Cards kingOfDiamonds = new Cards("King Of Diamonds", 10, true);
		cards.add(kingOfDiamonds);
	}

	public class Cards
	{
		private String name;
		private int value;
		private boolean active;

		public Cards(String n, int v, boolean a)
		{
			name = n;
			value = v;
			active = a;
		}
		public Cards()
		{
			name = "";
			value = 0;
			active = false;
		}
		public String getName()
		{
			return name;
		}
		public int getValue()
		{
			return value;
		}
		public boolean getActiveStatus()
		{
			return active;
		}
	}
}