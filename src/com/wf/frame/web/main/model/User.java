package com.wf.frame.web.main.model;

import com.wf.frame.web.BaseDomain;

public class User extends BaseDomain {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userID;
	
	private String userName;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
