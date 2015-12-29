
package com.internousdev.struts2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.internousdev.struts2.util.DBConnector;

/**
 * ユーザー情報を検索しインサートとアップデートするクラス
 * 
 * @author T.Tsugawa
 * @version 1.1
 * @since 1.0
 */
public class RegisterUserDAO {
	/**
	 * 会員ID
	 */
	private int id;
	/**
	 * 会員名
	 */
	private String name;

	/**
	 * ユーザー情報をデータベースにインサートするメソッド
	 * @param email メールアドレス
	 * @param password パスワード
	 * @param name 名前
	 * @param kanaName カナr
	 * @param telNum 電話番号
	 * @param posCode 郵便番号
	 * @param address 住所
	 * @return count インサート完了で1，失敗で0
	 */
	public int insert(String email, String password, String name, String kanaName, String telNum, String posCode, String address){

		int count = 0;
		Connection con = DBConnector.getConnection();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dt = sdf.format(c.getTime());

		String sql = "insert into user(email,password,name,name_kana,tel,postal_code,address,"
				+ "created_at,updated_at) value(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, kanaName);
			ps.setString(5, telNum);
			ps.setString(6, posCode);
			ps.setString(7, address);
			ps.setString(8, dt);
			ps.setString(9, dt);

			count = ps.executeUpdate();
		} catch (SQLException e) {
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
		return count;
	}

	/**
	 * メールアドレスでユーザーのIDと名前を検索するメソッド
	 * @param email メールアドレス
	 * @return result 処理ができたか否か
	 */
	public boolean select(String email) {
		boolean result = false;

		Connection con = DBConnector.getConnection();
		String sql = "select id,name from user where email=?;";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt("id");
				name = rs.getString("name");
				result = true;
			}
		} catch (SQLException e) {
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
		return result;
	}

	/**
	 * 会員ID取得メソッド
	 * @return id 会員ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * 会員名取得メソッド
	 * @return name 会員名
	 */
	public String getName() {
		return name;
	}

}
