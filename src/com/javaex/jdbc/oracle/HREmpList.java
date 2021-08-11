package com.javaex.jdbc.oracle;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			String sql = "SELECT emp.first_name || '' || emp.last_name as name," +
			"mgr.first_name || mrg.last_name mgr _name " + 
			"FROM employees emp, employees mgr " +
			"WHERE emp.manager_id = mgr.employee_id" +
			" ORDER BY name Desc";
			stmt = conn.createStatement();
			// 질의 수행
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) { 
				String name = rs.getString("name");
				String mgrName = rs.getString("mgr_name");
						
				System.out.printf("Name: %s, Manager: %s%n", name, mgrName);
						
			}
		}  catch (ClassNotFoundException e) {
	         System.err.println("드라이버 로드 실패!");
	      } catch (SQLException e) {
	    	  System.err.println("SQL Error!");
	      } catch (NullPointerException e) {
	    	  System.err.println("Null 오류..");
	      } finally {
	         try {
	            rs.close();
	            stmt.close();
	            conn.close();
	         } catch (Exception e) {
	            e.printStackTrace();
	         }

	}

	}}


