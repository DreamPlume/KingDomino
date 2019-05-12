package fr.KingDomino.service;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouvement implements MouseMotionListener, MouseListener {

	private int x;
	private int y;

	public Mouvement(Component... comp) {

		for (Component component : comp) {
			component.addMouseMotionListener(this);
			component.addMouseListener(this);
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		e.getComponent().setLocation((((e.getX() + e.getComponent().getX()) - this.x)/45)*45,
									 (((e.getY() + e.getComponent().getY()) - this.y)/45)*45);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.x = e.getX();
		this.y = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

}
