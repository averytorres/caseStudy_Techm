<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>ERROR!</title>
<t:genericpage>

<jsp:attribute name="header">
<h2>Invalid Information Entered!</h2>
</jsp:attribute>
<jsp:body>	
<font color="red"><a href="pages/custLogin.jsp">Try Again!</a></font>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>