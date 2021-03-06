package com.internousdev.struts2.action;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.struts2.dao.CreateUserDAO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7415007824141763459L;
	private Map<String, Object> session;
	private String userName;
	private String userPassword;
	private String confirmUserPassword;
	private String userPostalCode;
	private String userAddress1;
	private String userAddress2;
	private String userAddress3;
	private String userEmail;
	private String confirmUserEmail;
	private String userTelNum;
	private String errorMail;
	private Map<String, String> map = new HashMap<String, String>();
	
	
	public String execute() throws SQLException {
		
		map.put("blue", "青");
		map.put("green", "緑");
        map.put("red", "赤");
        map.put("yellow", "黄");
        for(Iterator<String> ite = map.keySet().iterator();ite.hasNext();){
        	String key = ite.next();
        	System.out.println(key);
        }
        for(Iterator<String> ite = map.values().iterator();ite.hasNext();){
        	String val = ite.next();
        	System.out.println(val);
        }
		
		CreateUserDAO dao = new CreateUserDAO();
		String ret = dao.select(userEmail);
		if(ret == ERROR){
		  setErrorMail("すでに登録されているアドレスです");
		}
		session.put("signUpName", userName);
		session.put("signUpPassword", userPassword);
		session.put("signUpPostalCode", userPostalCode);
		StringBuilder userAddress = new StringBuilder();
		userAddress.append(userAddress1);
		userAddress.append(userAddress2);
		userAddress.append(userAddress3);
		session.put("signUpAddress", userAddress);
		session.put("signUpEmail", userEmail);
		session.put("signUpTelNum", userTelNum);
		return ret;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTelNum() {
		return userTelNum;
	}

	public void setUserTelNum(String userTelnum) {
		this.userTelNum = userTelnum;
	}

	public String getUserPostalCode() {
		return userPostalCode;
	}

	public void setUserPostalCode(String userPostalCode) {
		this.userPostalCode = userPostalCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getConfirmUserPassword() {
		return confirmUserPassword;
	}

	public void setConfirmUserPassword(String confirmUserPassword) {
		this.confirmUserPassword = confirmUserPassword;
	}

	public String getUserAddress1() {
		return userAddress1;
	}

	public void setUserAddress1(String userAddress1) {
		this.userAddress1 = userAddress1;
	}

	public String getUserAddress2() {
		return userAddress2;
	}

	public void setUserAddress2(String userAddress2) {
		this.userAddress2 = userAddress2;
	}

	public String getUserAddress3() {
		return userAddress3;
	}

	public void setUserAddress3(String userAddress3) {
		this.userAddress3 = userAddress3;
	}


	public void setSession(Map<String, Object> session) {
		this.session= session;
	}

	public String getConfirmUserEmail() {
		return confirmUserEmail;
	}

	public void setConfirmUserEmail(String confirmUserEmail) {
		this.confirmUserEmail = confirmUserEmail;
	}

	public String getErrorMail() {
		return errorMail;
	}

	public void setErrorMail(String errorMail) {
		this.errorMail = errorMail;
	}

	public Map<String, String> getMap() {
		return map;
	}

}