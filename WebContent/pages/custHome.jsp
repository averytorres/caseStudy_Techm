
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Rep Home Page</title>
<t:genericpage>
<jsp:attribute name="header">
<h2>Home Page</h2>
</jsp:attribute>
<jsp:body>	
<a href="/caseStudy2/pages/custDisplay.jsp">View Current Plan</a>
</br>
<a href="/caseStudy2/pages/custUpdate.jsp">Update Your Plan</a>
</br>
<a href="/caseStudy2/pages/custPay.jsp">Make A Payment</a>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>