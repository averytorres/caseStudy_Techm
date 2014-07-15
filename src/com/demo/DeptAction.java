package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class DeptAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm frm = (DynaActionForm) form;
		frm.set("deptno", "50");
		frm.set("dname","QMG");
		frm.set("loc", "Pune");
		DataSource ds = getDataSource(request, "userDB");
		Connection con = ds.getConnection();
		String sql = "insert into dept values(?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setInt(1, Integer.parseInt(frm.getString("deptno")));
		stmt.setString(2, frm.getString("dname"));
		stmt.setString(3, frm.getString("loc"));
		
		int rs = stmt.executeUpdate();
		System.out.println("inserted");
		
		return mapping.findForward("department");
	}

	
}
