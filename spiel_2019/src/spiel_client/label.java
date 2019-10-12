package spiel_client;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;




public class label extends JLabel {
	private static final long serialVersionUID = 1L;
	
	HitBox h = new HitBox();
	var p = new var();
	var e = new var();
	
	protected void paintComponent(Graphics g) {
		
	
		
		super.paintComponent(g);		
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		 ((Graphics2D) g).setStroke(new BasicStroke(5));

		 
		 {
			 
			 g.drawRect(0, 0, 800, 600);
			 
			
			 
			 g.setColor(Color.green);
			 g.fillRect(var.x,var.y, var.playerwidth, var.playerhight);	
			 g.setColor(Color.red);
			 g.fillRect(var.player2x,var.player2y, var.playerwidth, var.playerhight);	
			 
			 g.setFont(new Font(null, 1, 15));
			 g.setColor(Color.black);
			 g.drawString("Player1: X: " + var.x + " | Y: " + var.y, 10, 30);
			 g.drawString("Player2: X: " + var.player2x + " | Y: " + var.player2y, 200, 30);
		
			 if(!h.hits(p,e)) {
				 if(var.up == true && var.y > var.ceiling && var.y > var.ground - var.playerhight - 5) {
						
						var.jump = true ;
						
				}
				if(var.down == true && var.y  < var.ground - var.playerhight) {
						
					var.y+=var.movespeed;
						
				}
				if(var.left == true && var.x > var.boarderleft) {
				
					var.x-=var.movespeed;
				
				}
				if(var.right == true && var.x < var.boarderright - var.playerwidth) {
				
					var.x+=var.movespeed;
				
				}
				
				
				if(var.y  < var.ground - var.playerhight && var.jump == false) {
					
					var.y+=2;
						
				}
				
				if(var.jump == true) {
					
					if(var.jumphight < 10) {
						var.jumphight++;
						var.y-= var.movespeed*2;
					}
					else {
						var.jump = false ;
						var.jumphight = 0 ;
					}
					
				}
			 }else {
				 g.drawString("Kollision", 400, 30);
				 if(var.up == true && var.y > var.ceiling && var.y > var.ground - var.playerhight - 5) {
						
						var.jump = true ;
						
				}
				if(var.down == true && var.y  < var.ground - var.playerhight) {
						
					var.y+=var.movespeed;
						
				}
				if(var.left == true && var.x > var.boarderleft) {
				
					var.x-=var.movespeed;
				
				}
				if(var.right == true && var.x < var.boarderright - var.playerwidth) {
				
					var.x+=var.movespeed;
				
				}
				
				
				if(var.y  < var.ground - var.playerhight && var.jump == false) {
					
					var.y+=2;
						
				}
				
				if(var.jump == true) {
					
					if(var.jumphight < 10) {
						var.jumphight++;
						var.y-= var.movespeed*2;
					}
					else {
						var.jump = false ;
						var.jumphight = 0 ;
					}
					
				}
			 }
			
			
			
			 
			 
			 
		 }
		 
		repaint();
		
		try {
			Thread.sleep(var.delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}