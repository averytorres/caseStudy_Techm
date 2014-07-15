package com.caseStudy;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class repArchiveAction extends Action {
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter ("C:\\Users\\Administrator\\workspace\\caseStudy2\\WebContent\\pages\\Customers.xml");
		PrintWriter pw = new PrintWriter (file);
		

		pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.println("<?xml-stylesheet type=\"text/css\" href=\"cust_catalog.css\"?>");

		Criteria c = ses.createCriteria(repCustInfoActionForm.class);
		List<repCustInfoActionForm> lst = c.list();

		pw.println("<Customer_Table>");

		for(Iterator it=lst.iterator();it.hasNext();){
			repCustInfoActionForm e1=(repCustInfoActionForm)it.next();
			pw.println("<Customer>");
			pw.println("<First_Name><b>Name: </b>"+e1.getfName()+"</First_Name>");
			pw.println("<Last_Name> "+e1.getlName()+"</Last_Name>");
			pw.println("<SSN><b>SSN: </b>"+e1.getSSN()+"</SSN>");
			pw.println("<Address><b>Address: </b>"+e1.getAddress()+"</Address>");
			pw.println("<Phone><b>Phone: </b>"+e1.getPhone()+"</Phone>");
			pw.println("<SecurityQ><b>Security Question: </b>"+e1.getSecurityQ()+"</SecurityQ>");
			pw.println("<SecurityA><b>Security Answer: </b>"+e1.getSecurityA()+"</SecurityA>");
			pw.println("<Email><b>Email: </b>"+e1.getEmail()+"</Email>");
			pw.println("<Password><b>Password: </b>"+e1.getPassword()+"</Password>");
			pw.println("<TvPlan><b>Tv Plan: </b>"+e1.getTvPlan()+" Plan</TvPlan>");
			pw.println("<InternetPlan><b>Internet Plan: </b>"+e1.getInternetPlan()+" Plan</InternetPlan>");
			pw.println("</Customer>");
		}
		pw.println("</Customer_Table>");

		pw.close();
		return mapping.findForward("submit");
	}
	
}
