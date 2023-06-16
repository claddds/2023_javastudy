package network.com.ict.edu7;

import java.awt.CardLayout;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import network.com.ict.edu6.Card_One;
import network.com.ict.edu6.Card_Two;

public class ChatClient2 extends JFrame implements Runnable{
	JPanel pg1;
	CardLayout cardLayout;
	Card_One one;
	Card_Two two;
	Card_Three three;
	
	// 접속
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;
	
	public ChatClient2() {
		super("멀티채팅");
		cardLayout = new CardLayout();
		pg1 = new JPanel();
		pg1.setBorder(new EmptyBorder(10,10,10,10));
		pg1.setLayout(cardLayout);
		/*
		// 카드 생성
		one = new Card_One(this);
		two = new Card_Two(this);
		three = new Card_Three(this);
		*/
	}
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		
	}

}
