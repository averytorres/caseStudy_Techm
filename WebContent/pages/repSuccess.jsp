<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Success!</title>
<t:genericpage>
<jsp:attribute name="header">
<h2>Your Customer Has Been Successfully Entered!</h2>
</jsp:attribute>
<jsp:body>	
<a href="/caseStudy2/pages/repHome.jsp">Click Here To Return Home!</a>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>