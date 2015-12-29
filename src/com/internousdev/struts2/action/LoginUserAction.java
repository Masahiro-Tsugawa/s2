package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginUserAction  extends ActionSupport implements SessionAware {
	/**
	 * セッション
	 */
	private Map<String,Object> session;
	private String loginEmail;
	private String loginPass;
	private String userId;
	public String execute() {
		userId = "津川";
		session.clear();
		if(loginEmail.equals("Tsugawa") & loginPass.equals("isGOD")){
			System.out.println(loginEmail);
			System.out.println(loginPass);
			session.put("userId", loginEmail);
		System.out.println(session.get("userId"));
		System.out.println(userId);
			return SUCCESS;
		}else{
		return ERROR;
		}
	}
	
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPass() {
		return loginPass;
	}
	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
