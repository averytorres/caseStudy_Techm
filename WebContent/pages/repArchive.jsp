
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Customers Archived!</title>
<t:genericpage>
<jsp:attribute name="header">
<h2>Customers Successfully Archived</h2>
</jsp:attribute>
<jsp:body>	
<html:form action="/repArchive">
<html:hidden property="fName" value="--"/>
<html:hidden property="lName" value="--"/>
<html:hidden property="SSN" value="--"/>
<html:hidden property="email" value="--"/>
<html:hidden property="password" value="--"/>
<html:hidden property="tvPlan" value="--"/>
<html:hidden property="internetPlan" value="--"/>
<html:hidden property="payment" value="--"/>
<html:hidden property="address" value="--"/>
<html:hidden property="phone" value="--"/>
<html:hidden property="securityQ" value="--"/>
<html:hidden property="securityA" value="--"/>


<html:submit/>
</html:form>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>