import java.util.Random;
import java.util.ArrayList;
public class Actions
{
		static void drawCard(DeckOfCards deck, ArrayList<DeckOfCards.Cards> player)
	{
		if(deck.cards.size() == 0)
		{
			System.out.println("There are no more cards in the deck!");
			return;
		}

		Random rand = new Random(System.currentTimeMillis());
		int num;
		num= rand.nextInt(deck.cards.size());
		player.add(deck.cards.get(num));
		deck.cards.remove(num);
	}

	static void initialDeal(DeckOfCards deck, ArrayList<DeckOfCards.Cards> playerCards, ArrayList<DeckOfCards.Cards> dealerCards)
	{
		drawCard(deck, playerCards);
		drawCard(deck, dealerCards);
		drawCard(deck, playerCards);
		drawCard(deck, dealerCards);

	}

	static int getTotal(ArrayList<DeckOfCards.Cards> arr)
	{
		int total=0;
		boolean isAce=false;

		for(int i = 0; i < arr.size(); ++i)
		{
			if(arr.get(i).getValue() == 1)
			{
				isAce= true;
			}
			total += arr.get(i).getValue();
		}
		
		if(((total + 10) < 22) && isAce == true)
		{
			total+=10;
		}
		return total;
	}

	static void showDealersTopCard(ArrayList<DeckOfCards.Cards> arr)
	{
		System.out.println("Dealer is showing the " + arr.get(1).getName());
	}
	static void showPlayersHand(ArrayList<DeckOfCards.Cards> arr)
	{
		System.out.println("Your cards:");
		for(int i=0; i< arr.size(); ++i)
		{
			System.out.println(arr.get(i).getName());
		}
		System.out.println("Your total is: " + getTotal(arr));
	}

	static void showDealersHand(ArrayList<DeckOfCards.Cards> arr)
	{
		System.out.println("The dealers cards:");
		for(int i=0; i< arr.size(); ++i)
		{
			System.out.println(arr.get(i).getName());
		}
		System.out.println("The dealers total is: " + getTotal(arr));
	}

	static void dealersTurn(DeckOfCards deck, ArrayList<DeckOfCards.Cards> arr, ArrayList<DeckOfCards.Cards> player)
	{
		boolean stopDrawing= false;
		if((getTotal(arr) > getTotal(player)) && getTotal(arr) >=17)
		{
			return;
		}
		if(getTotal(arr)>= 17)
		{
			return;
		}
		while(stopDrawing == false)
		{
			drawCard(deck, arr);
			if(getTotal(arr)>= 17)
			{
				stopDrawing = true;	
			}
		}
	}
}