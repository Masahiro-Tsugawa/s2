package com.internousdev.struts2.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TestTeatAction  extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute(){
	session.put("test", "はげ");
		return SUCCESS;
	}
	public void setSession(Map<String, Object> session) {
		this.session= session;
	}
	
}
