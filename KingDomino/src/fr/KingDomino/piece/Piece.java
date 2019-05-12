package fr.KingDomino.piece;

import javax.swing.JPanel;

public class Piece extends JPanel{

	private int hauteur;
	private int largeur;
	
	public Piece() {
		this.hauteur = 45;
		this.largeur = 45;
	}
	
	public Piece(int pfHauteur, int pfLargeur) {
		this.hauteur = pfHauteur;
		this.largeur = pfLargeur;
	}
	public int getHauteur() {
		return this.hauteur;
	}
	
	public int getLargeur() {
		return this.largeur;
	}
}
