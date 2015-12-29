package com.internousdev.struts2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.struts2.util.DBConnector;
import com.mysql.fabric.xmlrpc.base.Array;

public class TestDAO {
	private String DBComment;
	Connection con; 
	
	public int insert(String comment) throws SQLException {

		con = DBConnector.getConnection();

		
		
		String sql = "insert into prototype (comment) values (?)";
		PreparedStatement ps2;
		ps2 = con.prepareStatement(sql);
		ps2.setString(1, comment);

		int rscount = ps2.executeUpdate();

		if (rscount > 0) {
			System.out.println("insert - インサート完了");
		} else {
			System.out.println("insert - インサード失敗");
		}
		
	
		return rscount;
	}
	
	public  String select(String comment){
		System.out.println("突入");
        String ret="error";
        con = (Connection) DBConnector.getConnection();
        try {
            String sql = "SELECT * FROM prototype order by comment desc limit 3";
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, comment);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
              ret = "success";
              DBComment=rs.getString("comment");
              System.out.println(DBComment);
              System.out.println("dao中");
           }}
            catch (SQLException e) {
 	           e.printStackTrace();
 	        } finally {
 	           if (con != null) {
 	              try {
 	                 con.close();
 	              } catch (SQLException e) {
 	            	  e.printStackTrace();
 	              }
 	           }
 	        }
        return ret;
	}
	

	public String getDBComment() {
		return DBComment;
	}

	public void setDBComment(String dBcomment) {
		DBComment = dBcomment;
	}
	


}