package com.caseStudy;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class repRegisterActionForm extends ActionForm{
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		if(repName==null || repName.equals("")){
			errors.add("repName", new ActionMessage("error.repName.required"));
			
		}
		if(repPass==null || repPass.equals("")){
			errors.add("repPass", new ActionMessage("error.repPass.required"));
			
		}
		if(repEmail==null || repEmail.equals("")){
			errors.add("repPass", new ActionMessage("error.repEmail.required"));
			
		}
		return errors;
	}

	private String repName,repPass,repEmail;

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}

	public String getRepPass() {
		return repPass;
	}

	public void setRepPass(String repPass) {
		this.repPass = repPass;
	}

	public String getRepEmail() {
		return repEmail;
	}

	public void setRepEmail(String repEmail) {
		this.repEmail = repEmail;
	}

}
