package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.struts2.dao.CreateUser2DAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 新規登録画面の画面出力の為のクラス
 * @author K.Kato
 * @version 1.1
 * @since 1.0
 */
public class CreateUser2Action extends ActionSupport implements SessionAware {
	/**
	 * シリアルを生成
	 */
	private static final long serialVersionUID = -7016065614706474231L;
	/**
	 * セッションを表します。
	 */
	private Map<String, Object> session;
	/**
	 * 性を表します。
	 */
	private String userNameSurname;
	/**
	 * 名を表します。
	 */
	private String userNameFirstName;
	/**
	 * カナ性を表します。
	 */
	private String userKanaNameSurname;
	/**
	 * カナ名を表します。
	 */
	private String userKanaNameFirstName;
	/**
	 * メールアドレスを表します。
	 */
	private String userEmail;
	/**
	 * 確認用メールアドレスを表します。
	 */
	private String confirmUserEmail;
	/**
	 * パスワードを表します。
	 */
	private String userPassword;
	/**
	 * 確認用パスワードを表します。
	 */
	private String confirmUserPassword;
	/**
	 * 郵便番号を表します。
	 */
	private String userPostalCode;
	/**
	 * 住所（都道府県）を表します。
	 */
	private String userAddressPrefecture;
	/**
	 * 住所（市町村区）を表します。
	 */
	private String userAddressCity;
	/**
	 * 住所（マンション等以下）を表します。
	 */
	private String userAddressOther;
	/**
	 * 電話番号を表します。
	 */
	private String userTelNum;
	/**
	 * メールアドレス重複登録のエラーメッセージを表します。
	 */
	private String errorMail;
	
	
		
		
	/**
	 * 既存メールアドレスがDBにないかを確かめるメソッド
	 * @return ret 既存登録アドレスの有無
	 */
	public String execute() {
		
		session.remove("userName");
		session.remove("userKanaName");
		session.remove("userPass");
		session.remove("userPostalCode");
		session.remove("userAddress");
		session.remove("userEmail");
		session.remove("userTelNum");

		CreateUser2DAO dao = new CreateUser2DAO();
		String ret = ERROR;
		
		if (dao.select(userEmail)) {
			ret = SUCCESS;
		} else {
			setErrorMail(getText("既に登録されているメールアドレスです。"));
		}

		StringBuilder userName = new StringBuilder();
		userName.append(userNameSurname);
		userName.append(userNameFirstName);
		session.put("userName", userName.toString());
		
		StringBuilder userKanaName = new StringBuilder();
		userKanaName.append(userKanaNameSurname);
		userKanaName.append(userKanaNameFirstName);
		session.put("userKanaName", userKanaName.toString());
		
		session.put("userPass", userPassword);
		session.put("userPostalCode", userPostalCode);
		
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddressPrefecture);
		userAddress.append(userAddressCity);
		userAddress.append(userAddressOther);
		session.put("userAddress", userAddress.toString());
		
		session.put("userEmail", userEmail);
		session.put("userTelNum", userTelNum);
		
