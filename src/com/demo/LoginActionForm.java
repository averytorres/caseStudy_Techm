package com.demo;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts.action.ActionErrors;
import org.apache.struts.validator.ValidatorForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginActionForm extends ValidatorForm {
	
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		
		ActionErrors errors= new ActionErrors();
		
		if (userName.equals("") || userName==(null))
			errors.add(userName,new ActionMessage("login.userName.problem"));
		
		else if (password.equals("") || password==(null))
			errors.add(password,new ActionMessage("login.password.problem"));
		
		return errors;
	}
	

}
