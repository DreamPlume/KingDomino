package fr.KingDomino.panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

	
	private static final long serialVersionUID = 5273753584442290900L;
	
	
	public GamePanel() {
	}
	
	@Override
	public void paintComponent(Graphics g) {
		this.requestFocusInWindow();
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		
	}

}
