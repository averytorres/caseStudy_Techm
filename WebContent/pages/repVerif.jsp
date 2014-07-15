
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Verify Customer Information</title>
<t:genericpage>
<jsp:attribute name="header">
<H2>Customer Confirmation</H2>
</jsp:attribute>
<jsp:body>
<b>First Name:</b><bean:write name="out" property="fName"/></br>
<b>Last Name:</b><bean:write name="out" property="lName"/></br>
</br><b>SSN:</b><bean:write name="out" property="SSN"/></br>
</br><b>Address:</b><bean:write name="out" property="address"/></br>
<b>Phone:</b><bean:write name="out" property="phone"/></br>
</br><b>Security Question:</b><bean:write name="out" property="securityQ"/></br>
<b>SecurityA:</b><bean:write name="out" property="securityA"/></br>
</br><b>TV Plan:</b><bean:write name="out2" property="tvPlan"/> Plan</br>
<b>Internet Plan:</b><bean:write name="out2" property="internetPlan"/> Plan</br>
</br><b>Email:</b><bean:write name="out" property="email"/></br>
<b>Password:</b><bean:write name="out" property="password"/></br>
<!--<b>Payment:$</b><bean:write name="out2" property="payment"/>.00</br>-->
</br><html:form action="/repSuccess">
<html:submit/>
</html:form>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>