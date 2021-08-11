package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.*;


public class HRSalary {

	public static void main(String[] args) {
	String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("최소급여: \n");
	int minSal = sc.nextInt();
	System.out.println("최대급여:");
	int maxSal = sc.nextInt();
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(dburl, "HR", "hr");
		
		String sql = "SELECT first_name || ' ' || last_name as name, salary " +
		"FROM employees " +
		"WHERE salary > ?  AND salary < ?" +
		"ORDER BY SALARY";
		
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, minSal);
		pstmt.setInt(2, maxSal);
				
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String name = rs.getString(1);
			int salary = rs.getInt(2);
			System.out.printf("%-25s   %-8s %n", rs.getString("name"), 
	                  rs.getString("salary")); 
		
		}
	    } catch (ClassNotFoundException e ) {
			System.err.println("로드실패");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				
			}
	}
	
		sc.close();
	
	

	}

}

