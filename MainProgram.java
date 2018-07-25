
import java.util.Scanner;
import java.util.ArrayList;
public class MainProgram
{
	public static void main(String[] args)
	{
		ArrayList<DeckOfCards.Cards> dealerCards = new ArrayList<DeckOfCards.Cards>();
		ArrayList<DeckOfCards.Cards> playerCards = new ArrayList<DeckOfCards.Cards>();
		DeckOfCards deck = new DeckOfCards();
		Actions action = new Actions();
		Scanner playerAction = new Scanner(System.in);
		Scanner continueInput = new Scanner(System.in);
		boolean continueGame= true;

		do
		{

			action.initialDeal(deck, playerCards, dealerCards);
			action.showPlayersHand(playerCards);
			action.showDealersTopCard(dealerCards);

			String hitOrStay;
			boolean endTurn= false;
			boolean playerLost= false;

			if(deck.cards.size() < 25)
			{
				deck.newDeck();
			}

			if(action.getTotal(playerCards) == 21)
			{
				endTurn= true;
			}

			while(endTurn == false)
			{
				System.out.print("Hit or Stay? ");
				hitOrStay = playerAction.next();

				if(hitOrStay.equals("Hit") || hitOrStay.equals("hit"))
				{
					action.drawCard(deck, playerCards);
					if(action.getTotal(playerCards) > 21)
					{
						playerLost= true;
						action.showPlayersHand(playerCards);
						break;
					}
					action.showPlayersHand(playerCards);
				}else if(hitOrStay.equals("Stay") || hitOrStay.equals("stay"))
				{
					endTurn= true;
					action.dealersTurn(deck, dealerCards, playerCards);
				}else{
					System.out.println("I'm sorry, please either Hit or Stay.");
				}
			}

			int dealerScore, playerScore;

			dealerScore= action.getTotal(dealerCards);
			playerScore= action.getTotal(playerCards);

			if(playerLost == false)
			{
				action.showDealersHand(dealerCards);
				System.out.println();
				if(dealerScore > 21){
					System.out.println("The dealer busted. You win!");
				}else if(dealerScore <= 21){
					if(dealerScore > playerScore){
						System.out.println("The dealer wins!");
					}else if(dealerScore == playerScore){
						System.out.println("Push!");
					}else{
						System.out.println("You win!");
					}
				}
			}else{
				System.out.println("You busted. You lose!");
			}
			System.out.print("Continue?");
			String continueInptText;
			continueInptText = continueInput.nextLine();

			if(continueInptText.equals("yes") || continueInptText.equals("Yes") || continueInptText.equals("y"))
			{
			}else if(continueInptText.equals("no") || continueInptText.equals("No") || continueInptText.equals("n")){
				continueGame = false;
			}else{
				System.out.print("Please indicate if you would like to continue: ");
				continueInptText = continueInput.nextLine();
			}

			dealerCards.clear();
			playerCards.clear();

		} while(continueGame == true);

	}
}