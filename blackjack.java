import java.awt.*;
import java.applet.*;

public class blackjack extends Applet{
	
	public static void main(String[] args) {
		deck myDeck = new deck();
		myDeck.shuffle(myDeck);
	}

	public void init() {

	}

	public void paint(Graphics g) {
		// g.cardImages();
	}
}