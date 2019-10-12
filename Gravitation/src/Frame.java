import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private JPanel contentPane;
	Draw draw = new Draw();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		draw.setBounds(0, 0, getWidth(), getHeight());
		draw.setFocusable(true);
		draw.setRequestFocusEnabled(true);
		draw.grabFocus();
		draw.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_S && e.getKeyCode() == KeyEvent.VK_D) {
					draw.playerY += 10;
					draw.playerX += 10;
				}

				if (e.getKeyCode() == KeyEvent.VK_W) {
					draw.playerY -= 10;
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {
					draw.playerY += 10;
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {
					draw.playerX -= 10;
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {
					draw.playerX += 10;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

		});
		contentPane.add(draw);
	}
}
