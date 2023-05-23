package day17.com.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex02_Calc extends JFrame {
	public Ex02_Calc() {
		super("계산기");
		
		JPanel np = new JPanel();
		
		JTextField jtf1 = new JTextField(25);
		
		JPanel jp = new JPanel(new GridLayout(5,5,5,3));
		
		
		
		np.add(jtf1);
		
		
		
		add(np,BorderLayout.NORTH);
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02_Calc();
	}
}
