package weekFiveLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardGame{

	public static void main(String[] args) {
		// 1.
		System.out.println("\nQuestion 1: Card Class");
		Card newCard =new Card("Two", "Clubs", 2);
		// Call the describe method
		newCard.describe();
		
		// 2.
		System.out.println("\nQuestion 2: Deck Class");
		Deck deck = new Deck();
		// Call the describe method
		deck.describe();
		
		// 3.
		System.out.println("\nQuestion 3: Deck shuffle() method");
		deck.shuffle();
		System.out.println("-------------");
		// Call the describe method on the newly shuffled deck
		deck.describe();
		
		// 4.
		System.out.println("\nQuestion 4: Deck draw() method");
		deck.draw();
		System.out.println("-------------");
		deck.describe();
		
		System.out.println("\nQuestion 5: Create Game");
		System.out.println("-------------");
		int playerCount = 4;
		Map<String, List<Card>> gameBoard = dealCards(playerCount);
		
		// Show the player hands
		for (int i = 1; i <= playerCount; i++) {
			String player = "Player " + i;
			System.out.println(player);
			System.out.println("-------------");
			List<Card> playerHand = gameBoard.get(player);
			for (Card cardInHand : playerHand) {
				cardInHand.describe();
			}
			System.out.println();
		}
	}
	
	// Method 5 creation
	// Create method. Type: Private static. DataType: Map<String, List<Card>>. Input: int playerCount.
	private static Map<String, List<Card>> dealCards(int playerCount) {
		Map<String, List<Card>> cardGame = new HashMap<>();
		Deck deck = new Deck();
		deck.shuffle();
		for (int i = 1; i <= playerCount; i++) {
			String player = "Player " + i;
			List<Card> playerHand = new ArrayList<>();
			cardGame.put(player, playerHand);
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 1; j <= playerCount; j++) {
				String player = "Player " + j;
				cardGame.get(player).add(deck.draw());
			}
		}
		return cardGame;
	}
}
