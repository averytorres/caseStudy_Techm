package com.caseStudy;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class custLoginAction extends Action{
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	String inUser,inPass;
	String email, lName, SSN, address,phone,fName,securityQ,securityA,password,tvPlan="",internetPlan="",payment="";
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		inUser=request.getParameter("email");
		inPass=request.getParameter("password");
	
		Criteria c = ses.createCriteria(repCustInfoActionForm.class);
		List<repCustInfoActionForm> lst = c.list();
		for(Iterator it=lst.iterator();it.hasNext();){
			
			repCustInfoActionForm e1=(repCustInfoActionForm)it.next();


			
			if(e1.getEmail().equals(inUser) && e1.getPassword().equals(inPass)){
				email=e1.getEmail();
				lName=e1.getlName();
				SSN=e1.getSSN();
				address=e1.getAddress();
				phone=e1.getPhone();
				fName=e1.getfName();
				securityQ=e1.getSecurityQ();
				securityA=e1.getSecurityA();
				password=e1.getPassword();
				tvPlan=e1.getTvPlan();
				internetPlan=e1.getInternetPlan();
				payment=e1.getPayment();
				Cookie cookieName= new Cookie("email", email);
				response.addCookie(cookieName);
				cookieName=new Cookie("lName",lName);
				response.addCookie(cookieName);
				cookieName=new Cookie("SSN",SSN);
				response.addCookie(cookieName);
				cookieName=new Cookie("address",address);
				response.addCookie(cookieName);
				cookieName=new Cookie("phone",phone);
				response.addCookie(cookieName);
				cookieName=new Cookie("fName",fName);
				response.addCookie(cookieName);
				cookieName=new Cookie("securityQ",securityQ);
				response.addCookie(cookieName);
				cookieName=new Cookie("securityA",securityA);
				response.addCookie(cookieName);
				cookieName=new Cookie("password",password);
				response.addCookie(cookieName);
				cookieName=new Cookie("tvPlan",tvPlan);
				response.addCookie(cookieName);
				cookieName=new Cookie("internetPlan",internetPlan);
				response.addCookie(cookieName);
				cookieName=new Cookie("payment",payment);
				response.addCookie(cookieName);
				
				return mapping.findForward("success");
			}
		}
		
		Boolean found=false;
		Cookie[] cookies = request.getCookies();
		
		for(int i=0;i<cookies.length;i++){
			
			if(cookies[i].getName().equals("lockout")){
				int count=Integer.parseInt(cookies[i].getValue());
				System.out.println("PARSED COUNT:"+cookies[i].getValue());
				System.out.println("RECIEVED COUNT:"+count);
				count++;
				System.out.println("INCREMENTED COUNT:"+count);
				cookies[i].setValue(count+"");
				System.out.println("COOKIE INCREMENTED: "+cookies[i].getValue());
				found=true;
				if(Integer.parseInt(cookies[i].getValue())>=3){
					cookies[i].setValue(3+"");
					cookies[i].setMaxAge(10);
					System.out.println("COOKIE LOCKOUT: "+cookies[i].getValue());
					response.addCookie(cookies[i]);
					return mapping.findForward("lockout");
				}
				response.addCookie(cookies[i]);
			}
		}
		System.out.println("FOUND:"+found);
		if(!found){
			System.out.println("IN NOT FOUND LOOP");
			Cookie cookieName= new Cookie("lockout", 0+"");
			response.addCookie(cookieName);
			System.out.println("COOKIE INITIALIZATION: "+cookieName.getValue());
		}
		
		return mapping.findForward("failure");
	}
	
}
	

