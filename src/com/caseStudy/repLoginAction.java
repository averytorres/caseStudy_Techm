package com.caseStudy;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
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
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class repLoginAction extends Action {
	
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	String inUser,inPass;
	@Override
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		inUser=request.getParameter("repName");
		inPass=request.getParameter("repPass");

		

		Criteria c = ses.createCriteria(repTable.class);
		List<repTable> lst = c.list();
		for(Iterator it=lst.iterator();it.hasNext();){
			
			repTable e1=(repTable)it.next();
			
			if(e1.getRepEmail().equals(inUser) && e1.getRepPass().equals(inPass)){
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
