package mypackage;

import java.sql.*;

public class DB {
	// ODBC方式连接数据库

	String sDBDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	String sConnStr = "jdbc:sqlserver://localhost:1433;databasename=work";

	Connection conn = null;

	Statement stmt = null;

	ResultSet rs = null;

	public DB() {
		try {
			Class.forName(sDBDriver);
		} catch (java.lang.ClassNotFoundException e) {
			System.err.println("数据库驱动注册错误信息： " + e.getMessage());
		}
	}

	// 执行SQL查询语句
	public ResultSet executeQuery(String sql) {
		rs = null;
		try {
			conn = DriverManager.getConnection(sConnStr, "sa", "sa");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException ex) {
			System.err.println("执行SQL查询语句错误，错误信息: " + ex.getMessage());
		}
		return rs;
	}

	// 执行SQL更新语句
	public void executeUpdate(String sql) {
		rs = null;
		try {
			conn = DriverManager.getConnection(sConnStr, "sa", "sa");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			System.err.println("执行SQL更新语句错误，错误信息: " + ex.getMessage());
		}
	}

	// 关闭数据库连接
	public void close() {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			System.err.println("执行关闭数据库对象失败，错误信息: " + e.getMessage());
		}
	}
}
