package kr.or.ddit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
* Select 예제
*/
public class T02_JdbcTest{
	public static void main(String[] args) {
		
		/*
 문제 1) 사용자로부터 lprod_id값을 입력받아 입력한 값도 Lprod_id가 큰 자료들을 출력하시오.
		 */
		
//		Connection conn =null;
//		Statement stmt =null;
//		ResultSet rs = null; 
//		
//		Scanner s =new Scanner(System.in);
//		int input1 =Integer.parseInt(s.nextLine());
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			
//			String url = "jdbc:oracle:thin:@localhost:1521/xe";
//			String userId = "PONGPONG";
//			String password= "java";
//			
//			conn = DriverManager.getConnection(url, userId, password);
//			
//			stmt = conn.createStatement();
//			
//			String sql = "select *from lprod where lprod_id>"+input1;
//			
//			rs = stmt.executeQuery(sql);
//			
//			System.out.println("실행한 쿼리문 : " + sql);
//			System.out.println("=== 쿼리문 실행결과 ===");
//			
//			
//			while(rs.next()) {
//				//컬럼의 자료를 가져오는 방법
//				// 방법1) rs.get자료형 이름("컬럼명")
//				// 방법2) rs.get자료형 이름(컬럼번호) => 컬럼번호는 1부터 시작
//				System.out.println("lprod_id : " + rs.getInt(1) );
//				System.out.println("lprod_gu : " + rs.getString("lprod_gu") );
//				System.out.println("lprod_nm : " + rs.getString("lprod_nm") );
//				System.out.println("-------------------------------------");
//			}
//			
//			
//		}catch (SQLException q) {
//			q.printStackTrace();
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}finally {
//			//6. 종료 (사용했던 자원을 모두 반납한다.)
//			if(rs != null) try{rs.close();}catch(SQLException e ) {}
//			if(stmt != null) try{stmt.close();}catch(SQLException e ) {}
//			if(conn != null) try{conn.close();}catch(SQLException e ) {}
//		}
//		
		
		
		/*
문제2) lprod_id값을 2개 입력받아서 두값중 작은 값부터 큰값아이의 자료를 출력하시오.
*/
		Connection conn =null;
		Statement stmt =null;
		ResultSet rs = null; 
		
		Scanner s =new Scanner(System.in);
		int input1 =Integer.parseInt(s.nextLine());
		int input2 =Integer.parseInt(s.nextLine());
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userId = "PONGPONG";
			String password= "java";
			
			conn = DriverManager.getConnection(url, userId, password);
			
			stmt = conn.createStatement();
			
			String sql = "select *from lprod where lprod_id>"+input1+"AND lprod_id<"+input2;
			
			rs = stmt.executeQuery(sql);
			
			System.out.println("실행한 쿼리문 : " + sql);
			System.out.println("=== 쿼리문 실행결과 ===");
			
			
			while(rs.next()) {
				//컬럼의 자료를 가져오는 방법
				// 방법1) rs.get자료형 이름("컬럼명")
				// 방법2) rs.get자료형 이름(컬럼번호) => 컬럼번호는 1부터 시작
				System.out.println("lprod_id : " + rs.getInt(1) );
				System.out.println("lprod_gu : " + rs.getString("lprod_gu") );
				System.out.println("lprod_nm : " + rs.getString("lprod_nm") );
				System.out.println("-------------------------------------");
			}
			
			
		}catch (SQLException q) {
			q.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			//6. 종료 (사용했던 자원을 모두 반납한다.)
			if(rs != null) try{rs.close();}catch(SQLException e ) {}
			if(stmt != null) try{stmt.close();}catch(SQLException e ) {}
			if(conn != null) try{conn.close();}catch(SQLException e ) {}
		}
		





		 
	}


}


