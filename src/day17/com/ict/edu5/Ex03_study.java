package day17.com.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex03_study extends JFrame{
	public Ex03_study() {
		super("성적계산");
		
		JPanel jp1 = new JPanel();
		JTextField jtf1 = new JTextField(10);
		
		JPanel jp2 = new JPanel();
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(10);
		JTextField jtf4 = new JTextField(10);
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);	// 자동 줄바꾸기
		jta.setEditable(false);
		
		jp1.add(new JLabel("이름: "));
		jp1.add(jtf1);
		jp2.add(new JLabel("국어: "));
		jp2.add(jtf2);
		jp2.add(new JLabel("영어: "));
		jp2.add(jtf3);
		jp2.add(new JLabel("수학: "));
		jp2.add(jtf4);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.NORTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex03_study();
	}
}
