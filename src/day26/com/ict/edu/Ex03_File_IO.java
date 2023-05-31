package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
	D:/rhj/test01.txt 읽어서 D:/rhj/test02.txt 내용 추가
*/
public class Ex03_File_IO {
	public static void main(String[] args) {
		String pathname_in = "D:/rhj/test01.txt";
		File file_in = new File(pathname_in);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		String pathname_out = "D:/rhj/test02.txt";
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
			/*
			byte[] b = new byte[(int) file_in.length()];
			fis.read(b);
			
			fos.write(b);
			fos.flush();
			*/
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
