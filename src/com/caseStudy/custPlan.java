package com.caseStudy;

public class custPlan {

	private String email,lName,SSN,address,phone,fName,securityQ,securityA,password,tvPlan,internetPlan;

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

	public custPlan(String email, String lName, String sSN, String address,
			String phone, String fName, String securityQ, String securityA,
			String password, String tvPlan, String internetPlan) {
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
	}
	public custPlan(){
		
	}
}
