package fr.KingDomino.panel;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import fr.KingDomino.bouton.BoutonMenu;
import fr.KingDomino.main.Frame;


public class GameMenu extends JPanel{
		
	private static final long serialVersionUID = 8864408833606515468L;

	public GameMenu(Frame fenetre) {
				
		this.setBackground(Color.GREEN);
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(0, 10, 0, 10);
		
		BoutonMenu playBtn = new BoutonMenu("Play", 200 , 100, 30);
		BoutonMenu quitBtn = new BoutonMenu("Quit", 200 , 100, 30);
		
		
		playBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fenetre.nextCl();
				fenetre.getThGame().start();
			}
		});
		
		quitBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		this.add(playBtn, gbc);
		this.add(quitBtn, gbc);
		
	}	

}
