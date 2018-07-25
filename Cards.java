import java.util.ArrayList;

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

	public ArrayList<Cards> getFullDeck()
	{
		ArrayList<Cards> cArr = new ArrayList<Cards>();
		
		Cards aceOfSpades = new Cards("Ace Of Spades", 1, true);
		cArr.add(aceOfSpades);
		Cards twoOfSpades = new Cards("Two Of Spades", 2, true);
		cArr.add(twoOfSpades);
		Cards threeOfSpades = new Cards("Three Of Spades", 3, true);
		cArr.add(threeOfSpades);
		Cards fourOfSpades = new Cards("Four Of Spades", 4, true);
		cArr.add(fourOfSpades);
		Cards fiveOfSpades = new Cards("Five Of Spades", 5, true);
		cArr.add(fiveOfSpades);
		Cards sixOfSpades = new Cards("Six Of Spades", 6, true);
		cArr.add(sixOfSpades);
		Cards sevenOfSpades = new Cards("Seven Of Spades", 7, true);
		cArr.add(sevenOfSpades);
		Cards eightOfSpades = new Cards("Eight Of Spades", 8, true);
		cArr.add(eightOfSpades);
		Cards nineOfSpades = new Cards("Nine Of Spades", 9, true);
		cArr.add(nineOfSpades);
		Cards tenOfSpades = new Cards("Ten Of Spades", 10, true);
		cArr.add(tenOfSpades);
		Cards jackOfSpades = new Cards("Jack Of Spades", 10, true);
		cArr.add(jackOfSpades);
		Cards queenOfSpades = new Cards("Queen Of Spades", 10, true);
		cArr.add(queenOfSpades);
		Cards kingOfSpades = new Cards("King Of Spades", 10, true);
		cArr.add(kingOfSpades);
		Cards aceOfHearts = new Cards("Ace Of Hearts", 1, true);
		cArr.add(aceOfHearts);
		Cards twoOfHearts = new Cards("Two Of Hearts", 2, true);
		cArr.add(twoOfHearts);
		Cards threeOfHearts = new Cards("Three Of Hearts", 3, true);
		cArr.add(threeOfHearts);
		Cards fourOfHearts = new Cards("Four Of Hearts", 4, true);
		cArr.add(fourOfHearts);
		Cards fiveOfHearts = new Cards("Five Of Hearts", 5, true);
		cArr.add(fiveOfHearts);
		Cards sixOfHearts = new Cards("Six Of Hearts", 6, true);
		cArr.add(sixOfHearts);
		Cards sevenOfHearts = new Cards("Seven Of Hearts", 7, true);
		cArr.add(sevenOfHearts);
		Cards eightOfHearts = new Cards("Eight Of Hearts", 8, true);
		cArr.add(eightOfHearts);
		Cards nineOfHearts = new Cards("Nine Of Hearts", 9, true);
		cArr.add(nineOfHearts);
		Cards tenOfHearts = new Cards("Ten Of Hearts", 10, true);
		cArr.add(tenOfHearts);
		Cards jackOfHearts = new Cards("Jack Of Hearts", 10, true);
		cArr.add(jackOfHearts);
		Cards queenOfHearts = new Cards("Queen Of Hearts", 10, true);
		cArr.add(queenOfHearts);
		Cards kingOfHearts = new Cards("King Of Hearts", 10, true);
		cArr.add(kingOfHearts);
		Cards aceOfClubs = new Cards("Ace Of Clubs", 1, true);
		cArr.add(aceOfClubs);
		Cards twoOfClubs = new Cards("Two Of Clubs", 2, true);
		cArr.add(twoOfClubs);
		Cards threeOfClubs = new Cards("Three Of Clubs", 3, true);
		cArr.add(threeOfClubs);
		Cards fourOfClubs = new Cards("Four Of Clubs", 4, true);
		cArr.add(fourOfClubs);
		Cards fiveOfClubs = new Cards("Five Of Clubs", 5, true);
		cArr.add(fiveOfClubs);
		Cards sixOfClubs = new Cards("Six Of Clubs", 6, true);
		cArr.add(sixOfClubs);
		Cards sevenOfClubs = new Cards("Seven Of Clubs", 7, true);
		cArr.add(sevenOfClubs);
		Cards eightOfClubs = new Cards("Eight Of Clubs", 8, true);
		cArr.add(eightOfClubs);
		Cards nineOfClubs = new Cards("Nine Of Clubs", 9, true);
		cArr.add(nineOfClubs);
		Cards tenOfClubs = new Cards("Ten Of Clubs", 10, true);
		cArr.add(tenOfClubs);
		Cards jackOfClubs = new Cards("Jack Of Clubs", 10, true);
		cArr.add(jackOfClubs);
		Cards queenOfClubs = new Cards("Queen Of Clubs", 10, true);
		cArr.add(queenOfClubs);
		Cards kingOfClubs = new Cards("King Of Clubs", 10, true);
		cArr.add(kingOfClubs);
		Cards aceOfDiamonds = new Cards("Ace Of Diamonds", 1, true);
		cArr.add(aceOfDiamonds);
		Cards twoOfDiamonds = new Cards("Two Of Diamonds", 2, true);
		cArr.add(twoOfDiamonds);
		Cards threeOfDiamonds = new Cards("Three Of Diamonds", 3, true);
		cArr.add(threeOfDiamonds);
		Cards fourOfDiamonds = new Cards("Four Of Diamonds", 4, true);
		cArr.add(fourOfDiamonds);
		Cards fiveOfDiamonds = new Cards("Five Of Diamonds", 5, true);
		cArr.add(fiveOfDiamonds);
		Cards sixOfDiamonds = new Cards("Six Of Diamonds", 6, true);
		cArr.add(sixOfDiamonds);
		Cards sevenOfDiamonds = new Cards("Seven Of Diamonds", 7, true);
		cArr.add(sevenOfDiamonds);
		Cards eightOfDiamonds = new Cards("Eight Of Diamonds", 8, true);
		cArr.add(eightOfDiamonds);
		Cards nineOfDiamonds = new Cards("Nine Of Diamonds", 9, true);
		cArr.add(nineOfDiamonds);
		Cards tenOfDiamonds = new Cards("Ten Of Diamonds", 10, true);
		cArr.add(tenOfDiamonds);
		Cards jackOfDiamonds = new Cards("Jack Of Diamonds", 10, true);
		cArr.add(jackOfDiamonds);
		Cards queenOfDiamonds = new Cards("Queen Of Diamonds", 10, true);
		cArr.add(queenOfDiamonds);
		Cards kingOfDiamonds = new Cards("King Of Diamonds", 10, true);
		cArr.add(kingOfDiamonds);

		return cArr;
	}
}