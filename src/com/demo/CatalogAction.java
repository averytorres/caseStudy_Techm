package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class CatalogAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		CatalogActionForm cat=(CatalogActionForm) form;
				
		DataSource ds=getDataSource(request,"userDB");
		System.out.println("connected");
		Connection con=ds.getConnection();
		String sql="Select * from category";
		PreparedStatement stmt= con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery();
		
		
		Catalog obj;
		List<Catalog> listOfCat=new ArrayList<Catalog>();
		
		while (rs.next()){
			System.out.println("in rs");
			
			obj=new Catalog(rs.getInt(1),rs.getString(2),rs.getString(3));
			listOfCat.add(obj);
			System.out.println(obj.catid);
		}
		
		cat.setListOfCat(listOfCat);
		System.out.println("forward");
		return mapping.findForward("catalog");
	
	}
	

}
