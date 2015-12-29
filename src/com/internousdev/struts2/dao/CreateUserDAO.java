package com.internousdev.struts2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.struts2.util.DBConnector;

public class CreateUserDAO {
	private String useremail;

	public String select(String userEmail) {

		Connection conn = null;
		String ret = "success";
		try {
			conn = (Connection) DBConnector.getConnection();
			String sql = "SELECT * FROM prototype WHERE";
			sql += " useremail = ?";
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, userEmail);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ret = "error";
				setUseremail(rs.getString("useremail"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return ret;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

}