package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SessionClearAction extends ActionSupport implements SessionAware {
	/**
	 * セッション
	 */
	private Map<String,Object> session;
	public String execute() {
		session.clear();
		return SUCCESS;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
