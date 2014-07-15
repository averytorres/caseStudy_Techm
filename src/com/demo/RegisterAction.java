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

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		RegisterActionForm frm = (RegisterActionForm) form;
		String un=frm.getUn();
		String pw=frm.getPw();
		String email=frm.getEmail();
		String gender=frm.getGender();
		String interest=frm.getInterest();
		
		
		DataSource ds=getDataSource(request,"userDB");
		Connection con=ds.getConnection();
		String sql="insert into usertable values('"+un+"','"+pw+"','"+email+"','"+gender+"','"+interest+"')";
		PreparedStatement stmt= con.prepareStatement(sql);
		ResultSet rs=stmt.executeQuery(sql);
		
		return mapping.findForward("regist");
	}

	
}
