package network.com.ict.edu9;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import jdbc.com.ict.edu5.Ex02_VO;
import mybatis.com.ict.edu3.DAO;
import mybatis.com.ict.edu3.VO;

public class DB_Client extends JFrame implements Runnable{
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4;
	JTextArea jta;
	JScrollPane jsp;
	
	// 접속
	Socket s = null;
	ObjectInputStream in = null;
	ObjectOutputStream out = null;
	
	public DB_Client() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");

		jp1.add(new JLabel("*CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);
		
		List<VO> list = DAO.getList();

		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jta.setFont(new Font("굴림", Font.PLAIN, 20));
		
		// 전체보기
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		// 삽입
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				
				// custid가 중복이면 삽입불가
				
			}
		});
		
		// 삭제
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		
		// 검색
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
	
	public void prn(List<VO> list) {
		jta.setText("");
		jta.append("\n\t   회원 전체 정보 \n\n\n");
		jta.append("   번호\t이름\t주소\t전화번호\n");
		for (VO k : list) {
			jta.append("   " + k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}
	
	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.84", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	@Override
	public void run() {
		while (true) {
			
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new DB_Client();
			}
		});
	}
}

