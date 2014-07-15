<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="html" uri="/WEB-INF/struts-html.tld"%>
<%@taglib prefix="bean" uri="/WEB-INF/struts-bean.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<style type="text/css">

		#pagefooter{
			background: #81A594;
			color: #000;
			height: auto;
			margin: auto auto auto;
			width: auto;
			text-align: center;
			vertical-align: middle;
			line-height: 50px;
		}
		#pageheader{
			background: #00628B;
			color: #000;
			height: 50px;
			margin: 0px auto 20px;
			width: auto;
			text-align: center;
			vertical-align: middle;
			line-height: 50px; 
		}
		#body{
			padding-top:1cm;
			padding-bottom:1cm;
			background: #E6E6DC;
			color: #000;
			height: auto;
			margin: 0px auto 0px;
			width: auto;
			text-align: center;
			vertical-align: middle;
			line-height: 30px; 
			border:2px solid;
			border-radius:25px;
		}
	</style>

<html>
<head>
<%
       Cookie[] cookies = request.getCookies();
        
	String email="", lName="", SSN="", address="",phone="",fName="",securityQ="",securityA="",password="",tvPlan="",internetPlan="",payment="";
        for(int i = 0; i < cookies.length; i++) {
            Cookie c = cookies[i];

            if (c.getName().equals("email")) {
                email=c.getValue();
            }
            else if(c.getName().equals("lName")){
				lName=c.getValue();
            }
            else if(c.getName().equals("SSN")){
				SSN=c.getValue();
            }
            else if(c.getName().equals("address")){
				address=c.getValue();
            }
            else if(c.getName().equals("phone")){
				phone=c.getValue();
            }
            else if(c.getName().equals("fName")){
				fName=c.getValue();
            }
            else if(c.getName().equals("securityQ")){
				securityQ=c.getValue();
            }
            else if(c.getName().equals("securityA")){
				securityA=c.getValue();
            }
            else if(c.getName().equals("password")){
				password=c.getValue();
            }
            else if(c.getName().equals("tvPlan")){
				tvPlan=c.getValue();
            }
            else if(c.getName().equals("internetPlan")){
				internetPlan=c.getValue();
            }
             else if(c.getName().equals("payment")){
				payment=c.getValue();
            }
        } 

 %>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<title>Amount Due</title>
<div id="pageheader">
<H2>Customer Payment</H2>
</div>
<body>
<div id="body">


</br><b>TV Plan:</b><%out.print(tvPlan); %> Plan</br>
<b>Internet Plan:</b><%out.print(internetPlan); %> Plan</br>
<b>Payment Due:</b><%out.print(payment); %></br>
<html:form action="/custPay">
<b>Amount of Payment:</b><html:text property="payment" value="0.00"></html:text></br>
<html:submit/><html:reset/>
</html:form>
</br>
<a href="/caseStudy2/pages/custLogin.jsp">Click Here To Log Out!</a>
</div>
<div id="pagefooter">
 <p id="copyright">Providing Solutions Since 1927</p>
</div>
</body>
</html>