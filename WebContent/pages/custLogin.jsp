<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Customer Login</title>
<t:genericpage>
<jsp:attribute name="header">
	<h2>Customer Login</h2></br>
	</jsp:attribute>
	<jsp:body>	
	<html:errors/>
	<html:form action="/custLogin">
		&#160;<bean:message key="custlogin.custEmail"/>
		&#160;&#160;&#160;&#160;&#160;<html:text property="email" value=""/>
		</br>
	<bean:message key="custlogin.custPass"/>
		<html:password property="password" value=""/>
		</br>
		<html:submit/><html:reset/>
	</html:form>
</br>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>