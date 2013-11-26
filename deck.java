import java.util.Random;
import java.util.Arrays;

public class deck {
	public int myDeck[];

	public deck(){
	myDeck = new int[52];
		int c = 0;
		for (int v = 0; v < 13; v++) {
			for (int s = 0; s < 4; s++) {
				myDeck[c] = new [s,v];
				System.out.println(myDeck[c].value + " of " + myDeck[c].suit);
				c++;
			}
		}
	}

	public void shuffle(int[] myDeck) {
    	Random r = new Random();
    	
    	for (int i = myDeck.length - 1; i > 0; i--) {
      	
      		int index = r.nextInt(i + 1);
      		int temp = myDeck[index];
      		myDeck[index] = myDeck[i];
      		myDeck[i] = temp;
    	}
  	}

  	public void getDeck(int[] myDeck) {
  		this.myDeck = myDeck;
  	}

  	public int[] setdeck() {
  		return myDeck();
  	}
}