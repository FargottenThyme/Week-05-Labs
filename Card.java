package weekFiveLab;

public class Card {
	
	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}

	public void describe() {
		System.out.println("Card: " + this.name + " of " + this.suit + ". Value: " + this.value);
	}
	
	public boolean checkLength(String str, int len) {
		return str.length() > len;
	}
	
	public void setName(String name) {
		if (checkLength(name, 1)) {
			this.name = name;
		}
	}

	public String getName() {
		return name;
	}
	
	public void setSuit(String suit) {
		if (checkLength(suit, 1)) {
			this.suit = suit;
		}
	}
	
	public String getSuit() {
		return suit;
	}
	
	public void setValue(int value) {
		if (value > 1 && value <= 14) {
			this.value = value;
		}
	}
	
	public int getValue() {
		return value;
	}

}
