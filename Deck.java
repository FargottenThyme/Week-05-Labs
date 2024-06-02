package weekFiveLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	//private Card topCard = new Card(this.cards.get(0).getName(), this.cards.get(0).getSuit(), this.cards.get(0).getValue());

	
	public Deck() {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", 
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			int cardNum = 2;
			for (String name : names) {
				cards.add(new Card(name, suit, cardNum));
				cardNum ++;
			}
		}
	}
	public void describe() {
		for (Card card : this.cards) {
			card.describe();
		}
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card topCard = this.cards.remove(0);
		return topCard;
	}
}
	

