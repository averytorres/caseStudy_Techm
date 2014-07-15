package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LoginActionForm frm=(LoginActionForm)form;
		String user =frm.getUserName();
		String pass=frm.getPassword();
		
		DataSource ds=getDataSource(request,"userDB");
		Connection con=ds.getConnection();
		String sql="Select username,password from usertable";
		PreparedStatement stmt= con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery(sql);
		boolean flag=false;
		while (rs.next()){
		
				
				if (user.equals(rs.getString(1))&& pass.equals(rs.getString(2)))
					{flag=true;
					 break;}
		}
		if (flag)
			return mapping.findForward("success");
		
		else return mapping.findForward("fail");
		
	}
	
	

}
