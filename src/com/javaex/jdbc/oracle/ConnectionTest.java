package com.javaex.jdbc.oracle;

import java.sql.*; // JDBC API

public class ConnectionTest {

	public static void main(String[] args) {
		// DB접속 url
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "c##bituser";
		String dbpass = "bituser";
		
		// 접속
		Connection conn = null;
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.println(conn);
			System.out.println("접속 성공!");
			
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			// 자원정리
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
