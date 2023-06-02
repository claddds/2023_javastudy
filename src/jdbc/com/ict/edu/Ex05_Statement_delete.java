package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statement_delete {
	public static void main(String[] args) {
		// 접속과 처리를 위한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ryuhyeji";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			// delete (7번, 이강인, 대한민국 서울, 000-9000-0001) 제거
			String sql = "delete from customer where custid = 7";
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			if(result > 0) {
				// 성공하면 select문을 이용해서 보자
				sql = "select * from customer order by custid asc";
				// (안만들어도 된다)stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.print(rs.getString("phone")+"\n");
				}
			}else {
				System.out.println("삭제실패");
				sql = "select * from customer order by custid asc";
				// (안만들어도 된다)stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.print(rs.getString("phone")+"\n");
				}
			}
		} catch (Exception e) {
			System.out.println("제대로된 데이터를 넣어주세요"+e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}