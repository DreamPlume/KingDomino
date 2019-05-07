package fr.KingDomino.piece;

import java.awt.Color;

public class Domino {

	private int numero;
	private final int hauteur = 50;
	private final int largeur = 100;
	private Color couleur;
	
	public Domino(int pfNumero) {
		this.numero = pfNumero;
		
		
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
