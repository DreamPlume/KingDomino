package fr.KingDomino.panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	
	private static final long serialVersionUID = 5273753584442290900L;
	
	private JoueurPanel joueur1;
	private JoueurPanel joueur2;
	
	public GamePanel() {
		this.joueur1 = new JoueurPanel();
		this.joueur2 = new JoueurPanel();
		
		this.setLayout(new GridLayout(1, 2));
		
		this.add(joueur1);
		this.add(joueur2);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		this.requestFocusInWindow();
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		
	}

}
