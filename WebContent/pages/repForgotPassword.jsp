<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Register</title>
<t:genericpage>
<jsp:attribute name="header">
	<h2>Enter Your New Information</h2></br>
	</jsp:attribute>
	<jsp:body>	
	<html:errors />
		<html:form action="/repRegister">
		<bean:message key="repregister.repName"/>
		<html:text property="repName" value=""/>
		</br>
		<bean:message key="repregister.repEmail"/>
		<html:text property="repEmail" value=""/>
		</br>
		<bean:message key="repregister.repPass"/>
		<html:text property="repPass" value=""/>
		</br>
		<html:submit/><html:reset/>
	</html:form>
	<font color="red"><a href="/caseStudy2/pages/repLogin.jsp">Return</a></font>
	</jsp:body>
	<jsp:attribute name="footer">
	</jsp:attribute>
	
</t:genericpage>