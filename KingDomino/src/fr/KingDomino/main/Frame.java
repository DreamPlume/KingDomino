package fr.KingDomino.main;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.KingDomino.panel.GameEnd;
import fr.KingDomino.panel.GameMenu;
import fr.KingDomino.panel.GamePanel;
import fr.KingDomino.service.ThreadGame;


public class Frame extends JFrame{

	private static final long serialVersionUID = 3269482030395735676L;
	private final static String MENU = "GameMenu";
	private final static String GAME = "GamePanel";
	private final static String END = "GameEnd";

	public final static int HEIGHT = 750;
	public final static int WIDTH = 1200;
	private CardLayout cl;
	private JPanel cards;
	
	private GameMenu gameM;
	private GamePanel gameP;
	private GameEnd gameE;
	private ThreadGame thGame;
	
	public Frame(String pfStr) {

		this.setTitle(pfStr);
		this.setSize(WIDTH, HEIGHT);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		
		this.gameM = new GameMenu(this);
		this.gameP = new GamePanel();
		this.thGame = new ThreadGame(gameP);
		this.gameE = new GameEnd();
		
		//thGame = new ThreadGame(gameP);


		this.cl = new CardLayout();
		this.cards = new JPanel(this.cl);
		cards.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.cards.add(MENU, this.gameM);
		this.cards.add(GAME, this.gameP);
		this.cards.add(END, this.gameE);
		
		JPanel boutonPan = new JPanel();
		JButton button = new JButton("NEXT");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.next(cards);
			}
		});
		boutonPan.add(button);
		
		
		//this.getContentPane().add(boutonPan, BorderLayout.NORTH);
		this.getContentPane().add(cards , BorderLayout.CENTER);
		this.setVisible(true);
	}

	public ThreadGame getThGame() {
		return thGame;
	}

	public void nextCl() {
		this.cl.next(cards);
	}
	
}
