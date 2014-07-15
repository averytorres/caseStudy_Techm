package com.caseStudy;

public class repTable {
	private String repPass,repName,repEmail;
	private int repID;
	
	
	public repTable(String inPass,String inName, String inEmail){
		super();
		//this.repID=inID;
		this.repPass=inPass;
		this.repName=inName;
		this.repEmail=inEmail;
	}
	public repTable(){
		
	}
	
	
	public String getRepPass() {
		return repPass;
	}
	public void setRepPass(String repPass) {
		this.repPass = repPass;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public String getRepEmail() {
		return repEmail;
	}
	public void setRepEmail(String repEmail) {
		this.repEmail = repEmail;
	}
	public int getRepID() {
		return repID;
	}
	public void setRepID(int repID) {
		this.repID = repID;
	}

}
