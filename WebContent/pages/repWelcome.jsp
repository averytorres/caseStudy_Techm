
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Choose Products</title>
<t:genericpage>
<jsp:attribute name="header">
<h2>Available Products</h2>
</jsp:attribute>
<jsp:body>
<html:form action="/repWelcome">
		<bean:message key="repHome.tvPlan"/>
		<html:select property="tvPlan">
	    <html:option value="No">None</html:option>
		<html:option value="Basic">Basic Plan - 20 Channels</html:option>
		<html:option value="Economic">Economic Plan - 30 Channels</html:option>
		<html:option value="Premium">Premium Plan - 40 Channels</html:option>
	</html:select>
		</br>
		<bean:message key="repHome.internetPlan"/>
		<html:select property="internetPlan">
	    <html:option value="No">None</html:option>
		<html:option value="20Mbps">20 Mbps</html:option>
		<html:option value="30Mbps">30 Mbps</html:option>
		<html:option value="45Mbps">45 Mbps</html:option>
		<html:option value="70Mbps">70 Mbps</html:option>
	</html:select>
		</br>
		<html:submit/>
	</html:form>
	</jsp:body>
	<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>