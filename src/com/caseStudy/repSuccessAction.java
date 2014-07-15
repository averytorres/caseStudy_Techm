package com.caseStudy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class repSuccessAction extends Action {

	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ses.flush();
		return mapping.findForward("submit");
	}

}
