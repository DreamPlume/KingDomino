package fr.KingDomino.panel;

import java.awt.Color;
import javax.swing.JPanel;

import fr.KingDomino.piece.Domino;
import fr.KingDomino.service.Mouvement;

public class JoueurPanel extends JPanel{

	public JoueurPanel() {
		
		this.setLayout(null);
		
		int r = (int) (Math.random()*255);
		int v = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		
		this.setBackground(new Color(r, v, b));
		
		for(int i = 0 ; i < 5 ; i++) {
			this.add(new Domino(i+1));
		}
		
		Mouvement mov = new Mouvement(this.getComponents());
		
		
	}
	
}
