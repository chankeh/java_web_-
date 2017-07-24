package mypackage;

import java.sql.*;

public class DB {
	// ODBC��ʽ�������ݿ�

	String sDBDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	String sConnStr = "jdbc:sqlserver://localhost:1433;databasename=work";

	Connection conn = null;

	Statement stmt = null;

	ResultSet rs = null;

	public DB() {
		try {
			Class.forName(sDBDriver);
		} catch (java.lang.ClassNotFoundException e) {
			System.err.println("���ݿ�����ע�������Ϣ�� " + e.getMessage());
		}
	}

	// ִ��SQL��ѯ���
	public ResultSet executeQuery(String sql) {
		rs = null;
		try {
			conn = DriverManager.getConnection(sConnStr, "sa", "sa");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException ex) {
			System.err.println("ִ��SQL��ѯ�����󣬴�����Ϣ: " + ex.getMessage());
		}
		return rs;
	}

	// ִ��SQL�������
	public void executeUpdate(String sql) {
		rs = null;
		try {
			conn = DriverManager.getConnection(sConnStr, "sa", "sa");
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			System.err.println("ִ��SQL���������󣬴�����Ϣ: " + ex.getMessage());
		}
	}

	// �ر����ݿ�����
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
			System.err.println("ִ�йر����ݿ����ʧ�ܣ�������Ϣ: " + e.getMessage());
		}
	}
}
