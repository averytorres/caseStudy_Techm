<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<t:genericpage>
<title>ERROR!</title>
<jsp:attribute name="header">
<h2>After 3 repeated failed login attempts you have been locked out for 10 seconds!</h2>
</jsp:attribute>
<jsp:body>	
<font color="red"><a href="pages/repLogin.jsp">Try Again!</a></font>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>