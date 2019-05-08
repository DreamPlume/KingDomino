package fr.KingDomino.piece;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Domino extends JPanel{

	private int numero;
	private final int hauteur = 50;
	private final int largeur = 100;
	private Color couleur;
	
	public Domino(int pfNumero) {
		
		this.numero = pfNumero;
		
		int r = (int) (Math.random()*255);
		int v = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		
		this.couleur = new Color(r,v,b);
		
		this.setBackground(couleur);
		this.setSize(largeur, hauteur);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", 1, 20));
		g.drawString(""+this.numero, this.largeur/2, this.hauteur/2);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getLargeur() {
		return largeur;
	}
	
}
