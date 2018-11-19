package pack1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0, backgroundY2 = -600, backgroundspeed = 9;
	static int x = 400, y = 400;
	static int speedup = 3, speeddown = 2, speedleft = 2, speedright = 2;
	static int flammeanimation;
	static int schrott = 0, leben = 2, maxleben = 2;
	
	static JButton btnresume, btnshop, btnoptionen, btnexit;
	static JButton btnmute;
	
	static int gegnerx[] = new int[5], gegnery[] = new int[5];
	static int gegnerspeed[] = new int[5];
	
	static int schrottx1[] = new int[5], schrotty1[] = new int[5];
	static int schrottx2[] = new int[5], schrotty2[] = new int[5];
	static int schrottx3, schrotty3;
	static int schrottspeed1[] = new int[5], schrottspeed2[] = new int[2], schrottspeed3;
	static int expanimation;
	
	static boolean moveup = false, movedown = false, moveleft = false, moveright = false;
	static boolean kollidiert = false, verloren = false; 
	static boolean imSpiel = true, imMen� = false, imOptionen = false, imShop = false;
	
	static Label lbl1;

	static BufferedImage ib1, ib2;
	static BufferedImage irakete, iflamme1, iflamme2;
	static BufferedImage igegner1;
	static BufferedImage ischrott1, ischrott2, ischrott3;
	static BufferedImage iexplosion[] = new BufferedImage[16];
	

	public Var() {

		try {
			// Background

			ib1 = ImageIO.read(new File("rsc/b1.png"));
			ib2 = ImageIO.read(new File("rsc/b2.png"));
			// Rakete
			irakete = ImageIO.read(new File("rsc/rakete.png"));
			// Flamme
			iflamme1 = ImageIO.read(new File("rsc/flamme1.1.png"));
			iflamme2 = ImageIO.read(new File("rsc/flamme1.2.png"));
			//Gegner
			igegner1 = ImageIO.read(new File("rsc/gegner1.png"));
			//Schrott
			ischrott1 = ImageIO.read(new File("rsc/schrott1.png"));
			ischrott2 = ImageIO.read(new File("rsc/schrott2.png"));
			ischrott3 = ImageIO.read(new File("rsc/schrott3.png"));
			//Explosion
			for(int i=0; i<=15;i++) {
				iexplosion[i] = ImageIO.read(new File("rsc/exp"+(i+1)+".png"));
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
		gegnerspeed[0] = 3;
		gegnerspeed[1] = 4;
		gegnerspeed[2] = 3;
		gegnerspeed[3] = 4;
		gegnerspeed[4] = 3;
		
		schrottspeed1[0] = 2;
		schrottspeed1[1] = 3;
		schrottspeed1[2] = 2;
		schrottspeed1[3] = 4;
		schrottspeed1[4] = 3;
		
		schrottspeed2[0] = 4;
		schrottspeed2[1] = 5;
		
		schrottspeed3 = 6;

	}

}