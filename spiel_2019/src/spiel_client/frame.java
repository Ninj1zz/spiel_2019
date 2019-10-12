package spiel_client;

import javax.swing.JFrame;

public class frame {
	
	frame() {
		
		var v = new var();
		
		JFrame myframe = new JFrame("ja lol ey");
		myframe.setSize(v.framewidth, v.framehight);
		myframe.setLocationRelativeTo(null);
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myframe.setResizable(false);
		myframe.setLayout(null);
		myframe.addKeyListener(new KeyHandler());
		myframe.requestFocus();
		
		label l1 = new label();
		l1.setBounds(0, 0, v.framewidth, v.framehight);
		
		
		myframe.add(l1);
		myframe.setVisible(true);
		
	}
	
}