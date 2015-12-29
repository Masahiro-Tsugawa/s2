package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoCreateUserAction extends ActionSupport /*implements SessionAware*/{
	//private Map<String, Object> session;
	public String execute(){
		// session.get("userEmail");
		return SUCCESS;
	}
	/**
	 * セッション格納メソッド
	 * @param session セッション
	 */
	/* public void setSession(Map<String, Object> session) {
		this.session = session;
	} */
	
}

