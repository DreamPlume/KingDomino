package fr.KingDomino.bouton;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;

public class BoutonMenu extends JButton{

	
	public BoutonMenu(String pfName, int pfH, int pfW, int pfRadius) {
		this.setText(pfName);
		this.setBackground(Color.red);
		
		this.setPreferredSize(new Dimension(pfH, pfW));
		this.setFocusPainted(false);
		
	}
	
	
}
