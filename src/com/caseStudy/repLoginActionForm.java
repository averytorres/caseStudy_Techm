package com.caseStudy;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class repLoginActionForm extends ActionForm {
	private String repName,repPass;

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		
		if(repName==null || repName.equals("")){
			errors.add("repName", new ActionMessage("error.repEmail.required"));
			
		}
		if(repPass==null || repPass.equals("")){
			errors.add("repPass", new ActionMessage("error.repPass.required"));
			
		}
		return errors;
	}


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
	
}
