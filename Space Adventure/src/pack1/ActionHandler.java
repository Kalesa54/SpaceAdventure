package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Var.btnresume) {
			
			Var.imSpiel =true;
			Var.imShop =false;
			Var.imOptionen =false;
			Var.imMenü =false;
			Var.btnresume.setVisible(false);
			Var.btnoptionen.setVisible(false);
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);
			
			KeyHandler.tempKeyHandler = 0;
			Aktualisierung.tempAktualisierung = 0;
			
			Var.jf1.requestFocus();

		}else if(e.getSource() == Var.btnshop) {
			
			Var.imSpiel =false;
			Var.imShop =true;
			Var.imOptionen =false;
			Var.imMenü =false;
			Var.btnresume.setVisible(true);
			Var.btnoptionen.setVisible(false);
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);
			
			KeyHandler.tempKeyHandler = 1;
			
			Var.jf1.requestFocus();
			
		}else if(e.getSource() == Var.btnoptionen) {
			
			Var.imSpiel =false;
			Var.imShop =false;
			Var.imOptionen =true;
			Var.imMenü =false;
			Var.btnresume.setVisible(true);
			Var.btnoptionen.setVisible(false);
			Var.btnshop.setVisible(false);
			Var.btnexit.setVisible(false);
			
			KeyHandler.tempKeyHandler = 1;
			
			Var.jf1.requestFocus();
			
		}else if(e.getSource() == Var.btnexit) {
			System.exit(0);
		}

	}

}
