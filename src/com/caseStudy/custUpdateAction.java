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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class custUpdateAction extends Action{
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
					throws Exception {
		// TODO Auto-generated method stub
		
		Transaction tran = ses.beginTransaction();


		Cookie[] cookies = request.getCookies();

		String email="", lName="", SSN="", address="",phone="",fName="",securityQ="",securityA="",password="",tvPlan="",internetPlan="",payment="";
		for(int i = 0; i < cookies.length; i++) {
			Cookie c = cookies[i];

			if (c.getName().equals("email")) {
				email=c.getValue();
			}
			else if(c.getName().equals("lName")){
				lName=c.getValue();
			}
			else if(c.getName().equals("SSN")){
				SSN=c.getValue();
			}
			else if(c.getName().equals("address")){
				address=c.getValue();
			}
			else if(c.getName().equals("phone")){
				phone=c.getValue();
			}
			else if(c.getName().equals("fName")){
				fName=c.getValue();
			}
			else if(c.getName().equals("securityQ")){
				securityQ=c.getValue();
			}
			else if(c.getName().equals("securityA")){
				securityA=c.getValue();
			}
			else if(c.getName().equals("password")){
				password=c.getValue();
			}
			else if(c.getName().equals("tvPlan")){
				tvPlan=c.getValue();
			}
			else if(c.getName().equals("internetPlan")){
				internetPlan=c.getValue();
			}
		} 

		Criteria c = ses.createCriteria(repCustInfoActionForm.class).add(Restrictions.eq("email",email));
		boolean rec=false;

		tvPlan=request.getParameter("tvPlan");
		internetPlan=request.getParameter("internetPlan");

		if(tvPlan.equals("No")){
			payment="0";
			
		}else if(tvPlan.equals("Basic")){
			payment="75";
		}else if(tvPlan.equals("Economic")){
			payment="80";
		}	else {
				payment="100";
			}
		
		Double temp1 = Double.parseDouble(payment);
		
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
		
		List<repCustInfoActionForm> lst = c.list();
		for(Iterator it=lst.iterator();it.hasNext();){
			repCustInfoActionForm e1=(repCustInfoActionForm)it.next();
			e1.setTvPlan(tvPlan);
			e1.setInternetPlan(internetPlan);
			e1.setAddress(address);
			e1.setEmail(email);
			e1.setfName(fName);
			e1.setlName(lName);
			e1.setPassword(password);
			e1.setPhone(phone);
			e1.setSecurityA(securityA);
			e1.setSecurityQ(securityQ);
			e1.setSSN(SSN);
			e1.setPayment(payment);
			System.out.println("PAYEMNT***************:"+payment);
			Cookie cookieName= new Cookie("tvPlan", tvPlan);
			response.addCookie(cookieName);
			cookieName= new Cookie("internetPlan",internetPlan);
			response.addCookie(cookieName);
			cookieName= new Cookie("payment",payment);
			response.addCookie(cookieName);
			ses.update(e1);
			tran.commit();
			return mapping.findForward("success");
		} 

		return mapping.findForward("success");

	}
}
