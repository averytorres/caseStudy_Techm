package com.caseStudy;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class repWelcomeAction extends Action{

	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	String tvPlan,internetPlan,payment;
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		Transaction tran = ses.beginTransaction();
		
		tvPlan=request.getParameter("tvPlan");
		internetPlan=request.getParameter("internetPlan");
		String email =request.getParameter("email");
		
		repWelcomeActionForm temp = new repWelcomeActionForm();
		temp.setInternetPlan(internetPlan);
		temp.setTvPlan(tvPlan);
		if(tvPlan.equals("No")){
			payment="0";
			
		}else if(tvPlan.equals("Basic")){
			payment="75";
		}else if(tvPlan.equals("Economic")){
			payment="80";
		}	else {
				payment="100";
			}
		
		int temp1 = Integer.parseInt(payment);
		
		if(internetPlan.equals("No")){
			
			payment=temp1+"";
			
		}else if(internetPlan.equals("20Mbps")){
			temp1=temp1+75;
			payment=temp1+"";
		}else if(internetPlan.equals("30Mbps")){
			temp1=temp1+80;
			payment=temp1+"";
		}	
		else if(internetPlan.equals("45Mbps")){
			temp1=temp1+90;
			payment=temp1+"";
		}else {
			temp1=temp1+100;
			payment=temp1+"";
			}
		
		temp.setPayment(payment);
		System.out.println("SYSO: IN TEMP: "+temp.getPayment());
		ses.save(temp);
		tran.commit();
		return mapping.findForward("submit");
		
	}
}
