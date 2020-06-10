package kr.or.ddit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	/**
	 * JDBC 드라이버를 로딩하고 Connectiom 객체를 생성하는 메서드 제공
	 */
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료 !!");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 !!!");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {  //또 객체를 만들어야하는데 객체 안만들어도, 항상 쓸수있어요.
		try {
			return DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"PONGPONG",
					"java");
					
		}catch(SQLException e) {
			System.out.println("DB연결 실패 !!!");
			e.printStackTrace();
			return null;
		}
	}
}