		return ret;
	}

	/**
	 * 新規登録メールアドレスを取得するメソッド
	 * @return userEmail 新規登録メールアドレス
	 */
	public String getUserEmail() {
		return userEmail;
	}
    /**
     * 新規登録メールアドレスを設定するメソッド
     * @param userEmail 新規登録メールアドレス
     */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
    /**
     * 新規登録電話番号を取得するメソッド
     * @return userTelNum 電話番号
     */
	public String getUserTelNum() {
		return userTelNum;
	}
    /**
     * 新規登録電話番号を設定するメソッド
     * @param userTelnum 新規登録電話番号
     */
	public void setUserTelNum(String userTelnum) {
		this.userTelNum = userTelnum;
	}
    /**
     * 新規登録郵便番号を取得するメソッド
     * @return userPostalCode 新規登録郵便番号
     */
	public String getUserPostalCode() {
		return userPostalCode;
	}
    /**
     * 新規登録郵便番号を設定するメソッド
     * @param userPostalCode 新規登録郵便番号
     */
	public void setUserPostalCode(String userPostalCode) {
		this.userPostalCode = userPostalCode;
	}
    /**
     * 新規登録パスワードを取得するメソッド
     * @return userPassword 新規登録パスワード
     */
	public String getUserPassword() {
		return userPassword;
	}
    /**
     * 新規登録パスワードを設定するメソッド
     * @param userPassword 新規登録パスワード
     */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
    /**
     * 確認用パスワードを取得するメソッド
     * @return confirmUserPassword 確認用パスワード
     */
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}
    /**
     * 確認用パスワードを設定するメソッド
     * @param confirmUserPassword 確認用パスワード
     */
	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}
    /**
     * 都道府県を取得するメソッド
     * @return userAddressPrefecture 都道府県
     */
	public String getUserAddressPrefecture() {
		return userAddressPrefecture;
	}
    /**
     * を設定するメソッド
     * @param userAddressPrefecture 都道府県
     */
	public void setUserAddressPrefecture(String userAddressPrefecture) {
		this.userAddressPrefecture = userAddressPrefecture;
	}
    /**
     * 市町村区を取得するメソッド
     * @return userAddressCity 市町村区
     */
	public String getUserAddressCity() {
		return userAddressCity;
	}
    /**
     * 市町村区を設定するメソッド
     * @param userAddressCity 市町村区
     */
	public void setUserAddressCity(String userAddressCity) {
		this.userAddressCity = userAddressCity;
	}
    /**
     * 市町村区以下の住所を取得するメソッド
     * @return userAddressOther 市町村区以下の住所
     */
	public String getUserAddressOther() {
		return userAddressOther;
	}
    /**
     * 市町村区以下の住所を設定するメソッド
     * @param userAddressOther 市町村区以下の住所
     */
	public void setUserAddressOther(String userAddressOther) {
		this.userAddressOther = userAddressOther;
	}
    /**
     * セッションを設定するメソッド
     * @param session セッション
     */
	public void setSession(Map<String, Object> session) {
		this.session= session;
	}
    /**
     * 確認用メールアドレスを取得するメソッド
     * @return confirmUserEmail 確認用メールアドレス
     */
	public String getConfirmUserEmail() {
		return confirmUserEmail;
	}
    /**
     * 確認用メールアドレスを設定するメソッド
     * @param confirmUserEmail 確認用メールアドレス
     */
	public void setConfirmUserEmail(String confirmUserEmail) {
		this.confirmUserEmail = confirmUserEmail;
	}
    /**
     * 既存メールアドレスがあった時のエラーメッセージを取得するメソッド
     * @return errorMail エラーメッセージ
     */
	public String getErrorMail() {
		return errorMail;
	}
    /**
     * 既存メールアドレスがあった時のエラーメッセージを設定するメソッド
     * @param errorMail エラーメッセージ
     */
	public void setErrorMail(String errorMail) {
		this.errorMail = errorMail;
	}
    /**
     * 新規登録性を取得するメソッド
     * @return userNameSurname 新規登録性
     */
	public String getUserNameSurname() {
		return userNameSurname;
	}
    /**
     * 新規登録性を設定するメソッド
     * @param userNameSurname 新規登録性
     */
	public void setUserNameSurname(String userNameSurname) {
		this.userNameSurname = userNameSurname;
	}
    /**
     * 新規登録名を取得するメソッド
     * @return userNameFirstName 新規登録名
     */
	public String getUserNameFirstName() {
		return userNameFirstName;
	}
    /**
     * 新規登録名を設定するメソッド
     * @param userNameFirstName 新規登録名
     */
	public void setUserNameFirstName(String userNameFirstName) {
		this.userNameFirstName = userNameFirstName;
	}
	/**
	 * 新規登録カナ性を取得するメソッド
	 * @return　userKanaNameSurname　新規登録カナ性
	 */
	public String getUserKanaNameSurname() {
		return userKanaNameSurname;
	}

	/**
	 * 新規登録カナ性を設定するメソッド
	 * @param userKanaNameSurname 新規登録カナ性
	 */
	public void setUserKanaNameSurname(String userKanaNameSurname) {
		this.userKanaNameSurname = userKanaNameSurname;
	}

	/**
	 * 新規登録カナ名を取得するメソッド
	 * @return　userKanaNameFirstName　新規登録カナ名
	 */
	public String getUserKanaNameFirstName() {
		return userKanaNameFirstName;
	}

	/**
	 * 新規登録カナ名を設定するメソッド
	 * @param userKanaNameFirstName 新規登録カナ名
	 */
	public void setUserKanaNameFirstName(String userKanaNameFirstName) {
		this.userKanaNameFirstName = userKanaNameFirstName;
	}



}