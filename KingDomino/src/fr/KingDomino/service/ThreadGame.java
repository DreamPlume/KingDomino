package fr.KingDomino.service;

import javax.swing.JPanel;

public class ThreadGame extends Thread{

	private JPanel panel;
	public ThreadGame(JPanel pfPanel) {
		this.panel = pfPanel;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				super.run();
				sleep(1);
				this.panel.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
