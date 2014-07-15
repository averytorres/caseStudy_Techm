package com.caseStudy;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

@SuppressWarnings("serial")
public class repCustInfoActionForm extends ActionForm{

	String email, lName, SSN, address,phone,fName,securityQ,securityA,password,tvPlan,internetPlan,payment;


	public repCustInfoActionForm(String email, String lName, String sSN,
			String address, String phone, String fName, String securityQ,
			String securityA, String password, String tvPlan,
			String internetPlan, String payment) {
		super();
		this.email = email;
		this.lName = lName;
		SSN = sSN;
		this.address = address;
		this.phone = phone;
		this.fName = fName;
		this.securityQ = securityQ;
		this.securityA = securityA;
		this.password = password;
		this.tvPlan = tvPlan;
		this.internetPlan = internetPlan;
		this.payment = payment;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(email==null || email.equals("")){
			errors.add("email", new ActionMessage("error.custEmail.required"));
			
		}
		if(lName==null || lName.equals("")){
			errors.add("lName", new ActionMessage("error.custlName.required"));
			
		}
		if(SSN==null || SSN.equals("")){
			errors.add("SSN", new ActionMessage("error.custSSN.required"));
			
		}
		if(address==null || address.equals("")){
			errors.add("address", new ActionMessage("error.custAddress.required"));
			
		}
		if(phone==null || phone.equals("")){
			errors.add("phone", new ActionMessage("error.custPhone.required"));
			
		}
		if(fName==null || fName.equals("")){
			errors.add("fName", new ActionMessage("error.custFName.required"));
			
		}
		if(securityQ==null || securityQ.equals("")){
			errors.add("securityQ", new ActionMessage("error.custSecurityQ.required"));
			
		}
		if(securityA==null || securityA.equals("")){
			errors.add("securityA", new ActionMessage("error.custSecurityA.required"));
			
		}
		if(password==null || password.equals("")){
			errors.add("password", new ActionMessage("error.custPassword.required"));
			
		}
		
	
		return errors;
	}

	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}

	public repCustInfoActionForm(){
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getSecurityQ() {
		return securityQ;
	}

	public void setSecurityQ(String securityQ) {
		this.securityQ = securityQ;
	}

	public String getSecurityA() {
		return securityA;
	}

	public void setSecurityA(String securityA) {
		this.securityA = securityA;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTvPlan() {
		return tvPlan;
	}

	public void setTvPlan(String tvPlan) {
		this.tvPlan = tvPlan;
	}

	public String getInternetPlan() {
		return internetPlan;
	}

	public void setInternetPlan(String internetPlan) {
		this.internetPlan = internetPlan;
	}
}
