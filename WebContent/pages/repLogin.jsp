<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<title>Rep Login</title>

<t:genericpage>
<jsp:attribute name="header">
	<h2>Rep Login</h2></br>
	</jsp:attribute>
<jsp:body>	
	<html:errors />
	<html:form action="/repLogin" >
		&#160;<bean:message key="replogin.repName"/>
		<html:text property="repName" value=""/>
		</br>
		<bean:message key="replogin.repPass"/>
		&#160;&#160;&#160;&#160;&#160;&#160;&#160;<html:password property="repPass" value=""/>
		</br>
		<html:submit/><html:reset/>
	</html:form>
	</table>
</br>
<a href="/caseStudy2/pages/repForgotPassword.jsp">Forgot Password</a>
</jsp:body>
<jsp:attribute name="footer">
</jsp:attribute>
</t:genericpage>