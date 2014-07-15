package com.caseStudy;

public class repWelcomeActionForm {
	int pos;
	String tvPlan,internetPlan,payment;



	public repWelcomeActionForm(int pos, String tvPlan, String internetPlan,
			String payment) {
		super();
		this.pos = pos;
		this.tvPlan = tvPlan;
		this.internetPlan = internetPlan;
		this.payment = payment;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
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
	public repWelcomeActionForm(){
		
	}

}
