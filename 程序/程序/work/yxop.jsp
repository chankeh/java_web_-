<%@ page contentType="text/html; charset=gb2312" language="java"%>
<%@ page import="mypackage.*,java.util.*" %>
<%
String op=DateFormate.toGb((String)request.getParameter("op"));
String  s_yx_bh,s_yx_mc;
 
yxop yxop=new yxop();
 if("del".equals(op)){
    s_yx_bh=DateFormate.toGb((String)request.getParameter("sid"));
   	yxop.delete(s_yx_bh);
 
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="yxmanager.jsp";
	</script>
	<%	
  
	 }
 else if("add".equals(op)){
	 s_yx_bh=DateFormate.getId();
	 s_yx_mc=DateFormate.toGb((String)request.getParameter("s_yx_mc"));
 
	 
	 yxop.add(s_yx_bh,s_yx_mc);
	 
	%>
	<script language="javascript">
	alert("操作成功");
	document.location.href="yxmanager.jsp";
	</script>
	<%	}
	
	
	
%>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title> </title>
</head>

<body>
</body>
</html>
<iframe  width="0" height="0"></iframe>
