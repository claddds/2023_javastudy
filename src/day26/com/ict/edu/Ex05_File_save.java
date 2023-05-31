package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StringReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_save extends JFrame{
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	
	public Ex05_File_save() {
		super("저장하기");
		
		jp = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("SAVE");
		jp.add(new JLabel("파일 경로: "));
		jp.add(jtf);
		jp.add(jb);
		
		jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		add(jp, BorderLayout.NORTH);
		add(jta, BorderLayout.CENTER);
		
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String pathname_in = new String(jta.getText());
				File file_in = new File(pathname_in);
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				
				String pathname_out = new String(jtf.getText());
				File file_out = new File(pathname_out);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				try {
					fis = new FileInputStream(file_in);
					bis = new BufferedInputStream(fis);
					
					fos = new FileOutputStream(file_out, true);
					bos = new BufferedOutputStream(fos);
					
					// 모든 파일의 복사,이동은 해당 방식으로 해야 된다.
					int b = 0;
					while((b = bis.read()) != -1){
						bos.write(b);
					}
				} catch (Exception e1) {
					// TODO: handle exception
				} finally {
					try {
						
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
			}
		});
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05_File_save();
	}
}
