<%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>

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
			font-size: small;
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

  <body>
    <div id="pageheader">
      <jsp:invoke fragment="header"/>
    </div>
    <div id="body">
      <jsp:doBody/>
    </div>
    <div id="pagefooter">
      <jsp:invoke fragment="footer"/>
       <p id="copyright">Providing Solutions Since 1927&reg;</p>
    </div>
  </body>
</html>