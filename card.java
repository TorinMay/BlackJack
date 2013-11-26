import java.util.Random;
import java.util.Arrays;

class card {

	public String value;
	public String suit;
	private String suits[];
	private String values[];

	public card(int suit, int value) {
		suits = new String[]{"Diamonds", "Hearts","Spades","Clubs"};
		values = new String[]{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

		this.suit = suits[suit];
		this.value = values[value];
	}


}