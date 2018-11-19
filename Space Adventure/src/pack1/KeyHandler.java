package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	
	static int tempKeyHandler = 0;

	@Override
	public void keyPressed(KeyEvent e) {
	if(e.getKeyCode()==KeyEvent.VK_UP) {
		Var.moveup = true;
	}
	
	if(e.getKeyCode()==KeyEvent.VK_DOWN) {
		Var.movedown = true;
	}
	
	if(e.getKeyCode()==KeyEvent.VK_LEFT) {
		Var.moveleft = true;
	}
	
	if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
		Var.moveright = true;
	}
	
	if(tempKeyHandler == 0) {
		//Menü
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			Var.imSpiel = false;
			Var.imMenü = true;
			Var.imOptionen =false;
			Var.imShop =false;
			Var.btnresume.setVisible(true);
			Var.btnshop.setVisible(true);
			Var.btnoptionen.setVisible(true);
			Var.btnexit.setVisible(true);
			tempKeyHandler++;
		} 
		
	} else if(tempKeyHandler == 1) {
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			Var.imSpiel = true;
			Var.imMenü = false;
			Var.imOptionen = false;
			Var.imShop = false;
			Var.btnresume.setVisible(false);
			Var.btnshop.setVisible(false);
			Var.btnoptionen.setVisible(false);
			Var.btnexit.setVisible(false);
			tempKeyHandler++;
			Aktualisierung.tempAktualisierung = 0;
		} 
	}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.movedown = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveleft = false;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveright = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}



}
