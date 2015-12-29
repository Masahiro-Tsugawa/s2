package com.internousdev.struts2.action;

import java.sql.SQLException;
import java.util.Map;

import com.internousdev.struts2.dao.TestDAO;
import com.opensymphony.xwork2.ActionSupport;



public class TestAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7415007824141763459L;
	private Map<String, Object> session;
	private String test;
	private String comment;
	int count;
	public String action=ERROR;
	

	public String execute() throws SQLException {
		TestDAO dao = new TestDAO();
		System.out.println("■PrototypeDAOに突入");

		count=dao.insert(comment);
		if (count > 0) {
			action= SUCCESS;
		}
		
		return action;
	}
	
	


	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}