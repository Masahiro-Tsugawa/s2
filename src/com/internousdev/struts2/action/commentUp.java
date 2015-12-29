package com.internousdev.struts2.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.internousdev.struts2.dao.TestDAO;
import com.opensymphony.xwork2.ActionSupport;

public class commentUp extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String comment;
    public Map<String, Object> sessionMap; 
    
    public String execute() throws SQLException{
    	TestDAO dao = new TestDAO();
    	dao.select(comment);
    	sessionMap.put("commentUp",dao.getDBComment());
    	System.out.println("ok");
    	return SUCCESS;
    	
    }
    
	public Map<String, Object> getSessionMap() {
		return sessionMap;
	}

	public void setSession(Map<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

}
