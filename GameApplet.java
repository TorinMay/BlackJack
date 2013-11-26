import java.awt.*;
import java.applet.*;

import java.awt.event.*;
import javax.swing.*;

public class GameApplet extends Applet implements ActionListener {
	private JPanel backGround;
	private JButton hit, stay, newGame, raise;
	private JLabel playerCards, dealerCards;
	private int value = 0;


	public void init() {
		playerCards = new JLabel("Player Cards:");

		String title = "Hit";
		hit = new JButton(title);
		hit.setActionCommand(title);
		hit.addActionListener(this);
		this.add(hit);

		title = "Stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		title = "New Game";
		newGame = new JButton(title);
		newGame.setActionCommand(title);
		newGame.addActionListener(this);
		this.add(newGame);

		title = "Raise";
		raise = new JButton(title);
		raise.setActionCommand(title);
		raise.addActionListener(this);
		this.add(raise);
	}

	public void actionPerformed(ActionEvent ae) {

	}


}