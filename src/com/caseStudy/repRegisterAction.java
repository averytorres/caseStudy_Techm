package com.caseStudy;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;

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
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;





public class repRegisterAction extends Action {
	
	Configuration config = new Configuration().configure();
	SessionFactory sFactory = config.buildSessionFactory();
	Session ses = sFactory.openSession();
	
	
	String inUser,inPass;
	@Override
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Transaction tran = ses.beginTransaction();
		String repName=request.getParameter("repName");
		String repPass=request.getParameter("repPass");
		String repEmail=request.getParameter("repEmail");
		

		Criteria c1 = ses.createCriteria(repTable.class).add(Restrictions.eq("repEmail",repEmail));
		List<repTable> lst = c1.list();
		for(Iterator it=lst.iterator();it.hasNext();){
			repTable e1=(repTable)it.next();
			
			if(e1.getRepEmail().equals(repEmail)){

				return mapping.findForward("failure");
			}
		}
		
		
		/*Criteria c = ses.createCriteria(repTable.class).setProjection(Projections.max("repID"));
		Integer max = (Integer)c.uniqueResult();
		
		int newMax=max.intValue();
		newMax++;
		System.out.println("CURRENT MAX:"+max);
		System.out.println("NEW MAX:"+newMax);
		*/
		repTable rt=new repTable(repPass,repName,repEmail);
		//rt.setRepID(newMax);
		ses.save(rt);
		
		tran.commit();
		//ses.flush();
		//ses.close();
		
		return mapping.findForward("success");
	}

}


