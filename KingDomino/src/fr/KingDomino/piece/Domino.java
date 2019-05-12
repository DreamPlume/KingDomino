package fr.KingDomino.piece;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import fr.KingDomino.main.Frame;

public class Domino extends Piece{

	private int numero;
	private Color couleur;
	
	public Domino(int pfNumero) {
		super(45,90);
		
		this.numero = pfNumero;
		
		int r = (int) (Math.random()*255);
		int v = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		
		int x = (int) (Math.random()*(Frame.WIDTH/2)-super.getLargeur());
		int y = (int) (Math.random()*Frame.HEIGHT-super.getHauteur());
		
		this.couleur = new Color(r,v,b);
		this.setLocation((x/45)*45, (y/45)*45);
		this.setBackground(couleur);
		this.setSize(super.getLargeur(), super.getHauteur());
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", 1, 20));
		g.drawString(""+this.numero, super.getLargeur()/2, super.getHauteur()/2);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
