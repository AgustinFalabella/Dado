package Dado;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class Base {

	String ruta = "src/imagenes/";
	public JFrame frame;

	public Base() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 242, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel dado = new JLabel("");
		dado.setBorder(new LineBorder(new Color(0, 0, 0)));
		dado.setBounds(46, 59, 136, 114);
		frame.getContentPane().add(dado);

		JButton btnTurno = new JButton("Tirar");
		btnTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tiro = 1 + (int) (Math.random() * 6);

				ImageIcon image = new ImageIcon(ruta + tiro + ".png");
				
				Icon icon = new ImageIcon (image.getImage().getScaledInstance(dado.getWidth(), dado.getHeight(), Image.SCALE_DEFAULT));
				
				dado.setIcon(icon);
			}
		});
		btnTurno.setBounds(66, 196, 89, 23);
		frame.getContentPane().add(btnTurno);
	}
}
