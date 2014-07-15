
<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<title>Customer Info</title>
<t:genericpage>
<jsp:attribute name="header">
<h2>Customer Information</h2>
</jsp:attribute>
<jsp:body>	
<html:errors />
	<html:form action="/repCustInfo">
		<bean:message key="repcustinfo.repFName"/>
		<html:text property="fName" value=""/>
		</br>
		<bean:message key="repcustinfo.repLName"/>
		<html:text property="lName" value=""/>
		</br></br>
		<bean:message key="repcustinfo.repSSN"/>
		<html:text property="SSN" value=""/>
		</br></br>
		<bean:message key="repcustinfo.repAddress"/>
		<html:text property="address" value=""/>
		</br>
		<bean:message key="repcustinfo.repPhone"/>
		<html:text property="phone" value=""/>
		</br></br>
		
		<bean:message key="repcustinfo.repSecurityQ"/>
		<html:select property="securityQ">
		<html:option value="What city where you born in?">What city where you born in?</html:option>
		<html:option value="What is your pet's name?">What is your pet's name?</html:option>
		<html:option value="What is your mother's maiden name?">What is your mother's maiden name?</html:option>
		</html:select>
		</br>
		<bean:message key="repcustinfo.repSecurityA"/>
		<html:text property="securityA" value=""/>
		</br></br>
		<bean:message key="repcustinfo.repEmail"/>
		<html:text property="email" value=""/>
		</br>
		<bean:message key="repcustinfo.repPassword"/>
		<html:text property="password" value=""/>
		</br>
		<html:hidden property="tvPlan"/>
		<html:hidden property="internetPlan"/>
		
		
		<html:submit/><html:reset/>
	</html:form>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>