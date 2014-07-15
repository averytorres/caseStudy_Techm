package com.caseStudy;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class repCustInfoAction extends Action{
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		Transaction tran = ses.beginTransaction();
		String email, lName, SSN, address,Phone,fName,securityQ,securityA,password,tvPlan="",internetPlan="",payment="";
		Criteria c = ses.createCriteria(repWelcomeActionForm.class).addOrder(Order.desc("pos"));
		
		boolean rec=false;
		
		
		
		List<repWelcomeActionForm> lst = c.list();
		
		for(Iterator it=lst.iterator();it.hasNext();){
		
			repWelcomeActionForm e1=(repWelcomeActionForm)it.next();
		
			if(!rec){
				
				tvPlan=e1.getTvPlan();
				internetPlan=e1.getInternetPlan();
				payment=e1.getPayment();
				
				rec=true;
			}
			
		}
		email=request.getParameter("email");
		lName=request.getParameter("lName");
		SSN=request.getParameter("SSN");
		address=request.getParameter("address");
		Phone=request.getParameter("phone");
		fName=request.getParameter("fName");
		securityQ=request.getParameter("securityQ");
		securityA=request.getParameter("securityA");
		password=request.getParameter("password");
		
		System.out.println("in cust info action:"+payment);
		//String email, lName, SSN, Address,Phone,fName,securityQ,securityA,password,tvPlan,internetPlan;
		repCustInfoActionForm c1 = new repCustInfoActionForm();
		c1.setEmail(email);
		c1.setlName(lName);
		c1.setSSN(SSN);
		c1.setAddress(address);
		c1.setPhone(Phone);
		c1.setfName(fName);
		c1.setSecurityQ(securityQ);
		c1.setSecurityA(securityA);
		c1.setPassword(password);
		c1.setTvPlan(tvPlan);
		c1.setInternetPlan(internetPlan);
		c1.setPayment(payment);
		System.out.println("PAYMENT*************************: "+c1.getPayment());
		try{
			
		ses.save(c1);
		
		tran.commit();
		return mapping.findForward("submit");
		}
		catch(Exception e){
			return mapping.findForward("fail");
		}
		
	}
	

}
